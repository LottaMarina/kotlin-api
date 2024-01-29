package com.demo.kotlin.controller

import com.demo.kotlin.model.Product
import com.demo.kotlin.repository.ProductRepository
import com.demo.kotlin.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class Controller @Autowired constructor(val productService: ProductService) {

    @GetMapping()
    fun getRoot(): ResponseEntity<Any>{
        return ResponseEntity.ok("Hello")
    }
    @GetMapping("/products")
    fun getProducts(): ResponseEntity<List<Product>>{
        val products = productService.getAllProducts()
        return ResponseEntity.ok(products)
    }
}