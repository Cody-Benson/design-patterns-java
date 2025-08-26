public class Main {
    public static void main(String[] args){
        System.out.println("deep copy example");
        Color color = new Color("red");
        ShapePrototype circlePrototype = new Circle(5,color);

        Circle circle1 = (Circle) circlePrototype.clone();
        Circle circle2 = (Circle) circlePrototype.clone();

        Color circle1Color = circle1.getColor();
        Color circle2Color = circle2.getColor();

        System.out.println("circle1 color is:" + circle1Color.getColor());
        System.out.println("circle2 color is:" + circle2Color.getColor());

        circle1Color.setColor("blue");

        System.out.println("color is a deep copy. Color is a separate instance");
        System.out.println("circle1 color is:" + circle1Color.getColor());
        System.out.println("circle2 color is:" + circle2Color.getColor());
    }
}
