package structural.facade;

public class BadRoom {
    private RoomFacade roomFacade = new RoomFacade();

    public void pressButton(String temperature, String channel) {
        roomFacade.pressButton(temperature, channel);
    }
}
