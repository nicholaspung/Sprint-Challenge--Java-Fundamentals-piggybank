package PiggyBank;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        ArrayList<HashMap<Coin, Integer>> piggyBank = new ArrayList<HashMap<Coin, Integer>>();
        piggyBank.add(new Dollar(2)); // returns a HashMap<Coin, Integer>

        System.out.println("The piggy bank holds " + fp.format(myValue));
    }
}
