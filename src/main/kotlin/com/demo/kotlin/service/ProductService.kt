package com.demo.kotlin.service

import com.demo.kotlin.model.Product
import com.demo.kotlin.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService @Autowired constructor(val productRepository: ProductRepository) {

    fun getAllProducts(): List<Product>{
        val products = productRepository.findAll();
        return products;
    }
}
