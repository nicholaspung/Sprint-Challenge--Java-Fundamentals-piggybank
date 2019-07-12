package PiggyBank;

public class Dollar extends Coin {
    private String name = "Dollar";
    private double value = 1.00;
    private int quantity;

    public Dollar() {
        quantity = 1;
    }

    public Dollar(int quantity) {
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
        } else {
            System.out.println(quantity + " " + name);
        }
    }
}
