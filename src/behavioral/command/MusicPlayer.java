package behavioral.command;

public class MusicPlayer {
    private boolean isMusicPlay;

    public void playMusic() {
        this.isMusicPlay = !this.isMusicPlay;
        System.out.println("Play music: " + (isMusicPlay ? "on" : "off"));
    }
}
