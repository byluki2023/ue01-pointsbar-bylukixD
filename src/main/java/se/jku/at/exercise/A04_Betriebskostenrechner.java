package se.jku.at.exercise;

import se.jku.at.inout.In;
import se.jku.at.inout.Out;

public class A04_Betriebskostenrechner {
    static final boolean useInput = true; // internal use only for easier testing
    public static void main(String[] args) {
        double fuelPer100km; // Verbrauch/100km
        double fuelCostPerLiter; // Benzinkosten/l
        int distance; // km
        final double MAINTENANCE_PER_100_KM = 4.2;

        if (useInput) {
            Out.println("Dateneingabe: ");
            Out.print("       Gefahrene Kilometer: ");
            distance = In.readInt();
            Out.print("       Verbrauch/100km: ");
            fuelPer100km = In.readDouble();
            Out.print("       Benzinkosten/Liter: ");
            fuelCostPerLiter = In.readDouble();
            Out.println();
        } else {
            fuelPer100km = 7.5;
            fuelCostPerLiter = 1.995;
            distance = 1000;
        }

        double usedFuel = distance / 100.0 * fuelPer100km;
        double fuelCost = usedFuel * fuelCostPerLiter;
        double maintenanceCost = distance / 100.0 * MAINTENANCE_PER_100_KM;
        double totalCost = fuelCost + maintenanceCost;

        Out.println("Daten: ");
        Out.println("       Distanz:            " + String.format("%,10d", distance)+ " km");
        Out.println("       Treibstoffkosten/l: " + String.format("%,10.2f", fuelCostPerLiter) + " Euro");
        Out.println("       Verbrauch (l/100km):" + String.format("%,10.2f", fuelPer100km) + " l");
        Out.println("       Wartung pro 100km:  " + String.format("%,10.2f", MAINTENANCE_PER_100_KM) + " Euro");
        Out.println("Fahrtkosten: ");
        Out.println("       Treibstoffkosten:   " + String.format("%,10.2f", fuelCost) + " Euro");
        Out.println("       Wartungskosten:     " + String.format("%,10.2f", maintenanceCost) + " Euro");
        Out.println("       Gesamtkosten:       " + String.format("%,10.2f", totalCost) + " Euro");
    }
}

