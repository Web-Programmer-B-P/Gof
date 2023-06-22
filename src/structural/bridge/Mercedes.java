package structural.bridge;

public class Mercedes implements Model {
    @Override
    public void drive(String str) {
        System.out.println(str + " mercedes");
    }
}
