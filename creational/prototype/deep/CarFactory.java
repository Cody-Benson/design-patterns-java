import java.util.ArrayList;

public class CarFactory {
    public ArrayList<Car> cars = new ArrayList<Car>();

    public CarFactory(){};

    public void addCar(Car car){
        this.cars.add(car);
    }

    @Override
    public String toString(){
        cars.forEach((c) ->{System.out.println(c);});
    }
}