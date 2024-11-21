public class Main {

    public static void main(String[] args) {
        // Correct object instantiation with parentheses
        Mouse mouse = new Mouse();
        mouse.squeak();
    }

    static class Mouse {
        // Add the return type 'void' to the method
        void squeak() {
            // Correct print statement
            System.out.println("Squeak");
        }
    }
}

