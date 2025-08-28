public class Main {
    public static void main(String[] args){
        VehicleFactory factory1 = new EVFactory();
        Vehicle car1 = factory1.createVehicle();
        car1.recharge();

        VehicleFactory factory2 = new GasFactory();
        Vehicle car2 = factory2.createVehicle();
        car2.recharge();
    }
}
