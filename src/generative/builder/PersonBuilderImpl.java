package generative.builder;

public class PersonBuilderImpl implements PersonBuilder {
    private final Person person = new Person();

    @Override
    public PersonBuilder name(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public PersonBuilder age(int age) {
        person.setAge(age);
        return this;
    }

    @Override
    public PersonBuilder salary(double salary) {
        person.setSalary(salary);
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
