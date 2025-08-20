class Main{
	public static void main(String[] args){
		System.out.println("builder");
		House house = new House.HouseBuilder().setDoors(2).setWindows(3).setYard(true).build();
		System.out.println(house);
	}
}