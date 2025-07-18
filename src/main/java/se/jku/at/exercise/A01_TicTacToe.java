package se.jku.at.exercise;

import se.jku.at.inout.In;
import se.jku.at.inout.Out;

public class A01_TicTacToe {
    public static void main(String[] args) {
        // ################################
        // ########## First Part ##########
        // ################################

        // one string per line
        Out.println("+---+---+---+");
        Out.println("|   |   |   |");
        Out.println("+---+---+---+");
        Out.println("|   |   |   |");
        Out.println("+---+---+---+");
        Out.println("|   |   |   |");
        Out.println("+---+---+---+");


        // ################################
        // ######### Second Part ##########
        // ################################


        // code reuse by introducing variables
        String delimiterRow = "+---+---+---+";
        String valueRow = "|   |   |   |";

        // print out field
        Out.println(delimiterRow);
        Out.println(valueRow);
        Out.println(delimiterRow);
        Out.println(valueRow);
        Out.println(delimiterRow);
        Out.println(valueRow);
        Out.println(delimiterRow);



        // ################################
        // ########## Third Part ##########
        // ################################

        // read in values
        Out.print("Enter value for row 1 and col 1:");
        char row1col1 = In.readChar();
        Out.print("Enter value for row 1 and col 2: ");
        char row1col2 = In.readChar();
        Out.print("Enter value for row 1 and col 3: ");
        char row1col3 = In.readChar();
        Out.print("Enter value for row 2 and col 1: ");
        char row2col1 = In.readChar();
        Out.print("Enter value for row 2 and col 2: ");
        char row2col2 = In.readChar();
        Out.print("Enter value for row 2 and col 3: ");
        char row2col3 = In.readChar();
        Out.print("Enter value for row 3 and col 1: ");
        char row3col1 = In.readChar();
        Out.print("Enter value for row 3 and col 2: ");
        char row3col2 = In.readChar();
        Out.print("Enter value for row 3 and col 3: ");
        char row3col3 = In.readChar();



        String delimiterSymbol = " | ";
        String delimiterRowWithSpace = " +---+---+---+ ";
        // print out field
        Out.println(delimiterRowWithSpace);
        Out.println(delimiterSymbol + row1col1 + delimiterSymbol + row1col2 + delimiterSymbol + row1col3 + delimiterSymbol);
        Out.println(delimiterRowWithSpace);
        Out.println(delimiterSymbol + row2col1 + delimiterSymbol + row2col2 + delimiterSymbol + row2col3 + delimiterSymbol);
        Out.println(delimiterRowWithSpace);
        Out.println(delimiterSymbol + row3col1 + delimiterSymbol + row3col2 + delimiterSymbol + row3col3 + delimiterSymbol);
        Out.println(delimiterRowWithSpace);

    }
}
