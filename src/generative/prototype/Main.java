package generative.prototype;

/**
 * Паттерн Prototype.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Vasa", 20, new Address("Raketny", 2));
//        Person person1 = person.copy(person);
//        Person person1 = person.clone();
        Person person1 = new Person(person);
        System.out.println(person != person1);
        System.out.println(person.equals(person1));

        person.setName("Igor");
        System.out.println(person1.getName());

        person.getAddress().setStreet("Moskovsky");
        System.out.println(person1.getAddress().getStreet());
    }
}
