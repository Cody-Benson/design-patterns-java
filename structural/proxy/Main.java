public class Main {
    public static void main(String[] args){
        Honda honda = new Honda();
        User john = new User("john", 15);

        //john is driving without a proxy service to stop under aged driving!
        honda.drive(john);

        //lets use the proxy service to check if john is the proper age.
        VehicleProxy proxy = new VehicleProxy(honda);
        proxy.drive(john);

        User cody = new User("cody", 25);
        proxy.drive(cody);
    }
}
