public class CleanEnergySite extends Website{

    CleanEnergySite(Theme theme){
        super(theme);
    }
    
    @Override
    public void display(){
        this.theme.changeColor();
    }
}
