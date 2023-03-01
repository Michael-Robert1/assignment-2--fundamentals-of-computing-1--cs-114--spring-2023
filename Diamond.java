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
    if((DIAMOND_SIZE%2) == 1) {
      //Run this code if the width for the diamond is odd

      //Generate and print diamond layers for top half of diamond
      int row = 0;  //Row number starts at 0
      /*The number of rows in the top half of the diamond is equal to half the
        size minus 1*/
      for( ; row < ((DIAMOND_SIZE-1)/2); row++) {

        //Print the spaces that precede the stars
        /*# of spaces before the stars is equal to half the size minus 1 and
          decreases with each row*/
        for(int i = 0; i < (((DIAMOND_SIZE-1)/2)-row); i++) {
          System.out.print(" ");
        }

        //Print the stars
        /*Number of stars on any row is equal to the row number multiplied by
          two, plus one*/
        for(int i = 0; i < ((row*2)+1); i++) {
          System.out.print("*");
        }

        //Return carriage to print on next line
        System.out.println();
      }

      //Generate and print diamond layers for middle & bottom half of diamond
      //Row number decreases with each row on the bottom half
      for( ; row >= 0; row--) {

        //Print the spaces that precede the stars
        /*# of spaces before the stars in the top half is equal to half the
          width minus 1 and is subtracted by the row number*/
        for(int i = 0; i < (((DIAMOND_SIZE-1)/2)-row); i++) {
          System.out.print(" ");
        }

        //Print the stars
        /*Number of stars on any row in the top half is equal to the row number
          multiplied by two, plus one*/
        for(int i = 0; i < ((row*2)+1); i++) {
          System.out.print("*");
        }

        //Return carriage to print on next line
        System.out.println();
      }

    } else {
      //Run this code if the width for the diamond is even

      //Prints top tip of diamond
      //On the tip, the spaces before the star equals the size minus 1
      for(int j = 0; j < (DIAMOND_SIZE-1); j++) {
        System.out.print(" ");
      }
      System.out.println("* ");


      //Generate and print diamond layers for top half of diamond
      int row = 1;  //Row number starts at 1
      //The number of rows in the top half is equal to the size divided by 2
      for( ; row < (DIAMOND_SIZE/2); row++) {

        //Print the spaces
        /*The number of spaces before the stars is equal to the size minus
        double the row number*/
        for(int j = 0; j < ((DIAMOND_SIZE)-(2*row)); j++) {
          System.out.print(" ");
        }

        //Print the stars
        //The number of stars on each row is equal to double the row number
        for(int j = 0; j < (row*2); j++) {
          System.out.print("* ");   //Even diamonds have a space after each star
        }

        //Return carriage to print on next line
        System.out.println();
      }

      //Generate and print diamond layers for middle and bottom half of diamond
      //Row number decreases with each row on the bottom half
      for( ; row > 0; row--) {

        //Print the spaces
        /*The number of spaces before the stars is equal to the size minus
        double the row number*/
        for(int j = 0; j < ((DIAMOND_SIZE)-(2*row)); j++) {
          System.out.print(" ");
        }

        //Print the stars
        //The number of stars on each row is equal to double the row number
        for(int j = 0; j < (row*2); j++) {
          System.out.print("* ");   //Even diamonds have a space after each star
        }

        //Return carriage to print on next line
        System.out.println();
      }

      //Prints bottom tip of diamond
      //On the tip, the spaces before the star equals the size minus 1
      for(int j = 0; j < (DIAMOND_SIZE-1); j++) {
        System.out.print(" ");
      }
      System.out.println("* ");
    }

    //Print a blank line to give space for the program
    System.out.println();

    //Prevent resource leak
    input.close();
  }
}
