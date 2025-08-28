public class EVFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle(){
        return new EV();
    }
}
