package com.example.raghu.service;

import com.example.raghu.entity.Product;
import com.example.raghu.repository.ProductRepository;
import com.sun.jna.platform.win32.WinDef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@Service

public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Mono<Product> createProduct(Product product) {
        return productRepository.save(product);
    }

    public Flux<Product> getProducts() {
        return productRepository.findAll();
    }

    public Mono<Product> getProductById(int id) {
        return productRepository.findById(id);
    }

    public Mono<Product> updateProduct(Product product, int id) {
        return productRepository.findById(id)
                .map((c) -> {
                    c.setName(product.getName());
                    c.setQuantity(product.getQuantity());
                    c.setPrice(product.getPrice());
                    return c;
                }).flatMap(c-> productRepository.save(product));

    }

    public Mono<Void> deleteProductbyId(int id ){
       return productRepository.deleteById(id);
    }
}

