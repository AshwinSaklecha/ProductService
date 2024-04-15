package org.example.productservice.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductNotFoundException extends RuntimeException {
    private Long id;
    public ProductNotFoundException(Long id, String message) {
        super(message);
//        why is this showing error
        this.id = id;
    }
}