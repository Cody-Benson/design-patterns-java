public class TextFile implements FileSystemComponent{
    String name;

    public TextFile(String name){
        super();
        this.name = name;
    }

    @Override
    public void details(){
        System.out.println("File: " + name);
    }
}
