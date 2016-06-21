package controls.lambdas;

import java.util.function.Function;

public class Example4 {
    public void encloseIt(int i) {
        System.out.println(aug(s -> s.substring(i)));
    }

    public String aug(Function<String, String> f) {
        return f.apply("Hello");
    }
}