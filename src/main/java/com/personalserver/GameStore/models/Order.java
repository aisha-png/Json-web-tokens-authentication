package com.personalserver.GameStore.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private Long id;
    private Customer customer;
    private LocalDate timeOfPurchase;
    private List<Product> products;
    private Status status;

    public Order () {}

    public Order (Customer customer, LocalDate timeOfPurchase, Status status){
        this.customer = customer;
        this.timeOfPurchase = timeOfPurchase;
        this.products = new ArrayList<>();
        this.status = Status.InPROGRESS;
    }

    //getters

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getTimeOfPurchase() {
        return timeOfPurchase;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Status getStatus() {
        return status;
    }

    //setters

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setTimeOfPurchase(LocalDate timeOfPurchase) {
        this.timeOfPurchase = timeOfPurchase;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // custom methods
    public void removeProductFromOrder(Product product){
        this.products.remove(product);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", timeOfPurchase=" + timeOfPurchase +
                ", products=" + products +
                ", status=" + status +
                '}';
    }
}
