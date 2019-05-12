package com.lee.desingkotlin.activity

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import com.lee.desingkotlin.R
import com.lee.desingkotlin.adapter.ItemsAdapter
import com.lee.desingkotlin.data.Category
import com.lee.desingkotlin.data.Item
import com.lee.desingkotlin.util.DataProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ItemsAdapter.OnItemClickListener,
    BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateItemList(Category.LAPTOP)

        //bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }

    private fun populateItemList(category: Category) {
        val items = when (category) {
            Category.LAPTOP -> DataProvider.laptopList
            Category.MONITOR -> DataProvider.monitorList
            Category.HEADPHONE -> DataProvider.headphoneList
        }
        if (items.isNotEmpty()) {
            itemsRecyclerView.adapter = ItemsAdapter(items, this)
        }
    }

    override fun onItemClick(item: Item, itemView: View) {
        val detailsIntent = Intent(this, DetailsActivity::class.java)
        detailsIntent.putExtra(getString(R.string.bundle_extra_item), item)
        startActivity(detailsIntent)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_laptops -> populateItemList(Category.LAPTOP)
            R.id.nav_monitors -> populateItemList(Category.MONITOR)
            R.id.nav_headphones -> populateItemList(Category.HEADPHONE)
            else -> return false
        }
        return true
    }

    fun onClickAddFab(view: View) {
        startActivity(Intent(this, AddItemActivity::class.java))
    }
}

