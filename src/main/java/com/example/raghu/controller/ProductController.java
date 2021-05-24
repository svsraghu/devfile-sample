package com.example.raghu.controller;

import com.example.raghu.entity.Product;
import com.example.raghu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/ecommerce")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    public Mono<Product> createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/products")
    public Flux<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/product/{id}")
    public Mono<Product>  getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PutMapping("/updateProduct/{id}")
    public Mono<Product> updateProduct(@RequestBody Product product, @PathVariable int id) {
        return productService.updateProduct(product,id);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public Mono<Void> deleteProduct(@PathVariable int id) {
        return productService.deleteProductbyId(id);
    }

}
