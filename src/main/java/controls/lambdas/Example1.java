package controls.lambdas;

import java.util.function.Supplier;

public class Example1 {
    public void useIt() {
        System.out.println(condition(true, () -> "Hello Java 8"));
    }

    public String condition(boolean condition, Supplier<String> f) {
        if (condition) {
            return f.get();
        } else {
            return "false";
        }
    }
}