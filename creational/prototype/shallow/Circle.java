public class Circle implements ShapePrototype{
    public int radius;
    public Color color;

    public Circle(int radius, Color color){
        this.radius = radius;
        this.color = color;
    }

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    @Override
    public void draw(){
        System.out.println("my radius is:" + radius + " and my color is:" + color.getColor());
    }

    @Override
    public ShapePrototype clone(){
        try {
            Circle circleClone = (Circle) super.clone();
            return circleClone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("cloning not supported");
        }
    }
}
