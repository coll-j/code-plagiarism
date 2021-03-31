package task1;
import java.util.Scanner;

import domain.Domain;


public class Code {
	public static void main(String[] args) {
		
		//Scanner	
		Scanner scanterm = new Scanner(System.in);
		Domain add= new Domain();
		System.out.println("This is addition calculator program");
		System.out.println("Input number");
		int num1 = scanterm.nextInt();
		add.setNum1(num1);
		System.out.println("Input number");
		int num2 = scanterm.nextInt();
		add.setNum2(num2);
		
		System.out.println(num1 + " + " + num2 + " = " + add.getAdd());
	
		//If-Else
		Scanner ifElse = new Scanner(System.in);
		System.out.println("Input number to check positive or negative"); 
		int num = ifElse.nextInt();
		if(num >= 0) 
		{
			System.out.println("Positive");
		} 
		else 
		{
			System.out.println("Negative");
		}
	
		//cast/variable conversion
		char character;
		int i;
		double string = 97.11;
		i = (int)string;
		character = (char)i;
		System.out.println(character + " is " + i + " in ASCII Code.");
	
		//do-while
		int sum = 0;
	    int number = 0;

	    Scanner input = new Scanner(System.in);
		   
	    do {
	      sum += number;
	      System.out.println("Input numbers that you want to add (input negative number to stop)");
	      number = input.nextInt();
	    } while(number >= 0); 
		   
	    System.out.println("Total = " + sum);
	    input.close();
	    
	    //switch
	    int week = 7;
        String day;

        switch (week) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;       
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day";
                break;
        }
        System.out.println("Today is " + day);

	}
}
