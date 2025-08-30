abstract class Website {
    public Theme theme;

    public Website(Theme theme){
        this.theme = theme;
    }
    public abstract void display();
}
