
package StrategyPattern;

/**
 *
 * @author Rawan
 */

public class Products {
    private String ItemCode;
private int Price;
public Products(String Code, int Price){
this.ItemCode=Code;
this.Price=Price;
}
public String getCode(){
return ItemCode;
}

public void setCode(String Code){
this.ItemCode = Code;
}

public int getPrice(){
return Price;
}

public void setPrice(int Price){
this.Price = Price;
}





}
