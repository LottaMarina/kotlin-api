package com.demo.kotlin.repository

import com.demo.kotlin.model.ProductDAO
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<ProductDAO, Long> {
}