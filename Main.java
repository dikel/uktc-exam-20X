public class Main {

    public static void main(String[] args) {
        Dog dog;
        dog.bark();

        Cat cat;
        cat.meow();
    }

    static class Dog {
        bark() {
            println("Bark");
        }
    }
    static class Cat {
        meow() {
            println("Meow");
        }
    }
}
