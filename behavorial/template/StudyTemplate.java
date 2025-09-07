public abstract class StudyTemplate {
    public String name;
    public StudyTemplate(String name){
        this.name = name;
    }
    void study(){
        read();
        takeNotes();
        practice();
    }

    void read(){
        System.out.println(this.name + " is reading");
    }
    abstract void takeNotes();
    abstract void practice();
}