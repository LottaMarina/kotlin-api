package com.demo.kotlin.model

import jakarta.persistence.*

@Entity
data class ProductDAO(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        @Column(name = "name")
        val name: String = "",
        @Column(name = "price")
        val price: Double = 0.0
)