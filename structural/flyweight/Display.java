import java.util.ArrayList;
import java.util.List;

public class Display {
    public List<Tree> trees = new ArrayList<>();

    public Display(){}

    public void addTree(int position, String species, String color, String height, String width){
        TreeType type = TreeFactory.getTreeType(species, color, height, width);
        trees.add(new Tree(position,type));
    }
}
