package org.example.productservice.repositories;

import org.example.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>
{
    @Override
    Optional<Product> findById(Long id);

//    what are we doing here

    @Override
    Product save(Product product);
}
