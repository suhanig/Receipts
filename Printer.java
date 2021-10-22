//Printer.java

/* This is a java file 'stub' or piece of a file designed to get you started on 
* learning to code in java, specifically with multiple classes and methods that rely on the other.
*
*For this assignment, I would like you to fork, modify and commit this project, while
* adding the following elements to your code.
*
* The receipt printer file could take arguments or parametrs from another class
* This file will be purely for output
****************************************
* 40 characters is a standard width    * 
* for typical receipt paper, your task *
* is to make output from the screen    *
* look like it is printing to a small  *
* receipt type printer, with all the   *
* text formatted to 40 characters wide *
*                                      *
* Have fun with the assignment!!       *
****************************************
*/

public class Printer {
	public Printer() {
	
	Printer p1 = new Printer ();
	p1.printHeader();
	p1.print();
		
	Kiosk myKiosk = new Kiosk(); //allows us to call on class Kiosk.java
	
	int frontHeader = 16; //will allow us to print 16 spaces before printing Walmart out
	int backHeader = 17; //will allow us to print 17 spaces after printing Walmart out
	int spacesBetweenFirst = 11; //spaces between Quantity and Item
	int spacesBetweenSecond = 12; //spaces between Item and Price 
	
	public void printHeader () {
	while (frontHeader > 0) { //while loop for beginning spaces
		System.out.print(" ");
		frontHeader = frontHeader-1; //makes sure loop is not forever continuous
	} //closes front spaces while loop
	
	System.out.print("Walmart");
	
	while (backHeader > 0) { //while loop for behind spaces
		System.out.print(" ");
		backHeader = backHeader -1; //makes sure loop is not forever continuous
	} //closes behind spaces while loop
	
} //closes printHeader void
	
	System.out.print("\nQuantity");
	
	while (spacesBetweenFirst > 0) {
		System.out.print(" ");
		spacesBetweenFirst = spacesBetweenFirst -1; //makes sure loop is not forever continuous
	}

	System.out.print("Item");
	
	while (spacesBetweenSecond > 0) {
		System.out.print(" ");
		spacesBetweenSecond = spacesBetweenSecond -1; //makes sure loop is not forever continuous
	}
	
	System.out.println("Price");
	
    //now calling on variables from the kiosk class. having issues with this. THINGS TO FIX: how to import variables from one class to another?
	if (appleAmt > 0) {
		double applePrice = apple * 1.99; //calculating price
		System.out.print(appleAmt + "              " + "apple" + "              " + "$" + applePrice); //total of 40 char
	}
	if (orangeAmt > 0) {
		double orangePrice = orange * 2.49; //calculating price
		System.out.print(orangeAmt + "             " + "orange" + "              " + "$" + orangePrice); //total of 40 char
	}
	if (bananaAmt > 0) {
		double bananaPrice = banana * 2.99; //calculating price
		System.out.print(bananaAmt + "             " + "banana" + "              " + "$" + bananaPrice); //total of 40 char
	}
	if (watermelonAmt > 0) {
		double watermelonPrice = watermelon * 3.49; //calculating price
		System.out.print(watermelonAmt + "           " + "watermelon" + "            " + "$" + watermelonPrice); //total of 40 char
	}
	
	if (lemonAmt > 0) {
		double lemonPrice = lemon * 3.99; //calculating price
		System.out.print(lemonAmt + "              " + "lemon" + "              " + "$" + lemonPrice); //total of 40 char
	}
	
	myKiosk.Kiosk(); //thought would fetch variables... does it? can i put it in between the if...else... statement?
	
	else {
		System.out.print("No items purchased!");
	}
	
	System.out.println("\n Subtotal: " + subtotal); 
	System.out.println("Tax: 7%");
	System.out.println("Total: " + total);
	
	
		
		

} //closes printer method
} //closes printer class
