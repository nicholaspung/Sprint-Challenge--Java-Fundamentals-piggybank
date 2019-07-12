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

        piggyBank.put(dollar, piggyBank.get(dollar) + 10);
        piggyBank.put(quarter, piggyBank.get(quarter) + 1);
        piggyBank.put(dime, piggyBank.get(dime) + 1);
        piggyBank.put(nickel, piggyBank.get(nickel) + 1);
        piggyBank.put(penny, piggyBank.get(penny) + 1);
        piggyBank.put(dollar, piggyBank.get(dollar) + 20);

        ArrayList<HashMap.Entry<Coin, Integer>> piggyBankArray = new ArrayList<>();
        piggyBankArray.addAll(piggyBank.entrySet());

        System.out.println("Dollar: " + piggyBank.get(dollar));
        System.out.println("Quarter: " + piggyBank.get(quarter));
        System.out.println("Dime: " + piggyBank.get(dime));
        System.out.println("Nickel: " + piggyBank.get(nickel));
        System.out.println("Penny: " + piggyBank.get(penny));

//        System.out.println("The piggy bank holds " + fp.format(myValue));
    }
}
