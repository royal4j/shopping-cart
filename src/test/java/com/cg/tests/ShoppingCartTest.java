package com.cg.tests;

/**
 * Created by Rufi on 5/12/2016.
 */
import com.cg.shopping.cart.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {

    @Test
    public void testCartShouldBeEmpty(){
        ShoppingCart cart = new ShoppingCart();
        Assert.assertEquals(0 , cart.getTotalProducts());
    }

}
