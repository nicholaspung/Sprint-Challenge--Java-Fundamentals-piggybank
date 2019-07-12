package PiggyBank;

public class Coin {
    private String name;
    private double value;

    public Coin(String name, double value) {
        this.name = name;
        this.value = value;
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
}
