package org.example.lessons.less_5_12_dictionary

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class Entry(
    @SerialName("value") val value: String,
    @SerialName("description") val description: String
) {


}