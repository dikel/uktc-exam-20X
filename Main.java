 public static void main(String[] args) {
        Dog dog;
        dog.bark();

        Cat cat;
        cat.meow();
    }

    static class Dog {
        bark() {
            println("Tom");
        }
    }
    static class Cat {
        meow() {
            println("Meow");
        }
    }
}
