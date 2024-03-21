package io.github.lenabett.productservice.service;

import java.util.List;

import io.github.lenabett.productservice.model.ProductCreateRequest;
import io.github.lenabett.productservice.model.ProductCreateResponse;

public interface ProductService {

    ProductCreateResponse createProduct(ProductCreateRequest productCreateRequest);
    
    List<ProductCreateResponse> findAll();
}
