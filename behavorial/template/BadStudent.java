public class BadStudent extends StudyTemplate{
    public BadStudent(String name){
        super(name);
    }
    @Override
    public void takeNotes(){
        System.out.println(this.name + " is not taking notes. They are doodling instead!");
    }
    @Override
    public void practice(){
        System.out.println(this.name + " is playing video games instead of practicing.");
    }
}