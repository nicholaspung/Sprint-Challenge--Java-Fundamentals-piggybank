package PiggyBank;

public abstract class Coin {
    private String name;
    private double value;

    public Coin(String name, double value) {
        this.name = name;
        this.value = value;
    }
}
