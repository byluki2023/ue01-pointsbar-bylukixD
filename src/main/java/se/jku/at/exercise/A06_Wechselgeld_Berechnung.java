package se.jku.at.exercise;

import se.jku.at.inout.In;
import se.jku.at.inout.Out;

public class A06_Wechselgeld_Berechnung {
    static final boolean useInput = true; // internal use only for easier testing
    public static void main(String[] args) {
        int dollars,cents,rest;

        if (useInput) {
            Out.print("Enter dollars: ");
            dollars = In.readInt();
            Out.print("Enter cents: ");
            cents = In.readInt();
        } else {
            dollars = 983;
            cents= 93;
        }

        int bill100 = dollars / 100;
        rest = dollars - bill100 * 100;
        int bill50 = rest / 50;
        rest = rest - bill50 * 50;
        int bill20 = rest / 20;
        rest = rest - bill20 * 20;
        int bill10 = rest / 10;
        rest = rest - bill10 * 10;
        int bill5 = rest / 5;
        rest = rest - bill5 * 5;
        int bill1 = rest / 1;
        rest = rest - bill1 * 1;
        int coin25 = cents / 25;
        rest = cents - coin25 * 25;
        int coin10 = rest / 10;
        rest= rest - coin10 * 10;
        int coin5= rest / 5;
        rest= rest - coin5 *5;
        int coin1= rest / 1;
        rest= rest - coin1 * 1;

        Out.println("Amount: " + String.format("$%,d.%2d", dollars,cents));
        Out.println("Franklins: " + bill100 + " x $100");
        Out.println("Grants: " + bill50 + " x $50");
        Out.println("Jacksons: " + bill20 + " x $20");
        Out.println("Hamiltons: " + bill10 + " x $10");
        Out.println("Lincolns: " + bill5 + " x $5");
        Out.println("Bucks: " + bill1 + " x $1");
        Out.println("Quarters: " + coin25 + " x ¢25");
        Out.println("Dimes: " + coin10 + " x ¢10");
        Out.println("Nickels: " + coin5 + " x ¢05");
        Out.println("Pennies: " + coin1 + " x ¢01");
        Out.print(bill100 + " x 100 + ");
        Out.print(bill50 + " x 50 + ");
        Out.print(bill20 + " x 20 + ");
        Out.print(bill10 + " x 10 + ");
        Out.print(bill5 + " x 5 + ");
        Out.println(bill1 + " x 1 + ");
        Out.print(coin25 + " x 0.25 + ");
        Out.print(coin10 + " x 0.10 + ");
        Out.print(coin5 + " x 0.05 + ");
        Out.print(coin1 + " x 0.01 = ");
        Out.println(dollars+"."+cents);
    }
}
