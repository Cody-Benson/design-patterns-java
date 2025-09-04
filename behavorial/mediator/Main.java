public class Main {
    public static void main(String[] args){
        AirTowerCoordinator tower = new AirTowerCoordinator();
        Plane plane1 = new Plane(tower,1);
        Plane plane2 = new Plane(tower,2);
        Plane plane3 = new Plane(tower,3);

        tower.addPlane(plane1);
        tower.addPlane(plane2);
        tower.addPlane(plane3);

        plane1.canILand();
        plane2.canILand();
        plane1.landed();
        plane2.canILand();
        plane2.landed();
        plane3.canILand();
    }
}