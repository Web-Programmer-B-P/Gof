package generative.builder;

public interface PersonBuilder {
    PersonBuilder name(String name);
    PersonBuilder age(int age);
    PersonBuilder salary(double salary);
    Person build();
}
