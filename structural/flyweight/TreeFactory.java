import java.util.Map;
import java.util.HashMap;
public class TreeFactory {
    private static Map<String,TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String species, String color, String height, String width){
        if(treeTypes.get(species) == null){
            treeTypes.put(species, new TreeType(species, color, height, width));
        }
        return treeTypes.get(species);
    }

    public static int treeTypeCount(){
        return treeTypes.size();
    }
}
