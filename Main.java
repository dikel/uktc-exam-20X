public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(); // Инициализиране на обекта
        dog.bark();          // Извикване на метода bark
    }

    static class Dog {
        void bark() { // Добавяне на модификатор и тип void
            System.out.println("Bark"); // Правилно извикване на println
        }
    }
}
