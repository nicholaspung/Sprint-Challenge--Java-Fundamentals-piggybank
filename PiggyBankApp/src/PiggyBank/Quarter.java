package PiggyBank;

public class Quarter extends Coin {
    private String name = "Quarter";
    private double value = 0.25;
    private int quantity;

    public Quarter() {
        quantity = 1;
    }

    public Quarter(int quantity) {
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
