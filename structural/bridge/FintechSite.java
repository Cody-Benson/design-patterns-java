public class FintechSite extends Website{
    
    public FintechSite(Theme theme){
        super(theme);
    }

    @Override
    public void display(){
        this.theme.changeColor();
    }
}
