import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! На сколько человек разделить счёт?");
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Пожалуйста, введите число!");
                scanner.nextLine();
            }
            int guests = scanner.nextInt();
            if (guests < 1) {
                System.out.println("Введите, пожалуйста, корректное количество гостей");
            } else if (guests == 1) {
                System.out.println("Для разделения счёта необходимо ввести более одного гостя");
            } else {
                Calculator calculator = new Calculator(guests);
                calculator.toSumItems();
                Formatter formatter = new Formatter();
                double result = formatter.toRound(calculator.sum / guests);
                System.out.println("Добавленные товары: ");
                Formatter.printStrings(calculator.items);
                String rublesResult = String.format("\nСумма к оплате: %.2f %s", result,
                        formatter.toFormatRubles(result));
                System.out.println(rublesResult);
                break;
            }
        }
        scanner.close();
    }
}

