
package BridgePattern;

/**
 *
 * @author Rawan
 */
public class SlowShipping implements Speed {
    @Override
public int speedPrice(){
    return 30;
}
public void trackShip(){

    System.out.println("The total time of the shipping is 48 hours");
}
}