package com.personalserver.GameStore.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    @Column(name = "product_name")
    private String productName;
    @Column
    private String img;
    @Column
    private String description;
    @Column
    private int quantityInStock;
    @Column
    private int customerRating;
    @Column
    private double price;
    @Column
    @Enumerated(value = EnumType.STRING)
    private Category category;

    @OneToMany(mappedBy = "products")
//    @JsonIgnoreProperties(value = "products", "orders")
    private List<Order> orders;

    @OneToMany(mappedBy = "product")
    @JsonIgnoreProperties(value = "product")
    private List<Review> reviews;

    public Product(){}

    public Product(String productName, String img, String description, int quantityInStock, int customerRating, double price,
                   Category category){
        this.productName = productName;
        this.img = img;
        this.description = description;
        this.quantityInStock = quantityInStock;
        this.customerRating = customerRating;
        this.price = price;
        this.category = category;
        this.orders = new ArrayList<>();
        this.reviews = new ArrayList<>();

    }

    // getters
    public String getProductName() {
        return productName;
    }

    public String getImg() {
        return img;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public int getCustomerRating() {
        return customerRating;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    // setters
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setCustomerRating(int customerRating) {
        this.customerRating = customerRating;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    // custom methods:

    public void removeOrder(Order order){
        this.orders.remove(order);
    }

    public void removeReview(Review review){
        this.reviews.remove(review);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", img='" + img + '\'' +
                ", description='" + description + '\'' +
                ", quantityInStock=" + quantityInStock +
                ", customerRating=" + customerRating +
                ", price=" + price +
                ", category=" + category +
                ", orders=" + orders +
                ", reviews=" + reviews +
                '}';
    }
}
