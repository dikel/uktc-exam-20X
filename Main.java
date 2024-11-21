public class Main {

    public static void main(String[] args) {
        Dog dog;
        dog.bark();
        dog.jump();
    }

    static class Dog {
        bark() {
            println("Bark");
        }
        jump(){println("Jump");}
    }
}
