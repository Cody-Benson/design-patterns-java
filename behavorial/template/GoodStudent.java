public class GoodStudent extends StudyTemplate{
    public GoodStudent(String name){
        super(name);
    }
    @Override
    public void takeNotes(){
        System.out.println(this.name + " is taking lots of notes.");
    }
    @Override
    public void practice(){
        System.out.println(this.name + " is practicing often!");
    }
}
