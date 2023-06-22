package behavioral.state;

public abstract class State {
    private int counter = 10;

    abstract public void insertQuarter(GumMachine gumMachine);
    abstract public void turnCrank(GumMachine gumMachine);

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
