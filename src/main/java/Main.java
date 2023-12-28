import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! На сколько человек разделить счёт?");
        while (true) {
            String blank = scanner.next();
            try {
                int guests = Integer.parseInt(blank);
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
                    System.out.println("\nСумма к оплате: " + result + " " +
                            formatter.toFormatRubles(result));
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Пожалуйста, введите число!");
            }
        }
        scanner.close();
    }
}

