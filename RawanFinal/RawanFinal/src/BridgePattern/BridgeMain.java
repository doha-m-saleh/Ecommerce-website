package BridgePattern;

/**
 *
 * @author Rawan
 */
import java.util.*;

public class BridgeMain {
    public static void main(String[] args) {
        System.out.println("Please choose one of the following numbers: ");
        System.out.println("1_fast shipment to home "+"\n"+"2_fast shipment to a pickup point ");
        System.out.println("3_slow shipment to home "+"\n"+"4_slow shipment to a pickup point ");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                Shipment obj1 = new Address(new FastShipping());
                System.out.println("The total price of the shipping is: "+obj1.shipPrice());
                obj1.displayTrack();
                break;
            case 2:
                Shipment obj2 = new PickupPoint(new FastShipping());
                System.out.println("The total price of the shipping is: "+obj2.shipPrice());
                obj2.displayTrack();
                break;
            case 3:
                Shipment obj3 = new Address(new SlowShipping());
                System.out.println("The total price of the shipping is: "+obj3.shipPrice());
                obj3.displayTrack();
                break;
            case 4:
                Shipment obj4 = new PickupPoint(new SlowShipping());
                System.out.println("The total price of the shipping is: "+obj4.shipPrice());
                obj4.displayTrack();
                break;
            default:
               System.out.println("wrong input");
               break;
            }
                if(sc!=null)
                    sc.close();
            
    }

}
