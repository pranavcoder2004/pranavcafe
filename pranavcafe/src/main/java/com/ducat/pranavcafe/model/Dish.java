package com.ducat.pranavcafe.model;

import com.ducat.pranavcafe.model.emuns.Category;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.IndexColumn;
import org.springframework.stereotype.Indexed;

@Entity
@Data
@NoArgsConstructor
@Table(name = "dish")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull

    private String name;
    private Double price;

    @Enumerated(EnumType.STRING)
    private Category category;


    @OneToOne
    private Customer customer;
}
