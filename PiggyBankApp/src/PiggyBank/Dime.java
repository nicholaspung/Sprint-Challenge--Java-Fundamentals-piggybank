package PiggyBank;

public class Dime extends Coin {
    private String name = "Dime";
    private double value = 0.10;
    private int quantity;

    public Dime() {
        quantity = 1;
    }

    public Dime(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double printTotalValue(int quantity) {
        return quantity * value;
    }

    public void printAdded() {
        if (quantity > 1) {
            System.out.println(quantity + name + "s");
        }
        System.out.println(quantity + name);
    }
}
