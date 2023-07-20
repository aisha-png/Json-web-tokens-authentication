package com.personalserver.GameStore.models;

import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private double rating;
    @Column
    private String description;
    @Column
    private boolean isVerifiedPurchase;
    @Column
    @OneToOne
    private Customer customer;
    @ManyToOne
    private Product product;

    public Review(){}

    public Review(String title, double rating, String description, boolean isVerifiedPurchase, Customer customer, Product product) {
        this.title = title;
        this.rating = rating;
        this.description = description;
        this.isVerifiedPurchase = isVerifiedPurchase;
        this.customer = customer;
        this.product = product;
    }


}
