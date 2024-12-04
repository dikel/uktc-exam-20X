public class Main {

    public static void main(String[] args) {
        Dog dog;
        dog.bark();
        Cow cow;
        cow.moo();
    }

    static class Dog {
        bark() {
            println("Bark");
        }
    }

    static class Cow {
        moo() {
            println("MOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        }
    }

}
