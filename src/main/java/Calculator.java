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
            System.out.println("Введите название товара:");
            String item = scanner.nextLine();
            if (item.replaceAll("\\s", "").isEmpty()) {
                System.out.println("Введите какой-то текст");
            } else {
                while (true) {
                    System.out.println("Введите стоимость товара:");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Введите число!");
                        scanner.nextLine();
                    }
                    double itemCost = scanner.nextDouble();
                    if (itemCost < 0) {
                      System.out.println("Введите положительное число!");
                    } else {
                        scanner.nextLine();
                        Product newProduct = new Product(item, itemCost);
                        System.out.println("Товар успешно добавлен.");
                        sum += newProduct.cost;
                        items.add(newProduct);
                        break;
                    }
                }
                System.out.println("Хотите ввести еще товар? Для выхода введите слово Завершить");
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("Завершить")) {
                    scanner.close();
                    break;
                }
            }
        }
    }
}