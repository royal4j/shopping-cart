package com.cg.shopping.cart;

import com.cg.shopping.cart.offers.Promotion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rufi on 5/12/2016.
 */
public class ShoppingCart {

    private List<Product> productList = new ArrayList<Product>();
    private double cartTotalAmount;
    private Promotion promotion;

    public int getTotalProducts() {
        return productList.size();
    }

    public void addProduct(Product product) {
        if(promotion != null){
            promotion.applyPromotion(product);//apply offer
        }
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

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }
}
