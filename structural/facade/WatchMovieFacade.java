public class WatchMovieFacade {
    public DVDPlayer player;
    public Remote remote;
    public SurroundSound ss;

    public WatchMovieFacade(){
        this.player = new DVDPlayer();
        this.remote = new Remote();
        this.ss = new SurroundSound();
    }

    public void watchMovie(){
        remote.turnOnTV();
        remote.changeChannel();
        remote.changeVolume();

        ss.turnOnSurroundSound();
        ss.changeInput();
        ss.changeVolume();

        player.turnOn();
        player.playMovie();
    }
}
