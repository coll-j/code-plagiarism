package tasksPackage;
import java.util.Scanner;

public class Tasks {
	Scanner input = new Scanner(System.in);
	public void branching() {
		System.out.println("(If-else) Input a number : ");
		int number = input.nextInt();
		
		if(number > 0)
			System.out.println("The number is greater than zero");
		
		else if(number == 0)
			System.out.println("The number is equal to zero");
		
		else if(number < 0)
			System.out.println("The number is less than zero");
	}
	
	public void conversion() {
		System.out.println("\n(Conversion) Input a decimal number : ");
		float number;
		
		number = input.nextFloat();
		
		System.out.println((int)number);
	}
	
	public void loop() {
		int number[] = new int[1001];
		int counter = 0, total = 0;
		System.out.println("\n(Do-While Loop) Input 10 numbers :");
		
		do {
			number[counter] = input.nextInt();
			total += number[counter];
			counter++;
		} while(counter < 10);
		
		System.out.println("Total is " + total);
	}
	
	public void switcher() {
		System.out.println("\n(Switch) Input a number : ");
		int angka = input.nextInt();
		
		switch(angka) {
			case 1 :
				System.out.println("The input is 1");
				break;
				
			case 2 :
				System.out.println("The input is 2");
				break;
				
			case 3 :
				System.out.println("The input is 3");
				break;
				
			case 4 :
				System.out.println("The input is 4");
				break;
				
			case 5 :
				System.out.println("The input is 5");
				break;
				
			default :
				System.out.println("The input is greater than 5 or less than 1");
				break;
		}
	}
}
