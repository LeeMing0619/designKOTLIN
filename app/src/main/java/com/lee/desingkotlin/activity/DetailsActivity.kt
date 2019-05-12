package com.lee.desingkotlin.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.lee.desingkotlin.R
import com.lee.desingkotlin.data.Item
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.content_details.*

class DetailsActivity : AppCompatActivity() {

    private var item: Item? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        item = intent.getParcelableExtra(getString(R.string.bundle_extra_item))
        populateDetails(item)

        setSupportActionBar(toolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    /**
     * Handles click on Share FAB, shares Title and Price of an item
     */
    fun onClickShareFab(view: View) {
        val shareText = item?.title + " for sell @ " + item?.price.toString() + getString(R.string.currency_symbol)
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareText)
        startActivity(shareIntent)
    }

    /**
     * Binds item details with views
     */
    private fun populateDetails(item: Item?) {
        supportActionBar?.title = item?.category?.name
        itemImageView.setImageResource(item?.imageId!!)
        priceTextView.text = getString(R.string.currency_symbol) + item?.price.toString()
        titleTextView.text = item?.title
        detailsTextView.text = item?.details
    }

}
