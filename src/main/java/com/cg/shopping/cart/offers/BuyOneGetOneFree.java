package com.cg.shopping.cart.offers;

import com.cg.shopping.cart.Product;

/**
 * Created by Rufi on 5/12/2016.
 */
public class BuyOneGetOneFree  implements Promotion {

    private int oneItem;
    private int secondItem;

    public BuyOneGetOneFree(int oneItem, int secondItem) {
        this.oneItem = oneItem;
        this.secondItem = secondItem;
    }

    @Override
    public void applyPromotion(Product product) {
        if (product.getProductQuantity() >= oneItem) {
            int freeProductQty = product.getProductQuantity() / (oneItem + secondItem);
            double unitPrice = product.getPrice() / product.getProductQuantity();
            double discount = unitPrice * freeProductQty;
            product.setPrice(product.getPrice() - discount);
        }
    }
}
