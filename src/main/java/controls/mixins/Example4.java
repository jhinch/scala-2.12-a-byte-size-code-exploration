package controls.mixins;

public interface Example4 {

    String augment(String value);

    static String sequence(Example4 a, Example4 b, String value) {
        return b.augment(a.augment(value));
    }

}
