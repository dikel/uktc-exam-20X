public class Main {

    public static void main(String[] args) {
        Mouse mouse = new Mouse;
        mouse.squeak();
    }

    static class Mouse {
        void squeak() {
            System.println("Squeak");
        }
    }
}
