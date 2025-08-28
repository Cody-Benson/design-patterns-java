public class CarFactory {
    public Vehicle orderVehicle(String request){
        Vehicle vehicle = null;
        if(request.equals("ev")){
            vehicle = new ElectricVehicle();
            return vehicle;
        }else{
            vehicle = new GasVehicle();
            return vehicle;
        }
    }
}
