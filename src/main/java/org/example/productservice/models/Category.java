package org.example.productservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category
{
//    @Id
//    private Long id;
//    private String title;
//    private String description;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Product> products;

}
