package behavioral.state;

public class GumMachine {
    private State state = new NoQuarter();

    public void insertQuarter() {
        state.insertQuarter(this);
    }

    public void turnCrank() {
        state.turnCrank(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
