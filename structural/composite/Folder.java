import java.util.ArrayList;

public class Folder implements FileSystemComponent {
    public String name;
    public ArrayList<FileSystemComponent> components;

    public Folder(String name){
        super();
        this.name = name;
        components = new ArrayList<>();
    }

    public void add(FileSystemComponent component){
        components.add(component);
    }

    public void remove(FileSystemComponent component){
        components.remove(component);
    }

    @Override
    public void details(){
        System.out.println("Folder: " + this.name);
        for(FileSystemComponent c: components){
            c.details();
        }
    }
}
