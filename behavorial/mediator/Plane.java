public class Plane {
    private String status;
    private int id;
    private AirTowerCoordinator tower;

    public Plane(AirTowerCoordinator tower, int id){
        this.tower = tower;
        this.status = "waiting";
        this.id = id;
    }

    public String getStatus(){
        return this.status;
    }

    public int getId(){
        return this.id;
    }

    public void landed(){
        this.status = "landed";
    }

    public Boolean canILand(){
        System.out.println("This is plane" + this.id + ". Am I good to land?");
        if(tower.canILand()){
            this.status = "landing";
            return true;
        }
        return false;
    }
}