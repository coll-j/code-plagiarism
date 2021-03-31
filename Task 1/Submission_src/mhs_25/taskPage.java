package taskOne;
import java.util.Scanner;
import domain.domainPage;


public class taskPage {
	public static void main(String[] args) {
		//Scanner
		Scanner scanterm = new Scanner(System.in);
		domainPage multiply= new domainPage();
		System.out.println("Enter first number");
		int num1 = scanterm.nextInt();
		multiply.setNum1(num1);
		System.out.println("Enter second number");
		int num2 = scanterm.nextInt();
		multiply.setNum2(num2);
		
		System.out.println(num1 + " * " + num2 + " is " + multiply.getMultiply());
		
		
		//If-Else
		Scanner ifElse = new Scanner(System.in);
		System.out.println("Enter your exam score"); 
		int score = ifElse.nextInt();
		if(score > 70) {
			System.out.println("Congratulations you passed the exam.");
		} else {
			System.out.println("Sorry, you failed the exam.");
		}
		
		
		//cast/variable conversion
		char character;
		int i;
		double firstInitial = 65.87;
		i = (int)firstInitial;
		character = (char)i;
		System.out.println(character + " is " + i);
		
		
		//do-while
		int capacity=24;
		int pass;
		Scanner doWhile = new Scanner(System.in);
		do {
			System.out.println("Enter the number of passenger");
			pass = doWhile.nextInt();
			capacity = capacity - pass;
			if(capacity < 0) {
				int sisa = 0 - capacity;
				System.out.println(sisa + " passenger(s) didn't get a ticket." );
				capacity = 0;
				
			}
			System.out.println("Available seat : " + capacity );
			
		} while( capacity>0 );
		System.out.println("The bus is full.");
		
		
		//switch
		Scanner sw = new Scanner(System.in);
		System.out.println("Enter the plate code");
		String plate = sw.nextLine();
		String city = "0";
		switch (plate){ 
			case "B":
				city = "Jakarta";
				break; 
			case "D":
				city = "Bandung";
				break;
			case "N":
				city = "Jakarta";
				break; 
			case "L":
				city = "Surabaya";
				break; 
			case "AD":
				city = "Surakarta";
				break; 
			case "AB":
				city = "Yogyakarta";
				break; 
			default:
				System.out.println("Not found. Stay tuned for the updated database.");
		}
		System.out.println(city);
		
		
	}
}
