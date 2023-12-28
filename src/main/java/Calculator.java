import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    int people;
    double sum;
    ArrayList<Product> items;

    Calculator(int people) {
        this.people = people;
        this.sum = 0;
        this.items = new ArrayList<>();
    }

    void toSumItems() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String item = toDefineName(scanner);
            double itemCost = toDefineCost(scanner);
            if (itemCost < 0) {
                System.out.println("Введите положительное число!");
            } else {
                Product newProduct = new Product(item, itemCost);
                System.out.println("Товар успешно добавлен.");
                sum += newProduct.cost;
                items.add(newProduct);
                System.out.println("Хотите ввести еще товар? Для выхода введите слово Завершить");
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("Завершить")) {
                    scanner.close();
                    break;
                }
            }
        }
    }

    String toDefineName(Scanner scanner) {
        System.out.println("Введите название товара:");
        return scanner.nextLine();
    }

    Double toDefineCost(Scanner scanner) {
        System.out.println("Введите стоимость товара:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Введите число!");
            scanner.nextLine();
        }
        return scanner.nextDouble();
    }
}