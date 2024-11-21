public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(); // Create a new Cat instance
        cat.meow(); // Call the meow method
    }

    static class Cat {
        void meow() { // Add the return type 'void' to the method
            System.out.println("Meow"); // Print "Meow"
        }
    }
}update my guy