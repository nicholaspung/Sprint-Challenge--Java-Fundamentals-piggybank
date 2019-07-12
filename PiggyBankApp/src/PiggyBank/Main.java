package PiggyBank;

import java.util.ArrayList;
import java.util.HashMap;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        Coin dollar = new Coin("Dollar", 1.00);
        Coin quarter = new Coin("Quarter", 1.00);
        Coin dime = new Coin("Dime", 1.00);
        Coin nickel = new Coin("Nickel", 1.00);
        Coin penny = new Coin("Penny", 1.00);

        HashMap<Coin, Integer> piggyBank = new HashMap<>();
        piggyBank.put(dollar, 0);
        piggyBank.put(quarter, 0);
        piggyBank.put(dime, 0);
        piggyBank.put(nickel, 0);
        piggyBank.put(penny, 0);

        ArrayList<HashMap<Coin, Integer>> piggyBankArray = new ArrayList<HashMap<Coin, Integer>>();


        System.out.println("The piggy bank holds " + fp.format(myValue));
    }
}
