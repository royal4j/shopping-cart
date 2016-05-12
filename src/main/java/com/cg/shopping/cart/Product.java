package com.cg.shopping.cart;

/**
 * Created by Rufi on 5/12/2016.
 */
public class Product {

    private String productName;
    private int productQuantity;
    private double price;

    public Product(String productName, int productQuantity, double price) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.price = price;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }




}
