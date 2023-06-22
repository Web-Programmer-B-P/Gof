package behavioral.template;

/**
 * Паттерн Template.
 *
 * Позволяет группировать одинаковое поведение, а уникальные вещи выносить в отдельные методы,
 * которые будут реализовывать наследники.
 */
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.makeBeverage();
        Tea tea = new Tea();
        tea.makeBeverage();
    }
}
