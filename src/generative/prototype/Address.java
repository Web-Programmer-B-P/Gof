package generative.prototype;

import java.util.Objects;

public class Address implements Cloneable {
    private String street;
    private int number;

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

    /**
     * Решение проблемы с клонированием.
     * Так же в таком варианте можем использовать final поля.
     * @param address
     */
    public Address(Address address) {
        this.street = address.getStreet();
        this.number = address.getNumber();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return number == address.number && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number);
    }
}
