package PiggyBank;

public class Nickel extends Coin {
    private String name = "Nickel";
    private double value = 0.05;
    private int quantity;

    public Nickel() {
        quantity = 1;
    }

    public Nickel(int quantity) {
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
            System.out.println(quantity + " " + name + "s");
        }
        System.out.println(quantity + " " + name);
    }
}
