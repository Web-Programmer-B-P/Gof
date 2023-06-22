package behavioral.chain;

/**
 * Паттерн цепочка ответственности(Chain of responsibility)
 * <p>
 * Паттерн позволяет построить цепочку в которой, каждый участник будет выполнять свою задачу,
 * например проверка сообщения, печать сообщения, добавление какого то символа, если на каком то шаге,
 * что то пошло не так, цепочка прерывается.
 */
public class Main {
    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageVerifyHandler(
                new MessageAddExplanationMarkHandler(
                        new MessagePrintHandler(null)
                )
        );
        messageHandler.handle("Hello World");
    }
}
