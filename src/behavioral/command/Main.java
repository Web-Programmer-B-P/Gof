package behavioral.command;

/**
 * Паттерн клманда(Command).
 */
public class Main {
    public static void main(String[] args) {
        Command lightCommand = new LightCommand(new Light());
        Button switchLightButton = new Button(lightCommand);
        switchLightButton.pressButton();
        switchLightButton.pressButton();

        Command playMusicCommand = new PlayMusicCommand(new MusicPlayer());
        Button playMusicButton = new Button(playMusicCommand);
        playMusicButton.pressButton();
        playMusicButton.pressButton();

        Command lightAndMusicCommand = new LightAndMusic(new Light(), new MusicPlayer());
        Button lightAndMusicButton = new Button(lightAndMusicCommand);
        lightAndMusicButton.pressButton();
    }
}
