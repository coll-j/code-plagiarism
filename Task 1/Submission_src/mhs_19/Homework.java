package code;

import java.util.Scanner;

public class Homework {
	Scanner input = new Scanner(System.in);
	
		public void ifelse() {
			System.out.println("1. If - Else");
			System.out.println("\n(Determining is it positive or negative integer)");
			System.out.println("Input an integer:");
			
			int a = input.nextInt();
			
			if (a > 0)
				System.out.println("It's a positive integer.\n\n");
			
			else if (a < 0)
				System.out.println("It's a negative integer.\n\n");
			
			else if (a == 0)
				System.out.println("It's not a positve and a negative integer.\nIt's a neutral integer\n\n");
			
		}
		
		public void conversion() {
			System.out.println("2. Conversion\n");
			System.out.println("(Conversioning an integer into a decimal number)");
			System.out.println("Input an integer: ");
				
			int a = input.nextInt();
			
			float b = (float) a;
				
			System.out.println("The float value is:\n"+b);
			System.out.println("");
		}
		
		public void dowhile() {
			System.out.println("\n3. Do - While");
			System.out.println("\n(Finding the total addition of 3 random integers)");
			System.out.println("Input 3 integers: ");
			
			int integers[] = new int[101];
			int count = 0, total = 0;
			
			do {
				integers[count] = input.nextInt();
				total = total + integers[count];
				count++;
			} while (count < 3);
			
			System.out.println("The total of addition:\n"+total);
			System.out.println("");
		}
		
		public void switcher() {
			System.out.println("\n4. Switch");
			System.out.println("\n(Checking the prize of the menu)");
			System.out.println("Menu");
			System.out.println("1) Chicken  2) Meat  3) Fish");
			System.out.println("Input a number from 1 to 3 to check the price of the menu: ");
			
			int n = input.nextInt();
			
			int chicken = 8000 , meat = 10000, fish = 5000;
			switch(n) {
			case 1:
				System.out.println("The price:\n"+chicken);
				break;
				
			case 2:
				System.out.println("The price:\n"+meat);
				break;
				
			case 3:
				System.out.println("The price:\n"+fish);
				break;
				
			default:
				System.out.println("Sorry, the menu is unavailable.");
				
			}
			
		
		}

	}


