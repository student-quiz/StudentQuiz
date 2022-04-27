package com.app.studentquiz.models

import android.os.Parcel
import android.os.Parcelable

data class Question(
    val Question: String = "",
    val Solution: String = "",
    val categories : ArrayList<Category> = ArrayList()
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.createTypedArrayList(Category.CREATOR)!!
    ) {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(Question)
        writeString(Solution)
        writeTypedList(categories)
    }

    companion object CREATOR : Parcelable.Creator<Question> {
        override fun createFromParcel(parcel: Parcel): Question {
            return Question(parcel)
        }

        override fun newArray(size: Int): Array<Question?> {
            return arrayOfNulls(size)
        }
    }
}
