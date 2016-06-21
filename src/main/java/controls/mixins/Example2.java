package controls.mixins;

public interface Example2 {

    default int combine(int a, int b) {
        return a + b;
    }

}

class Example2Impl implements Example2 {
}