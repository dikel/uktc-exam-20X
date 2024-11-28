public class Main {

    public static void main(String[] args) {
        Mouse mouse = new Mouse(); // Сложени са правилни скоби за създаване на обект.
        mouse.squeak(); // Извиква се методът squeak.
    }

    static class Mouse {
        void squeak() { // Дефинирано е връщаемият тип на метода (void).
            System.out.println("Squeak"); // Поправено е "System.println" на "System.out.println".
        }
    }
}

