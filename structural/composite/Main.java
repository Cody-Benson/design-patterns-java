public class Main {
    public static void main(String[] args){
        FileSystemComponent newFile = new TextFile("document1.txt");
        FileSystemComponent codySettings = new TextFile("settings.txt");
        FileSystemComponent newFile2 = new TextFile("document2.txt");
        Folder users = new Folder("User");
        Folder cody = new Folder("Cody");
        Folder documents = new Folder("Documents");

        users.add(cody);
        cody.add(codySettings);
        cody.add(documents);
        documents.add(newFile);
        documents.add(newFile2);

        users.details();
    }
}
