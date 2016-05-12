package com.cg.shopping.cart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rufi on 5/12/2016.
 */
public class ShoppingCart {

    private List<Product> productList = new ArrayList<Product>();
    private double cartTotalAmount;

    public int getTotalProducts() {
        return productList.size();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public double getTotalAmount(){
        if (productList.size() > 0) {
            for (Product product : productList) {
                cartTotalAmount = cartTotalAmount + product.getPrice();
            }
        }
        return cartTotalAmount;
    }
}
