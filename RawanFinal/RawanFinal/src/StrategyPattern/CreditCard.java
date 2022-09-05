
package StrategyPattern;

/**
 *
 * @author Rawan
 */
public class CreditCard  implements Payment{
    private String name;
    private String CardNumber;
    private String ExpiryDate;
    private String CVV;


public CreditCard(String name, String CardNumber, String ExpiryDate, String CVV){
this.name = name;
this.CardNumber = CardNumber;
this.ExpiryDate = ExpiryDate;
this.CVV = CVV;
}

@Override
public void Pay(int amount){
System.out.print("You've sucessfully paid" + amount);
}
}
