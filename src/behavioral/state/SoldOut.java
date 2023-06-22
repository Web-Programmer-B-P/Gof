package behavioral.state;

public class SoldOut extends State {
    @Override
    public void insertQuarter(GumMachine gumMachine) {
        System.out.println("no gums");
    }

    @Override
    public void turnCrank(GumMachine gumMachine) {
        System.out.println("no gums");
    }
}
