package com.cg.tests;

/**
 * Created by Rufi on 5/12/2016.
 */
import com.cg.shopping.cart.Product;
import com.cg.shopping.cart.ShoppingCart;
import com.cg.shopping.cart.offers.BuyOneGetOneFree;
import com.cg.shopping.cart.offers.Promotion;
import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {

    @Test
    public void testCartShouldBeEmpty(){
        ShoppingCart cart = new ShoppingCart();
        Assert.assertEquals(0 , cart.getTotalProducts());
    }

    @Test
    public void testAddProductToShoppingCart(){
        ShoppingCart cart = new ShoppingCart();
        Product product = new Product("Apple", 1, .60);
        cart.addProduct(product);
        Assert.assertEquals(1,cart.getTotalProducts());
        Assert.assertEquals(.60,cart.getTotalAmount(),0.0);
    }

    @Test
    public void testAddOrangeAndAppleToShoppingCart(){
        ShoppingCart cart = new ShoppingCart();
        Product product = new Product("Apple", 3, 1.80);
        Product orange = new Product("Orange", 1, .25);
        cart.addProduct(product);
        cart.addProduct(orange);
        Assert.assertEquals(2,cart.getTotalProducts());
        Assert.assertEquals(2.05,cart.getTotalAmount(),0.0);
    }

    @Test
    public void testAddAppleAndApplyOfferToCart() {
        Promotion offer = new BuyOneGetOneFree(1,1);
        ShoppingCart cart = new ShoppingCart();
        cart.setPromotion(offer);
        Product product = new Product("Apple", 5,3.0 );
        cart.addProduct(product);
        Assert.assertEquals(1, cart.getTotalProducts());
        Assert.assertEquals(1.8, cart.getTotalAmount(),0.0);
    }

    @Test
    public void testAddOrangeAndApplyOfferToCart() {
        //I've used the same class for both solutions for buy one get 1 free and 2 for 1, perhaps we can change the class name
        Promotion twoFor1 = new BuyOneGetOneFree(2,1);
        ShoppingCart cart = new ShoppingCart();
        cart.setPromotion(twoFor1);
        Product oranges = new Product("Orange", 3, 0.75);
        cart.addProduct(oranges);
        Assert.assertEquals(1, cart.getTotalProducts());
        Assert.assertEquals(0.5, cart.getTotalAmount(),0.0);
    }

    @Test
    public void testAddAppleAndOrangeAndAppleOfferToCart() {
        Promotion offer = new BuyOneGetOneFree(1,1);
        Promotion twoForOne = new BuyOneGetOneFree(2,1);
        ShoppingCart cart = new ShoppingCart();

        //Add Apple and apply promotion for apple
        Product product = new Product("Apple", 5,3.0 );
        cart.setPromotion(offer);
        cart.addProduct(product);

        //Add Oranges and apply promotion for oranges
        Product oranges = new Product("Orange", 3, 0.75);
        cart.setPromotion(twoForOne);
        cart.addProduct(oranges);

        Assert.assertEquals(2, cart.getTotalProducts());
        Assert.assertEquals(2.30, cart.getTotalAmount(),0.0);
    }
}
