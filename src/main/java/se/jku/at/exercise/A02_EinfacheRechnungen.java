package se.jku.at.exercise;

import se.jku.at.inout.In;
import se.jku.at.inout.Out;

public class A02_EinfacheRechnungen {
    public static void main(String[] args) {
        int number1;
        int number2;
        int result;

        Out.print("Zahl eingeben: ");
        number1 = In.readInt();
        Out.print("Zahl für Addition eingeben: ");
        number2 = In.readInt();
        result = number1 + number2;
        Out.println("Addition: " + number1 + " + " + number2 + " = " + result);

        number1 = result;
        Out.print("Zahl für Subtraktion eingeben: ");
        number2 = In.readInt();
        result = number1 - number2;
        Out.println("Subtraktion: " + number1 + " - " + number2 + " = " + result);

        number1 = result;
        Out.print("Zahl für Multiplikation eingeben: ");
        number2 = In.readInt();
        result = number1 * number2;
        Out.println("Multiplikation: " + number1 + " * " + number2 + " = " + result);

        number1 = result;
        Out.print("Zahl für Division eingeben: ");
        number2 = In.readInt();
        result = number1 / number2;
        Out.println("Division: " + number1 + " / " + number2 + " = " + result);

        number1 = result;
        Out.print("Zahl für Divisionsrest eingeben: ");
        number2 = In.readInt();
        result = number1 % number2;
        Out.println("Divisionsrest: " + number1 + " % " + number2 + " = " + result);
    }
}
