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
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите название товара:");
            String item = scanner.next();
            System.out.println("Введите стоимость товара:");
            double itemCost = scanner.nextDouble();
            Product newProduct = new Product(item, itemCost);
            System.out.println("Товар успешно добавлен.");
            sum += newProduct.cost;
            items.add(newProduct);
            System.out.println("Хотите ввести еще товар?");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Завершить")) {
                scanner.close();
                break;
            }
        }
    }
}