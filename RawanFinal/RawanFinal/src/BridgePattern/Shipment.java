
package BridgePattern;

/**
 *
 * @author Rawan
 */
public abstract class Shipment {
    protected Speed speed;
    abstract public int shipPrice();
    abstract public void displayTrack();
}
