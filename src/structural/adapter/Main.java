package structural.adapter;

/**
 * Чтобы подключить радио к сети, нужна европейская розетка, а у нас американские розетки.
 * Решить проблему можно через адаптер, в который мы сможем вставить европейскую вилку.
 * Для этого в класс адаптер, на вход передаем американскую розетку и в европейской реализации метода getPower()
 * вызываем americanSocket.getPower();
 */
public class Main {
    public static void main(String[] args) {
        //Американская розетка
        AmericanSocket socket = new SimpleAmericanSocket();

        //Адаптер евро-американский
        EuroSocket adapter = new EuroAmericanAdapter(socket);

        EuroRadio euroRadio = new EuroRadio();

        //Через адаптер вставляем вилку в сеть
        euroRadio.listenMusic(adapter);
    }
}
