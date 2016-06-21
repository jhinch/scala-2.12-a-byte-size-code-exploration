package controls.lambdas;

import java.util.function.Supplier;

public class Example2 {
    @SuppressWarnings("Convert2MethodRef")
    public void useIt() {
        System.out.println(condition(true, () -> this.helloWorld()));
    }

    public void useItWithMethodReference() {
        System.out.println(condition(true, this::helloWorld));
    }

    public String condition(boolean condition, Supplier<String> f) {
        if (condition) {
            return f.get();
        } else {
            return "false";
        }
    }

    public String helloWorld() {
        return "Hello Java 8";
    }
}
