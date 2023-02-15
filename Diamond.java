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
    //Create new objects
    Scanner input = new Scanner(System.in);

    //Print two blank lines to give space for the program
    System.out.println("");
    System.out.println("");

    //Request/retrieve user input for diamond size, assign to final int variable
    System.out.println("Enter a width/height for the diamond: ");
    final int DIAMOND_SIZE = input.nextInt();

    //Generate and print diamond
    for(int i = 1; i <= DIAMOND_SIZE; i++) {

    }

    //Prevent resource leak
    input.close();
  }
}
