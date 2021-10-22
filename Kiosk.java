//Suhani Gupta
//October 20, 2021

import java.util Scanner;

public class Kiosk {
  
  public static void Kiosk () {
    
    Scanner.grocery = new Scanner(System.in); //introducing Scanner called grocery
    
    System.out.println ("Welcome to Walmart! ");
    System.out.print("We have 5 inventory items. ")
    System.out.print("We have apples, oranges, bananas, watermelons, and lemons. \n");
    System.out.print("1 apple = $1.99, 1 orange = $2.49, 1 banana = $2.99, 1 watermelon = $3.49, 1 lemon = $3.99. You can't purchase more than 9 of each item. ");
    System.out.print("\nHow many apples would you like to buy? ");
    String appleAmt = grocery.nextLine(); //scans user apple input
    int appleQuantity = Integer.parseInt(appleAmt); //converts user's string response to an int
    
    System.out.print("\nHow many oranges would you like to buy? ");
    String orangeAmt = grocery.nextLine(); //scans user's orange input
    int orangeQuantity = Integer.parseInt(orangeAmt); //converts string to an int
    
    System.out.print("\nHow many bananas would you like to buy? ");
    String bananaAmt = grocery.nextLine(); //scans user banana input
    int bananaQuantity = Integer.parseInt(bananaAmt);
    
    System.out.print("\nHow many watermelons would you like to buy? ");
    String watermelonAmt = grocery.nextLine();
    int watermelonQuantity = Integer.parseInt(watermelonAmt);
    
    System.out.print("\nHow many lemons would you like to buy? ");
    String lemonAmt = grocery.nextLine(); 
    int lemonQuantity = Integer.parseInt(lemonAmt);
  
    if (appleQuantity > 9 || orangeQuantity > 9 || bananaQuantity > 9 || watermelonQuantity > 9 || lemonQuantity > 9 ) {
      System.out.println (" Unable to proceed. You cant have more than 9 of each item");
    } //closes if statement 
    
    else {
      System.out.println ("Let's checkout! ");
    } //closes else
    
    double applePrice = 1.99;
    double appleCost = applePrice * appleQuantity;
    
    double orangePrice = 2.49;
    double orangeCost = orangePrice * orangeQuantity;
    
    double bananaPrice = 2.99;
    double bananaCost = bananaPrice * bananaQuantity;
    
    double watermelonPrice = 3.49;
    double watermelonCost = watermelonPrice * watermelonQuantity;
    
    double lemonPrice = 1.99;
    double lemonCost = lemonPrice * lemonQuantity;
    
    double subtotal = appleCost + orangeCost + bananaCost + watermelonCost + lemonCost;
    
    double total = (0.07 * subtotal) + subtotal;
  
  } //closes kiosk method
} //closes kiosk class
