public class Main {
    public static void main(String[] args){
        Display display = new Display();
        display.addTree(1, "oak", "green", "5", "2");
        display.addTree(2, "oak", "green", "5", "2");

        System.out.println("number of trees on display is:" + display.trees.size());
        System.out.println("number of tree types in storage is:" + TreeFactory.treeTypeCount());
    }
}
