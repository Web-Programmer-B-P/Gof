package behavioral.template;

public abstract class Beverage {
    private void boilWater() {
        System.out.println("boiled water");
    }

    private void addSugar() {
        System.out.println("Add sugar");
    }

    protected abstract void addBeverage();

    protected abstract void addCondiment();

    protected void hook() {

    }

    public void makeBeverage() {
        boilWater();
        addBeverage();
        addSugar();
        addCondiment();
        hook();
    }
}
