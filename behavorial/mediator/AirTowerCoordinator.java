import java.util.ArrayList;
import java.util.List;

public class AirTowerCoordinator implements Mediator{
    public List<Plane> planes;
    
    public AirTowerCoordinator(){
        this.planes = new ArrayList<>();
    }

    @Override
    public boolean canILand(){
        for(Plane plane : planes){
            if(plane.getStatus().equals("landing")){
                System.out.println("Plane" + plane.getId() + " is already landing. Please wait.");
                return false;
            }
        }
        System.out.println("you are good to land.");
        return true;
    }

    @Override
    public void addPlane(Plane p){
        this.planes.add(p);
    }
}
