package com.demo.kotlin.repository

import com.demo.kotlin.model.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, Long> {
}