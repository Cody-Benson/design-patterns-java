public class Main {
    public static void main(String[] args){
        System.out.println("deep copy example");

        Car tesla = new Car(4,"model3");
        Car honda = new Car(4, "civic");

        CarFactory carFactory = new CarFactory();
        carFactory.addCar(tesla);
        carFactory.addCar(honda);
    }
}
