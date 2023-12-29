public class Product {
    String name;
    double cost;

    Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String toString() {
        return String.format("%s %.2f", name, cost) ;
    }
}
