package com.cg.tests;

/**
 * Created by Rufi on 5/12/2016.
 */
import com.cg.shopping.cart.Product;
import com.cg.shopping.cart.ShoppingCart;
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
        Product product = new Product("Apple", 1, .60);
        Product orange = new Product("Orange", 1, .25);
        cart.addProduct(product);
        cart.addProduct(orange);
        Assert.assertEquals(2,cart.getTotalProducts());
        Assert.assertEquals(.85,cart.getTotalAmount(),0.0);
    }
}
