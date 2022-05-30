package com.example.homework68.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "cart_items")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;

    @ManyToOne
    @JoinColumn(name = "tovar_id")
    private Tovar tovar;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private int quantity;
}
