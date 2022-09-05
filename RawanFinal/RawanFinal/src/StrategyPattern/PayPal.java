
package StrategyPattern;

/**
 *
 * @author Rawan
 */

public class PayPal  implements Payment{
    private String Email;
    private String Password;


public PayPal(String Email, String Password){
this.Email = Email;
this.Password = Password;
}

@Override
public void Pay(int amount){
System.out.print("You've sucessfully paid"  + amount);
}
}
