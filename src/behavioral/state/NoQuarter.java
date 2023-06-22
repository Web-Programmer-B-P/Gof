package behavioral.state;

import java.util.Random;

public class NoQuarter extends State {
    @Override
    public void insertQuarter(GumMachine gumMachine) {
        if (new Random().nextBoolean()) {
            gumMachine.setState(new Winner());
        } else {
            gumMachine.setState(new HasQuarter());
        }
    }

    @Override
    public void turnCrank(GumMachine gumMachine) {
        System.out.println("on quarter");
    }
}
