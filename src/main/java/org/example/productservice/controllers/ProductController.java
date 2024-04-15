package org.example.productservice.controllers;

import org.example.productservice.dtos.FakeStoreProductDto;
import org.example.productservice.models.Product;
import org.example.productservice.services.FakeStoreProductService;
import org.example.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController
{
//    private final FakeStoreProductService fakeStoreProductService;
    private ProductService productService;

    ProductController(@Qualifier("selfProductService") ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") long id)
    {
        return productService.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }


}