package simple;
public class Main{
    public static void main(String[] args){
        CarFactory carFactory = new CarFactory();
        Vehicle vehicle1 = carFactory.orderVehicle("gas");
        vehicle1.recharge();

        Vehicle vehicle2 = carFactory.orderVehicle("ev");
        vehicle2.recharge();
    }
}