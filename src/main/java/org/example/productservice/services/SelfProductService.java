package org.example.productservice.services;

import org.example.productservice.models.Category;
import org.example.productservice.models.Product;
import org.example.productservice.repositories.CategoryRepository;
import org.example.productservice.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//why wrote this ??
@Service("selfProductService")



public class SelfProductService implements ProductService
{
//    attribute
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;


    SelfProductService(ProductRepository productRepository , CategoryRepository categoryRepository)
    {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;

    }

    @Override
    public Product getProductById(Long id)
    {
        Optional<Product> optionalProduct = productRepository.findById(id);

//        beech me ek exception handeling hai.
        return optionalProduct.get();
    }
    @Override
    public List<Product> getAllProducts() {
        return null;
    }

// why this override is showing error??
    @Override
    public Product createProduct(Product product) {
        Category category = product.getCategory();

        if (category.getId() == null) { // save the category
            product.setCategory(categoryRepository.save(category));
        }

        Product product1 = productRepository.save(product);
        Optional<Category> optionalCategory = categoryRepository.findById(category.getId());

//        firse beech me koi exception handiling hai.
        product1.setCategory(optionalCategory.get());
        return product1;
    }
}
