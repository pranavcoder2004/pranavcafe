package com.ducat.pranavcafe.model;

import com.ducat.pranavcafe.model.emuns.PaymentType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NonNull
    private String Name;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @NonNull
    private String item;

    @OneToOne

    private Dish dish;
}
