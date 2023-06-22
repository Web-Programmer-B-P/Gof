package behavioral.command;

public class LightAndMusic implements Command {
    Light light;
    MusicPlayer musicPlayer;

    public LightAndMusic(Light light, MusicPlayer musicPlayer) {
        this.light = light;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        light.turnLight();
        musicPlayer.playMusic();
    }
}
