package org.sid.customerservice.entities;
import lombok.*;

import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @Builder

    public class Customer {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private  String nom;
        private  String email;
    }
