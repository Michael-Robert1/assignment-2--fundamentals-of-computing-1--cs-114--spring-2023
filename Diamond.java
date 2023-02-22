// *****************************************************************************
// Diamond.java       Author: Michael Robert
//
// Submission for Assignment 2 in CS 114
// *****************************************************************************

//Import libraries
import java.util.Scanner;

public class Diamond {
  // ---------------------------------------------------------------------------
  //  Print a diamond based on dimensions entered by the user
  // ---------------------------------------------------------------------------
  public static void main(String[] args) {
    //Declare and Initialize variables
    String repeatedString;
    String repeatedSpace;

    //Create new objects
    Scanner input = new Scanner(System.in);

    //Print two blank lines to give space for the program
    System.out.println();
    System.out.println();

    //Request&retrieve user input for diamond size, assign to final int variable
    System.out.println("Enter a width for your Diamond: ");
    final int DIAMOND_SIZE = input.nextInt();

    //Change shape of diamond depending on if DIAMOND_SIZE is even or odd
    if(DIAMOND_SIZE % 2 == 1) {
      repeatedString = "*";
      repeatedSpace = " ";
    } else {
      repeatedString = " *";
      repeatedSpace = "  ";
    }

    //Generate and print diamond layers for top half of diamond
    int row = 0;
    for( ; row < (DIAMOND_SIZE-1)/2; row++) {

      for(int j = row; j < (DIAMOND_SIZE)/2; j++) {
        System.out.print(repeatedSpace);
      }

      for(int j = 0; j < (row*2)+1; j++) {
        System.out.print(repeatedString);
      }

      //Return carriage to print on next line
      System.out.println();
    }

    //Generate and print diamond layers for bottom half of diamond
    for( ; row >= 0; row--) {

      for(int j = row; j < (DIAMOND_SIZE)/2; j++) {
        System.out.print(repeatedSpace);
      }

      for(int j = 0; j < (row*2)+1; j++) {
        System.out.print(repeatedString);
      }
      //Return carriage to print on next line
      System.out.println();
    }

    //Prevent resource leak
    input.close();
  }
}
