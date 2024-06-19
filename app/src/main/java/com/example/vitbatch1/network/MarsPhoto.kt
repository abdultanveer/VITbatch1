package com.example.vitbatch1.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

//serialization = baloon - defllate - inflate --make the object  transport ready
//inflate -- deserialzation  -- autocad - serial nos on the floppy

@Serializable
data class MarsPhoto(
    val id: String,
    @SerialName(value = "img_src")
    val imgSrc: String

)
