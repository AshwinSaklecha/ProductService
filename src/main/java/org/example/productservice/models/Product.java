package org.example.productservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product
{
//    @Id
//    private Long id;
//    private String title;
//    private String description;
//    private Double price;
//    @ManyToOne
//    private Category category;
//    private String image;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Double price;
    @ManyToOne
    private Category category;
    private String image;
}
