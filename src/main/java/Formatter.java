import java.util.ArrayList;

public class Formatter {
    double toRound(double number) {
        double roundedNumber = Math.round(number * 100.0) / 100.0;
        return roundedNumber;
    }

    public String toFormatRubles(double number) {
        int check = (int) number % 100 / 10;
        if (check == 1)
        {
            return "рублей";
        }
        switch ((int) number % 10) {
            case 1:
                return "рубль";
            case 2:
            case 3:
            case 4:
                return "рубля";
            default:
                return "рублей";
        }
    }

    public static void printStrings(ArrayList<Product> product) {
        for (int i = 0; i < product.size(); i++) {
            System.out.println(product.get(i).toString());
        }
    }
}
