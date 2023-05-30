package com.github.minsoozz.map.batch.model

import java.time.LocalDate

class StoreBatchModel(
    val storeName: String,
    val businessType: String,
    val addressRoad: String,
    val addressNumber: String,
    val postalCode: Int,
    val latitude: Double,
    val longitude: Double,
    val dataDate: LocalDate,
    val businessRegistrationNumber: Int,
    val businessCode: Int,
    val franchiseNumber: Int,
    val closureStatusCode: Int,
    val closureDate: LocalDate
) {
}