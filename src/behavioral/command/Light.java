package behavioral.command;

public class Light {
    private boolean isLightOn;

    public void turnLight() {
        this.isLightOn = !this.isLightOn;
        System.out.println("Light is " + (isLightOn ? "On" : "Off"));
    }
}
