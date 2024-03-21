package io.github.lenabett.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.lenabett.productservice.entity.Product;

public interface ProductRepository extends JpaRepository< Product, Integer> {
    
}
