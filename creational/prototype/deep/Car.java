public class Car {
    public int doors;
    public String name;

    public Car(int doors, String name){
        this.doors = doors;
        this.name = name;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }
    public int getDoors(){
        return this.doors;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return "car make is " + getName() + " and doors is " + getDoors();
    }
}
