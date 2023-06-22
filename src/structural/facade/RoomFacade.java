package structural.facade;

public class RoomFacade {
    private Tv tv = new Tv();
    private AirConditioning airConditioning = new AirConditioning();
    private Light light = new Light();

    public void pressButton(String temperature, String channel) {
        tv.chooseChanel(channel);
        airConditioning.setTemperature(temperature);
        light.turnOnLight();
    }
}
