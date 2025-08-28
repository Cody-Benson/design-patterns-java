public class GasFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle(){
        return new Gas();
    }
}
