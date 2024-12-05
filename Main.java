public class Main {

    public static void main(String[] args) {
        Dog dog;
        dog.bark();
    }

    static class Dog {
        bark() {
            System.out.println("Bark");
        }
    }
}
