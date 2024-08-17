package com.fabricadecoduri.shop_online.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_product_fk", referencedColumnName = "id")
    private List<Product> products;
}
