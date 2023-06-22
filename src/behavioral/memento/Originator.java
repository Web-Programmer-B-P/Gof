package behavioral.memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Originator.Memento saveState() {
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento) {
        this.state = memento.state;
    }

    static class Memento {
        private final String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}
