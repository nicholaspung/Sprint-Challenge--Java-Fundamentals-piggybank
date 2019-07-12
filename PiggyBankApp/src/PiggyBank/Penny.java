package PiggyBank;

public class Penny extends Coin {
    private String name = "Penny";
    private double value = 0.01;
    private int quantity;

    public Penny() {
        quantity = 1;
    }

    public Penny(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double printTotalValue() {
        return quantity * value;
    }

    public void printAdded() {
        if (quantity > 1) {
            System.out.println(quantity + " Pennies");
        } else {
            System.out.println(quantity + " " + name);
        }
    }
}
