import java.security.PublicKey;

class DeliveryVehicle{
    String vehicleid;
    public DeliveryVehicle(String vehicleid){
        this.vehicleid=vehicleid;
    }
    public void dispatch(){
        System.out.println("Vehicle "+vehicleid+" is movin");
    }
}
class DroneDelivery extends DeliveryVehicle{
    public DroneDelivery(String vehicleid){
        super(vehicleid);
    }
    @Override
    public void dispatch(){
        System.out.println("Drone "+vehicleid+" is movin");
    }
}
class LogisticsManager{
    public void schedulDelivery(String address) {
        System.out.println("standerd delivery shedule to  " + address);
    }
    public void schedulDelivery(String address,String timeslot){
        System.out.println("standerd delivery shedule to  " + address+" during time "+timeslot+" slot");
    }
    public void schedulDelivery(int trackingid){
        System.out.println("querin traking id is: "+trackingid);
    }
}
public class poly {
    public static void main(String[] args) {

        System.out.println("....overlodin....");
        LogisticsManager manager=new LogisticsManager();
        manager.schedulDelivery("123 sadashiv peth ,pune.");
        manager.schedulDelivery("appachiwadi ,satara","4pm-6pm");
        manager.schedulDelivery(651455);

        System.out.println("...overridin...");
        DeliveryVehicle obj1=new DeliveryVehicle("val1");
        obj1.dispatch();
        DeliveryVehicle obj2=new DeliveryVehicle("Drone1");
        obj2.dispatch();
    }
}
