package com.example.myapplication.model


import com.google.gson.annotations.SerializedName

data class jobsItem(
    @SerializedName("arrivalDt")
    val arrivalDt: String,
    @SerializedName("departureDt")
    val departureDt: String,
    @SerializedName("jobNo")
    val jobNo: Int,
    @SerializedName("logisticPointCd")
    val logisticPointCd: String,
    @SerializedName("province")
    val province: String,
    @SerializedName("routeCd")
    val routeCd: String,
    @SerializedName("routeDt")
    val routeDt: String,
    @SerializedName("truckLicense")
    val truckLicense: String,
    @SerializedName("truckType")
    val truckType: String
)