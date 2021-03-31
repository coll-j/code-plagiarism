package task2;

import java.util.Scanner;

public class classtwo {
	
	//do while
	
	int sum = 0;
	int no = 0;
	
	Scanner classtwo = new Scanner(System.in); {
	
	do {

	    sum += no;
	    System.out.println("Enter a number");
	    no = classtwo.nextInt();
	    
	   } while(no >= 0); 
		   
	    System.out.println("Sum = " + sum);
	   
	}

}

	//switch

	// Scanner classtwo = new Scanner(System.in); {
	// char enter;
	// enter = classtwo.next().charAt(0);	
	// int ans = 0, number1=5, number2=3;
	// switch (enter){ 

	//	case '*':
	//		ans = number1 * number2;
	//		break; 

	//	case '/':
	//		ans = number1 / number2;
	//		break;

	//	case '%':
	//		ans = number1%number2;
	//		break; 

	//	default:
	//		System.out.println("it is Invalid ");
	// }
	// System.out.println(ans);
	//
	// classtwo.close();

	// }

	// cast

    // public static void main (String args[]) {  

    //  int a = 50000; 
    //  float b = 5.67f; 
    //  char c = 'a'; 
    //  byte d = 42;  
    //  short e = 1024; 
    //  double f = .1234; 
          
    //  double result = (b * d) + (d / c) - (f * e); 
          
    //  System.out.println("result = " + result); 
    // }
