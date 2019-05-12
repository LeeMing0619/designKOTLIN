package com.lee.desingkotlin.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Item(
    var imageId: Int,
    var title: String,
    var details: String,
    var price: Double,
    var category: Category,
    var postedOn: Long
) : Parcelable