package behavioral.interpreter;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Паттерн интерпретатор(Interpreter).
 */
public class Main {
    public static void main(String[] args) {
        String exp = "a + b";
        Expr parse = parse(exp);

        Map<String, Integer> context = new HashMap<>();
        context.put("a", 10);
        context.put("b", 35);
        int result = parse.interpreter(context);
        System.out.println(result);
    }

    private static Expr parse(String exp) {
        ArrayDeque<Expr> stack = new ArrayDeque<>();
        Arrays.stream(exp.split(" "))
                .filter(token -> Character.isLetter(token.charAt(0)))
                .forEach(token -> stack.push(parseToken(token, stack)));

        Arrays.stream(exp.split(" "))
                .filter(token -> !Character.isLetter(token.charAt(0)))
                .forEach(token -> stack.push(parseToken(token, stack)));

        return stack.pop();
    }

    private static Expr parseToken(String token, ArrayDeque<Expr> stack) {
        Expr left;
        Expr right;
        if ("+".equals(token)) {
            right = stack.pop();
            left = stack.pop();
            return Expr.plus(left, right);
        } else if ("-".equals(token)) {
            right = stack.pop();
            left = stack.pop();
            return Expr.minus(left, right);
        }
        return Expr.variable(token);
    }
}
