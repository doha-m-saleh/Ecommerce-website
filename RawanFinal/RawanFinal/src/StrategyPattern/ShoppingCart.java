package StrategyPattern;

/**
 *
 * @author Rawan
 */

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {

List<Products> productlist;

public ShoppingCart(){
this.productlist = new ArrayList<Products>();
}

public void addToCart(Products product){
productlist.add(product);
}

public void RemoveFromCart(Products product){
productlist.remove(product);
}

public int CalculateTotalPrice(){
int sum = 0;
for (Products product : productlist){
sum += product.getPrice();
}
return sum;
}

public void Pay( Payment Type){
int amount = CalculateTotalPrice();
Type.Pay(amount);
}
}





