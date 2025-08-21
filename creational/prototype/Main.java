public class Main {
    public static void main(String[] args){
        Car model3 = new Car("model 3", 4);
        Car roadster = new Car("roadster", 2);

        CarShop shop1 = new CarShop();
        shop1.addCar(model3);
        shop1.addCar(roadster);

        shop1.printCars();

        CarShop shop2 = new CarShop();
        shop2.addCar(model3);
        shop2.addCar(roadster);
        shop2.printCars();

        try {
            CarShop shop3 = (CarShop) shop1.clone();
            shop3.printCars();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}