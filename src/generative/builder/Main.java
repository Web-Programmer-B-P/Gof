package generative.builder;

/**
 * Паттерн строитель(Builder).
 *
 * Проблема есть множество полей класса, но не все они обязательные, чтобы создать объект с такими полями,
 * нужно писать множество видов различных конструкторов.
 *
 * Решение описать интерфес билдер и через символ "." набирать необходимые поля.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilderImpl()
                .age(20)
                .name("Igor")
                .salary(20.0)
                .build();

        System.out.println(person);
    }
}
