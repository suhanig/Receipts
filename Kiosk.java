//Suhani Gupta 
//October 20, 2021

import java.util.Scanner; //allows us to use Kiosk

public class Kiosk {
	
	public static void main (String[] args) {
	
	//public void Kiosk () {
	
	Scanner grocery = new Scanner(System.in); //introducing Scanner called grocery
	
	boolean shopAgain = true; //boolean for whether or not the player would like to buy another item
  //introducing variable
	int appleAmt = 0;
	int orangeAmt = 0;
	int bananaAmt = 0;
	int watermelonAmt = 0;
	int lemonAmt = 0;
	double subtotal;
	double total;
	double applePrice;
	double orangePrice;
	double bananaPrice;
	double watermelonPrice;
	double lemonPrice;
    
    System.out.println ("Welcome to Walmart! ");
    System.out.print("We have 5 inventory items. ");
    System.out.print("We have apples, oranges, bananas, watermelons, and lemons. \n");
    System.out.print("1 apple = $1.99, 1 orange = $2.49, 1 banana = $2.99, 1 watermelon = $3.49, 1 lemon = $3.99. You can't purchase more than 9 of each item. ");
    
    
    System.out.print("How many items in total would you like to buy? (the maximum is 45. type out the name only- ex: 'apple') "); //gathering user input
    String items = grocery.nextLine();
    int itemAmt = Integer.parseInt(items);
    
    /*while (itemAmt > 0) { //allows them to write out the items they want. 
		System.out.print("Type in the name of the item you would like to buy: "); //THING TO FIX: for example, if buying 2 apples, need to write out apples twice. how do i fix this so they only have to enter apple and 2?
		String itemName = grocery.nextLine();
		
			if (itemName.equals("apple") || itemName.equals("Apple")){
				appleAmt += 1; //every apple they enter increases amount of apples by one
			} //closes apple if statement
			
			else if (itemName.equals("orange") || itemName.equals("Orange")){
				orangeAmt += 1; //every orange they enter increases amount of oranges by one
			} //closes orange if statement
			
			else if (itemName.equals("banana") || itemName.equals("Banana")){
				bananaAmt += 1; //every banana they enter increases amount of bananas by one
			} //closes banana if statement
			
			else if (itemName.equals("watermelon") || itemName.equals("Watermelon")){
				watermelonAmt += 1; //every watermelon they enter increases amount of watermelons by one
			} //closes watermelon if statement
			
			else if (itemName.equals("lemon") || itemName.equals("Lemon")){
				lemonAmt += 1; //every lemon they enter increases amount of lemons by one
			} //closes lemon if statement
			else {
				System.out.print ("unavailable");
			} //closes else statement
			
			itemAmt = itemAmt - 1; //this is so while loop doesnt happen forever. one item removed each time this loop is completed. 
	} //closes while loop
	* */
	
	    while (itemAmt > 0) { //allows them to write out the items they want. 
		System.out.print("Type in the name of the item you would like to buy: "); //THING TO FIX: for example, if buying 2 apples, need to write out apples twice. how do i fix this so they only have to enter apple and 2?
		String itemName = grocery.nextLine();
		System.out.print("\nHow many of this item would you like to buy? ");
		String oneItemAmount = grocery.nextLine();
		int oneItemAmt = Integer.parseInt(oneItemAmount);
		if (oneItemAmt>itemAmt) {
			System.out.print("\nToo many - how many of this item? ");
			oneItemAmount = grocery.nextLine();
			oneItemAmt = Integer.parseInt(oneItemAmount);
		}
		
		itemAmt = itemAmt - oneItemAmt; //this is so while loop doesnt happen forever. one item removed each time this loop is completed. 
		
			if (itemName.equals("apple") || itemName.equals("Apple")){
				appleAmt = oneItemAmt; //setting the amount of the items equal to the amount of apples inputted by the user
			} //closes apple if statement
			
			else if (itemName.equals("orange") || itemName.equals("Orange")){
				orangeAmt = oneItemAmt; //setting the amount of the items equal to the amount of oranges inputted by the user
			} //closes orange if statement
			
			else if (itemName.equals("banana") || itemName.equals("Banana")){
				bananaAmt = oneItemAmt; //setting the amount of the items equal to the amount of bananas inputted by the user
			} //closes banana if statement
			
			else if (itemName.equals("watermelon") || itemName.equals("Watermelon")){
				watermelonAmt = oneItemAmt; //setting the amount of the items equal to the amount of watermelons inputted by the user
			} //closes watermelon if statement
			
			else if (itemName.equals("lemon") || itemName.equals("Lemon")){
				lemonAmt = oneItemAmt; //setting the amount of the items equal to the amount of lemons inputted by the user
			} //closes lemon if statement
			else {
				System.out.print ("unavailable");
			} //closes else statement
			
			
	} //closes while loop
	
	applePrice = (appleAmt * 1.99);
	orangePrice = (orangeAmt * 2.49);
	bananaPrice = (bananaAmt * 2.99);
	watermelonPrice = (watermelonAmt * 3.49);
	lemonPrice = (lemonAmt * 3.99);
	
	subtotal = ((appleAmt * 1.99) + (orangeAmt * 2.49) + (bananaAmt * 2.99) + (watermelonAmt * 3.49) + (lemonAmt * 3.99)); //calculate subtotal with the number of each item multiplied by its price
	total = ((0.07 * subtotal) + subtotal); //applies tax
	
	
	Printer p1 = new Printer ();
	p1.printHeader();
	p1.print(appleAmt, "Apples", applePrice);
	p1.print(orangeAmt, "Oranges", orangePrice);			
	p1.print(bananaAmt, "Bananas", bananaPrice);	
    p1.print(watermelonAmt, "Watermelons", bananaPrice);
    p1.print(lemonAmt, "Lemons", lemonPrice);
    //p1.print(subtotal, total);
    p1.printPrice(subtotal, total);
    
    
    
   
    
} // closes main method
//} //closes kiosk void
} //closes class kiosk

//writeup posted in the commit



