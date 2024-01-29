package com.demo.kotlin.service

import com.demo.kotlin.model.ProductDAO
import com.demo.kotlin.model.ProductRequest
import com.demo.kotlin.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService @Autowired constructor(val productRepository: ProductRepository) {

    fun getAllProducts(): List<ProductDAO>{
        val products = productRepository.findAll();
        return products;
    }

    fun saveNewProduct(productRequest: ProductRequest): ProductDAO {
        val product = ProductDAO(name= productRequest.name, price =productRequest.price)
        return productRepository.save(product);
    }
    fun deleteProduct(id:Long) {
        productRepository.deleteById(id);
    }
}
