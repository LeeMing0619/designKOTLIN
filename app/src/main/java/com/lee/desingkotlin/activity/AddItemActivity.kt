package com.lee.desingkotlin.activity

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.lee.desingkotlin.R
import com.lee.desingkotlin.data.Category
import com.lee.desingkotlin.data.Item
import com.lee.desingkotlin.util.DataProvider
import kotlinx.android.synthetic.main.activity_add_item.*

class AddItemActivity : AppCompatActivity(),
    TextWatcher, AdapterView.OnItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_item)

        categorySpinner.adapter = ArrayAdapter<Category>(
            this,
            android.R.layout.simple_spinner_item,
            Category.values()
        )
        categorySpinner.onItemSelectedListener = this

        titleEditText.addTextChangedListener(this)
        priceEditText.addTextChangedListener(this)
        detailsEditText.addTextChangedListener(this)
    }

    /**
     * Handles Back button press, relaunch MainActivity for reload data
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                navigateBackToItemList()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun afterTextChanged(s: Editable?) {}

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        titleTextInput.error = null
        priceTextInput.error = null
    }
    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

    override fun onNothingSelected(parent: AdapterView<*>?) {}

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        imageButton.setImageResource(imageFromCategory(categorySpinner.selectedItem as Category))
    }

    fun onClickAddItem(view: View) {
        if (hasValidInput()) {
            val selectedCategory = categorySpinner.selectedItem as Category
            DataProvider.addItem(
                Item(
                imageId = imageFromCategory(selectedCategory),
                title = titleEditText.text.toString(),
                details = detailsEditText.text.toString(),
                price = priceEditText.text.toString().toDouble(),
                category = selectedCategory,
                postedOn = System.currentTimeMillis())
            )
            showAddItemConfirmation()
        }
    }

    /**
     * Returns image of an item Category
     */
    private fun imageFromCategory(category: Category): Int {
        return when (category) {
            Category.LAPTOP -> R.drawable.ic_laptop
            Category.MONITOR -> R.drawable.ic_monitor
            else -> R.drawable.ic_headphone
        }
    }

    /**
     * Navigates to MainActivity and reloads data
     */
    private fun navigateBackToItemList() {
        val mainIntent = Intent(this, MainActivity::class.java)
        mainIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(mainIntent)
        finish()
    }

    private fun hasValidInput(): Boolean {
        // 1
        val title = titleEditText.text.toString()
        if (title.isNullOrBlank()) {
            titleTextInput.error = "Please enter a valid Title"
            return false
        }
        // 2
        val price = priceEditText.text.toString().toDoubleOrNull()
        if (price == null || price <= 0.0) {
            priceTextInput.error = "Please enter a minimum Price"
            return false
        }
        // 3
        return true
    }

    private fun showAddItemConfirmation() {
        Snackbar.make(addItemRootView, getString(R.string.add_item_successful), Snackbar.LENGTH_LONG)
            .setAction(getString(R.string.ok)) {
                navigateBackToItemList()
            }
            .show()
    }
}
