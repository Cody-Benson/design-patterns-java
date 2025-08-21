import java.util.ArrayList;

public class CarShop implements Cloneable{
    private ArrayList<Car> cars = new ArrayList<>();

    public CarShop(){}

    public void addCar(Car car){
        this.cars.add(car);
    }

    public void printCars(){
        cars.forEach((c) -> {System.out.println(c.getName());});
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
            return super.clone();
    }
}
