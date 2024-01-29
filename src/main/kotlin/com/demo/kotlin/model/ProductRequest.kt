package com.demo.kotlin.model

import com.fasterxml.jackson.annotation.JsonProperty

data class ProductRequest(
    @JsonProperty("name")
    val name: String = "",
    @JsonProperty("price")
    val price: Double = 0.0
)
