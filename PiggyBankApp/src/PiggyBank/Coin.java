package PiggyBank;

public abstract class Coin {
    private String name;
    private double value;
    private int quantity;

    public Coin() {
        quantity = 1;
    }

    public Coin(int quantity) {
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
