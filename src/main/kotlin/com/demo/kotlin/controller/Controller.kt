package com.demo.kotlin.controller

import com.demo.kotlin.model.ProductDAO
import com.demo.kotlin.model.ProductRequest
import com.demo.kotlin.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class Controller @Autowired constructor(val productService: ProductService) {

    @GetMapping()
    fun getRoot(): ResponseEntity<Any>{
        return ResponseEntity.ok("Hello")
    }
    @GetMapping("/products")
    fun getProducts(): ResponseEntity<List<ProductDAO>>{
        val products = productService.getAllProducts()
        return ResponseEntity.ok(products)
    }

    @PostMapping("/products")
    fun postProducts(@RequestBody productRequest: ProductRequest): ResponseEntity<Any>{
        val saved = productService.saveNewProduct(productRequest)
        return ResponseEntity.ok(saved)
    }
    @DeleteMapping("/products")
    fun deleteProduct(@RequestParam id: Long){
        productService.deleteProduct(id)
    }
}