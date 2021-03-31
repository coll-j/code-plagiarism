package project1_main;
import java.util.*;
import project1_func.function;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;  

public class main {
	public static void main(String[] args) {
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        int year = localDate.getYear();
        int dte = localDate.getDayOfMonth();
        System.out.println("Date today : "+year+"-"+month+"-"+dte);
		while (true) { 
			function x = new function();
			System.out.println("Please choose the number of these option");
			System.out.println("1. Age Finder (If-then)");
			System.out.println("2. Number ASCII converter (Cast / variable conversion)");
			System.out.println("3. Looping (Do-while)");
			System.out.println("4. Exit");
			Scanner input1 = new Scanner(System.in);
			char input;
			input = input1.next().charAt(0);
			
		// Switch-case
		switch (input){ 
			case '1':
				// String & If-else
				Scanner scanterm = new Scanner(System.in);
		        int tahun=0,tanggal=0,bulan=0 ;
		        System.out.println("Enter your date of birth information");
		        System.out.println("Year: ");
		        tahun = scanterm.nextInt();
				x.tahun(tahun);
		        System.out.println("Month: ");
		        bulan = scanterm.nextInt();
		        x.bulan(bulan);
		        System.out.println("Date: ");
		        tanggal = scanterm.nextInt();
		        x.tanggal(tanggal);
		        
				System.out.println("Your age is : "+x.gettotal()+" year old");
		        System.out.println(" ");
				break; 
				
			case '2':
				// Cast/variable conversion
				Scanner cast = new Scanner(System.in);
		  		char character;
		  		int i;
		  		double number = 1.1;
		  		System.out.println("Input a decimal number :");
		        number = cast.nextDouble();
		  		i = (int)number;
		  		System.out.println("The number in integer is : "+ i);
		  		character = (char)i;
		  		System.out.println(i + " in ASCII table is " + character);
		  		System.out.println(" ");
				break; 
				
			case '3':
				// Do-while
				Scanner doWhile = new Scanner(System.in);
				System.out.println("Enter the number of looping : ");
				int cap = doWhile.nextInt();
		  		int num;
		  		do {
		  			System.out.println("Reduce the looping by the amount of: ");
		  			num = doWhile.nextInt();
		  			cap = cap - num;
		  			if (cap>=0) {
		  				System.out.println("Looping left : " + cap );
		  			} else {
		  				System.out.println("Looping left : 0");
		  			}
		  		} while( cap>0 );
		  		System.out.println("The loop has ended."); 
		  		System.out.println(" ");
				break; 
				
			case '4':
				System.out.println("Thank you for testing this program :))");
				System.out.println("Project1 All Rights Reserved. This program created using Eclipse IDE © by Gilbert Kurniawan H");
		        System.exit(0);
				break; 
				
			default:
				System.out.println("Wrong input, try again :((");
				System.out.println(" ");
			}
		}
	 }
}
