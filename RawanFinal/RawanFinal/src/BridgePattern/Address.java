
package BridgePattern;

/**
 *
 * @author Rawan
 */

public class Address extends Shipment {
public Address(Speed speed){
    this.speed = speed;
}
    @Override
public int shipPrice(){
return 30 + speed.speedPrice();
}
public void displayTrack(){

    speed.trackShip();
}
}
