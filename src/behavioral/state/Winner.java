package behavioral.state;

public class Winner extends State {
    @Override
    public void insertQuarter(GumMachine gumMachine) {
        System.out.println("You are winner!");
    }

    @Override
    public void turnCrank(GumMachine gumMachine) {
        System.out.println("Get gum");
        gumMachine.setState(new NoQuarter());
    }
}
