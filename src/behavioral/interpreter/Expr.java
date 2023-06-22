package behavioral.interpreter;

import java.util.Map;

public interface Expr {
    int interpreter(Map<String, Integer> context);

    static Expr plus(Expr left, Expr right) {
        return context -> left.interpreter(context) + right.interpreter(context);
    }

    static Expr minus(Expr left, Expr right) {
        return context -> left.interpreter(context) - right.interpreter(context);
    }

    static Expr variable(String name) {
        return context -> context.getOrDefault(name, 0);
    }
}
