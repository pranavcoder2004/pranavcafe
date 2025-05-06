package com.ducat.pranavcafe.model;

import com.ducat.pranavcafe.model.emuns.Category;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "dish")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;

    @Enumerated(EnumType.STRING)
    private Category category;
}
