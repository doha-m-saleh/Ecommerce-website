
package BridgePattern;

/**
 *
 * @author Rawan
 */
public class PickupPoint extends Shipment {
public PickupPoint(Speed speed){
    this.speed = speed;
}
    @Override   
    public int shipPrice(){
        return  20 + speed.speedPrice(); 
        }
    public void displayTrack(){

        speed.trackShip();
    }
}
