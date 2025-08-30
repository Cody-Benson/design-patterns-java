public class Main{
    public static void main(String[] args){
        Theme darkTheme = new DarkTheme();
        Website mysite = new FintechSite(darkTheme);
        mysite.display();

        Theme lightTheme = new LightTheme();
        Website mysite2 = new CleanEnergySite(lightTheme);
        mysite2.display();
    }
}