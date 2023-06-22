package structural.fly_weight;

public class PersonWorkInfo {
    private String position;
    private String address;

    public PersonWorkInfo(String position, String address) {
        this.position = position;
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
