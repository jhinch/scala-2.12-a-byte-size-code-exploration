package controls.mixins;



    interface Example3 extends Example3Mixin1, Example3Mixin2 {
    }

    interface Example3Mixin1 {
        default int plus(int a, int b) {
            return a + b;
        }
    }

    interface Example3Mixin2 {
        default int times(int a, int b) {
            return a * b;
        }
    }



class Example3Impl implements Example3 {
}