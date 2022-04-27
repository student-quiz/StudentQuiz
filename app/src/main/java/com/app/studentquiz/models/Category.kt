package com.app.studentquiz.models

import android.os.Parcel
import android.os.Parcelable

data class Category(
    val Name: String = ""
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!
    ) {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(Name)
    }

    companion object CREATOR : Parcelable.Creator<Category> {
        override fun createFromParcel(parcel: Parcel): Category {
            return Category(parcel)
        }

        override fun newArray(size: Int): Array<Category?> {
            return arrayOfNulls(size)
        }
    }
}
