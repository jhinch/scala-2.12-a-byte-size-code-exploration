package controls.lambdas;

import java.util.function.BiFunction;

public class Example3 {
    @SuppressWarnings("Convert2MethodRef")
    public void doIt() {
        System.out.println(withTwo("Hello", 1, (s, i) -> s.substring(i)));
    }

    public void doItWithMethodReference() {
        System.out.println(withTwo("Hello", 1, String::substring));
    }

    public String withTwo(String s, int i, BiFunction<String, Integer, String> f) {
        return f.apply(s, i);
    }
}