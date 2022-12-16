package org.sid.invertoryservice.entities;

import lombok.*;

import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @Builder
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private double price;
    private int quantity;
}
