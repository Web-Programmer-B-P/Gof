package generative.prototype;

import java.util.Objects;

/**
 * Проблемы при клонировании конструктор отрабатывает только один раз при создании объекта.
 * При клонировании не отрабатывает.
 * Так же мы не можем работать с final полями при клонировании.
 */
public class Person implements Cloneable {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * Решение проблемы с клонированием.
     * Так же в таком варианте можем использовать final поля.
     * @param person
     */
    public Person(Person person) {
        this.name = person.getName();
        this.age = person.getAge();
        this.address = new Address(person.getAddress());
//        this.address = person.getAddress();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }

    /**
     * Кастыльный метод clone(), просто для примера.
     *
     * @param person
     * @return
     */
    public Person copy(Person person) {
        return new Person(person.getName(), person.getAge(), person.getAddress());
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.setAddress(this.address.clone());
        return person;
    }
}
