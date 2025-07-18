package se.jku.at.exercise;

import se.jku.at.inout.In;
import se.jku.at.inout.Out;

public class A03_Lohnberechnungen {
    static final boolean useInput = true; // internal use only for easier testing
    static final int BASE_SALARY_MR = 40_000;
    static final int BASE_SALARY_MS = 42_000;
    static final int BONUS_MR = 1_000;
    static final int BONUS_MS = 1_500;
    static final int ASSEMBLY_MR = 50;
    static final int ASSEMBLY_MS = 50;

    public static void main(String[] args) {
        int noAssemblyMr;
        int noAssemblyMs;

        if (useInput) {
            Out.print("Anzahl Montagetage von Herrn Moser: ");
            noAssemblyMr = In.readInt();
            Out.print("Anzahl Montagetage von Frau Moser: ");
            noAssemblyMs = In.readInt();
        } else {
            noAssemblyMr = 33;
            noAssemblyMs = 28;
        }

        int incomeMr = BASE_SALARY_MR + BONUS_MR + noAssemblyMr * ASSEMBLY_MR;
        int incomeMs = BASE_SALARY_MS + BONUS_MS + noAssemblyMs * ASSEMBLY_MS;
        int totalIncome = incomeMr + incomeMs;
        boolean isFormatted = true;

        if (isFormatted) {
            Out.println("Gehaltsberechnung");
            Out.println("Frau Moser:");
            Out.println(" Grundgehalt:          " + String.format("%,10d", BASE_SALARY_MS) + " Euro");
            Out.println(" Bonus:                " + String.format("%,10d", BONUS_MS) + " Euro");
            Out.println(" Montage:              " + String.format("%,10d", (noAssemblyMs * ASSEMBLY_MS))
                    + " Euro (" + noAssemblyMs + "*" + ASSEMBLY_MS + ")");
            Out.println(" Gesamt:               " + String.format("%,10d", incomeMs) + " Euro");

            Out.println("Herr Moser:");
            Out.println(" Grundgehalt:          " + String.format("%,10d", BASE_SALARY_MR) + " Euro");
            Out.println(" Bonus:                " + String.format("%,10d", BONUS_MR) + " Euro");
            Out.println(" Montage:              " + String.format("%,10d", (noAssemblyMr * ASSEMBLY_MR))
                    + " Euro (" + noAssemblyMr + "*" + ASSEMBLY_MR + ")");
            Out.println(" Gesamt:               " + String.format("%,10d", incomeMr) + " Euro");

            Out.println("Gemeinsames Einkommen: " + String.format("%,10d", totalIncome) + " Euro");
        } else {
            Out.println("Gehaltsberechnung");
            Out.println("Frau Moser: ");
            Out.println(" Grundgehalt: " + BASE_SALARY_MS);
            Out.println(" Bonus: " + BONUS_MS);
            Out.println(" Montage: " + (noAssemblyMs * ASSEMBLY_MS)
                    + " (" + noAssemblyMs + "*" + ASSEMBLY_MS + ")");
            Out.println(" Gesamt: " + incomeMs);

            Out.println("Herr Moser: ");
            Out.println(" Grundgehalt: " + BASE_SALARY_MR);
            Out.println(" Bonus: " + BONUS_MR);
            Out.println(" Montage: " + (noAssemblyMr * ASSEMBLY_MR)
                    + " (" + noAssemblyMr + "*" + ASSEMBLY_MR + ")");
            Out.println(" Gesamt: " + incomeMr);

            Out.println("Gemeinsames Einkommen: " + totalIncome + " Euro");
        }
    }
}
