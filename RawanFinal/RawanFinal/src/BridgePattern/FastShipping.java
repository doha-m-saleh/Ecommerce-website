
package BridgePattern;

/**
 *
 * @author Rawan
 */
public class FastShipping implements Speed {
    @Override
public int speedPrice(){
    return 50;
}
public void trackShip(){

    System.out.println("The total time of the shipping is 24 hours");
}
}
