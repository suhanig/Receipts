public class Printer {
	public Printer() {
	
	//Printer p1 = new Printer ();
	//p1.printHeader();
	//p1.print();
		
	//Kiosk myKiosk = new Kiosk(); //allows us to call on class Kiosk.java
	 
	
} //closes printer method
	
	public void printHeader () {
		
		
	int frontHeader = 16; //will allow us to print 16 spaces before printing Walmart out
	int backHeader = 17; //will allow us to print 17 spaces after printing Walmart out
	int spacesBetweenFirst = 11; //spaces between Quantity and Item
	int spacesBetweenSecond = 12; //spaces between Item and Price
	
	
		while (frontHeader > 0) { //while loop for beginning spaces
			System.out.print("*");
			frontHeader = frontHeader-1; //makes sure loop is not forever continuous
		} //closes front spaces while loop
		
		System.out.print("Walmart");
		
		while (backHeader > 0) { //while loop for behind spaces
			System.out.print("*");
			backHeader = backHeader -1; //makes sure loop is not forever continuous
		} //closes behind spaces while loop
		

		
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
	
	} //closes printHeader void
	
    //now calling on variables from the kiosk class. having issues with this. THINGS TO FIX: how to import variables from one class to another?
    
    public void print(int amt, String desc, double price) { 
			
			int spaces = (20 - desc.length());
			
		/*while (spaces > 0) {
			System.out.print(" ");
			spaces = spaces -1; //makes sure loop is not forever continuous
		} */
			//loop of spaces 
			//loop spaces rt
		     //spacing +=" ";
			//calc spacing 30-desc
			
			while (amt > 0) {
				System.out.print(" "+ amt+"           " +desc);
				while (spaces > 0) {
					System.out.print(" ");
					spaces = spaces -1; //makes sure loop is not forever continuous
				}
				System.out.print (" $");
				
				if (price>9.99) {
					System.out.println(" " + price);
				}
				else{
					System.out.println(price);
				}
				 amt = amt - amt;
				/*double applePrice = apple * 1.99; //calculating price
				System.out.print(appleAmt + "              " + "apple" + "              " + "$" + applePrice); //total of 40 char
				appleAmt = appleAmt - 1;
				* */
			}
			
			 //closes while
			 //closes void apples
			/*
			 * 
			 * if (orangeAmt > 0) {
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
			
			*/
			//myKiosk.Kiosk(); //thought would fetch variables... does it? can i put it in between the if...else... statement?
			
			/*else {
				System.out.print("No items purchased!");
			} */
			
			/*
			System.out.println("Tax: 7%");
			System.out.println("\n Subtotal: " + subtotal); 
			System.out.println("Total: " + total); 
			*/
			}  //close print method
			
		public void printPrice (double noTax, double withTax) {
			System.out.println("\n\n\nTax: 7%");
			System.out.println("Subtotal: $" + String.format("%.2f", noTax)); 
			System.out.println("Total: $" + String.format("%.2f", withTax)); 
			System.out.println("*****Thank you for shopping with us*****");
		} 
			
	
		
		

} //closes printer class
