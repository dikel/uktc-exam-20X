public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }

    static class Dog {
        void bark() {
            System.out.println("Bark");
        }
    }
}
