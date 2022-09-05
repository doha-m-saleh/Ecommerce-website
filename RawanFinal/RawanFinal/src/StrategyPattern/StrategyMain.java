
package StrategyPattern;

/**
 *
 * @author Rawan
 */

public class StrategyMain {
 
    public static void main(String[] args) {
        ShoppingCart shoppingcart = new ShoppingCart();
 
        Products product1 = new Products("4321",30);
        Products product2 = new Products("1234",70);
 
        shoppingcart.addToCart(product1);
        shoppingcart.addToCart(product2);
 
  
        shoppingcart.Pay(new PayPal("Rawan178243@bue.edu.eg", "0809"));
 
}
}
