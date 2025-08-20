public class House {
    private int doors;
    private int windows;
    private boolean yard;

    private House(HouseBuilder builder){
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.yard = builder.yard;
    }

    @Override
    public String toString(){
        return "House with " + doors + " doors, " + windows + " windows, and yard is:" + yard;
    }

    public static class HouseBuilder{
        private int doors = 0;
        private int windows = 0;
        private boolean yard = false;

        public HouseBuilder setDoors(int doors){
            this.doors = doors;
            return this;
        }

        public HouseBuilder setWindows(int windows){
            this.windows = windows;
            return this;
        }

        public HouseBuilder setYard(boolean yard){
            this.yard = yard;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }
}
