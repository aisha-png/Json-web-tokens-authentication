package com.personalserver.GameStore.models;

import java.util.List;

public class Customer {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String name;
    private String address;
    private List<Order> orders;
    private List<Review> reviews;
    private Cart cart;

    public Customer (){}

    public Customer(String username, String password, String email, String name, String address, List<Order> orders, List<Review> reviews, Cart cart) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.address = address;
        this.orders = orders;
        this.reviews = reviews;
        this.cart = cart;
    }
}
