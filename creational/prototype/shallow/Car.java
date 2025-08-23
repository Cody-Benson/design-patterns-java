public class Car implements Cloneable{
    public int doors;
    public String name;
    public Car(String name, int doors){
        this.name = name;
        this.doors = doors;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getDoors(){
        return this.doors;
    }
    public void setDoors(int doors){
        this.doors = doors;
    }

    @Override
    public String toString(){
        return "this " + name + " has " + doors + " doors";
    }
}
