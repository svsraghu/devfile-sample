package com.example.raghu.repository;

import com.example.raghu.entity.Product;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Mono;

@Repository

public interface ProductRepository extends ReactiveMongoRepository<Product, Integer> {

    //Mono<Product> save(Mono<? extends Product> product);
}


