package com.demo.kotlin.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Product(
        @Id
        val id: Long = 0,
        @Column(name = "name")
        val name: String = "",
        @Column(name = "price")
        val price: Double = 0.0
)