class Main{
	public static void main(String[] args){
		House house = House.builder().setWindows(2).build();
		System.out.println(house);
	}
}