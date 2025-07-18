package se.jku.at.exercise;

import se.jku.at.inout.In;
import se.jku.at.inout.Out;

public class A05_Angebotserstellung {
    static final boolean useInput = true; // internal use only for easier testing
    static final double COST_PER_SQM = 12.50;
    static final double EXTRA_ROOM_UP_TO_40 = 34.00;
    static final double EXTRA_ROOM_UP_TO_80 = 123.00;
    static final double EXTRA_ROOM_80_PLUS = 210.50;
    static final double VAT = 0.20;
    public static void main(String[] args) {
        String companyName;
        String nameContactPerson;
        String address;
        double floorInSqm;
        int noRooms40;
        int noRooms80;
        int noRooms80plus;

        if (useInput) {
            Out.println("Angebotserstellung");
            Out.println("Dateneingabe:");
            Out.print(" Firma: ");
            companyName = In.readLine();
            Out.print(" Name: ");
            nameContactPerson = In.readLine();
            Out.print(" Anschrift: ");
            address = In.readLine();
            Out.print(" Bodenfläche in m²: ");
            floorInSqm = In.readDouble();
            Out.print(" Anzahl Räume bis 40 m²: ");
            noRooms40 = In.readInt();
            Out.print(" Anzahl Räume bis 80 m²: ");
            noRooms80 = In.readInt();
            Out.print(" Anzahl Räume über 80 m²: ");
            noRooms80plus = In.readInt();
        } else {
            companyName= "JKU";
            nameContactPerson= "Maria Moser";
            address= "Altenbergerstr. 69, 4040 Linz";
            floorInSqm = 573.5;
            noRooms40 = 7;
            noRooms80 = 3;
            noRooms80plus = 2;
        }

        double baseCost = floorInSqm * COST_PER_SQM;
        double amountRooms40 = noRooms40 * EXTRA_ROOM_UP_TO_40;
        double amountRooms80 = noRooms80 * EXTRA_ROOM_UP_TO_80;
        double amountRooms80plus = noRooms80plus * EXTRA_ROOM_80_PLUS;
        double netTotal = baseCost + amountRooms40 + amountRooms80 + amountRooms80plus;
        double vat = netTotal * VAT;
        double grossTotal = netTotal + vat;

        Out.println("----------------------------------------------");
        Out.println("Angebot");
        Out.println("Kunde:      " + nameContactPerson);
        Out.println("Firma:      " + companyName);
        Out.println("Adresse:    " + address);
        Out.println("----------------------------------------------");
        Out.println("Kosten pro Quadratmeter:  " + String.format("%,15.2f", COST_PER_SQM)+" Euro");
        Out.println("Aufpreis Räume bis 40m²:  " + String.format("%,15.2f", EXTRA_ROOM_UP_TO_40)+" Euro");
        Out.println("Aufpreis Räume bis 80m²:  " + String.format("%,15.2f", EXTRA_ROOM_UP_TO_80)+" Euro");
        Out.println("Aufpreis Räume über 80m²: " + String.format("%,15.2f", EXTRA_ROOM_80_PLUS)+" Euro");
        Out.println("----------------------------------------------");
        Out.println("Grundpreis: " + String.format("%,.2f", floorInSqm )+ " m² x "
                + String.format("%,.2f", COST_PER_SQM) + " =  "
                + String.format("%,.2f", baseCost) + " Euro");
        Out.println(noRooms40 + " Räume bis 40m²: " + noRooms40 + " x "
                + EXTRA_ROOM_UP_TO_40 + " =\t   " + String.format("%,.2f", amountRooms40) + " Euro");
        Out.println(noRooms80 + " Räume bis 80m²: " + noRooms80 + " x "
                + EXTRA_ROOM_UP_TO_80 + " =\t   " + String.format("%,.2f", amountRooms80) + " Euro");
        Out.println(noRooms80plus + " Räume über 80m²: " + noRooms80plus + " x "
                + EXTRA_ROOM_80_PLUS + " =\t   " + String.format("%,.2f", amountRooms80plus) + " Euro");
        Out.println("----------------------------------------------");
        Out.println("Netto:\t\t\t  " + String.format("%,15.2f", netTotal) + " Euro");
        Out.println((VAT*100)+"% MwSt.:\t\t  " + String.format("%,15.2f", vat) + " Euro");
        Out.println("Brutto:\t\t\t  " + String.format("%,15.2f", grossTotal) + " Euro");
        Out.println("----------------------------------------------");
    }
}
