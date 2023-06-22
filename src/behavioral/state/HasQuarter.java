package behavioral.state;

public class HasQuarter extends State {
    @Override
    public void insertQuarter(GumMachine gumMachine) {
        System.out.println("You have set quarter already!");
    }

    @Override
    public void turnCrank(GumMachine gumMachine) {
        if (getCounter() <= 0) {
            gumMachine.setState(new SoldOut());
        } else {
            System.out.println("selling....");
            setCounter(getCounter() - 1);
            gumMachine.setState(new NoQuarter());
        }
    }
}
