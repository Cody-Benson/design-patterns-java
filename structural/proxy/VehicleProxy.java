public class VehicleProxy implements Vehicle{
    Vehicle vehicle;


    public VehicleProxy(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void drive(User user){
        if (user.getAge() < 16){
            System.out.println("user " + user.getName() + " at " + user.getAge() + " years old is too young to drive");
        }else{
            vehicle.drive(user);
        }
    }
}
