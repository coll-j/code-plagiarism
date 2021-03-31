package Package2;
import java.util.Scanner;

public class tasks {
	Scanner intake = new Scanner (System.in);

	public void scan() {
		String s;
		s = intake.next();
		
		if (s.equals("A"))
			System.out.println("Istimewa");
		else if (s.equals("AB"))
			System.out.println("Baik sekali");
		else if (s.equals("B"))
			System.out.println("Baik");
		else if (s.equals("BC"))
			System.out.println("Cukup baik");
		else if (s.equals("C"))
			System.out.println("Cukup");
		else if (s.equals("D"))
			System.out.println("Kurang");
		else if (s.equals("E"))
			System.out.println("Sangat kurang");
		else
			System.out.println("Invalid Input");
	}
	
	public void sw() {
		int month = 10;
		switch (month) {
		  case 1:
		    System.out.println("Crazy January");
		    break;
		  case 2:
		    System.out.println("Loving February");
		    break;
		  case 3:
		    System.out.println("Dramatic March");
		    break;
		  case 4:
		    System.out.println("Hilarious April");
		    break;
		  case 5:
		    System.out.println("Unstoppable May");
		    break;
		  case 6:
		    System.out.println("Messy June");
		    break;
		  case 7:
		    System.out.println("Exhausted July");
		    break;
		  case 8:
			System.out.println("Bossy August");
			break;
		  case 9:
			System.out.println("Angry September");
			break;
		  case 10:
			System.out.println("Sassy October");
			break;
		  case 11:
			System.out.println("Sexy November");
			break;
		  case 12:
			System.out.println("Needy December");
			break;
		  default:
			System.out.println("Gregorian Calendar only have 12 months a year");
		}
	}
	
	public void looping(){
		int i=8;  
	    do{  
	        System.out.println(i);  
	        --i;  
	    }
	    while(i>-2);  
	}
	
	public void conversion() {
		double d = 1824.832; 
		int value = (int)d; 
  
        System.out.println(value);
	}
	
}
