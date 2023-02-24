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
    System.out.println();
    System.out.println();

    //Request&retrieve user input for diamond size, assign to final int variable
    System.out.println("Enter a width for your Diamond: ");
    final int DIAMOND_SIZE = input.nextInt();


    //Change shape of diamond depending on if DIAMOND_SIZE is even or odd
    if(DIAMOND_SIZE % 2 == 1) {
      //Run this code if the width for the diamond is odd

      //Generate and print diamond layers for top half of diamond
      int row = 0;
      for( ; row < (DIAMOND_SIZE-1)/2; row++) {

        //Print the spaces
        for(int i = row; i < (DIAMOND_SIZE-1)/2; i++) {
          System.out.print(" ");
        }

        //Print the stars
        for(int i = 0; i < (row*2)+1; i++) {
          System.out.print("*");
        }

        //Return carriage to print on next line
        System.out.println();
      }

      //Generate and print diamond layers for bottom half of diamond
      for( ; row >= 0; row--) {

        //Print the spaces
        for(int i = row; i < (DIAMOND_SIZE-1)/2; i++) {
          System.out.print(" ");
        }

        //Print the stars
        for(int i = 0; i < (row*2)+1; i++) {
          System.out.print("*");
        }

        //Return carriage to print on next line
        System.out.println();
      }

    } else {
      //Run this code if the width for the diamond is even

      //Generate and print diamond layers for top half of diamond
      int row = 0;
      for( ; row < (DIAMOND_SIZE-1); row++) {

        //Print the spaces
        for(int j = row; j < (DIAMOND_SIZE-1); j++) {
          System.out.print(" ");
        }

        //Print the stars
        for(int j = 0; j < (row+1); j++) {
          System.out.print("* ");
        }

        //Return carriage to print on next line
        System.out.println();
      }

      //Generate and print diamond layers for middle and bottom half of diamond
      for( ; row >= 0; row--) {

        //Print the spaces
        for(int j = row; j < (DIAMOND_SIZE-1); j++) {
          System.out.print(" ");
        }

        //Print the stars
        for(int j = 0; j < (row+1); j++) {
          System.out.print("* ");
        }

        //Return carriage to print on next line
        System.out.println();
      }
    }

    //Prevent resource leak
    input.close();
  }
}
