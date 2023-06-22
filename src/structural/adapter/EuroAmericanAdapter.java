package structural.adapter;

public class EuroAmericanAdapter implements EuroSocket {
    private final AmericanSocket americanSocket;

    public EuroAmericanAdapter(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
    }
}
