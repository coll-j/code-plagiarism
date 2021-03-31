//OOP Project Homework
//Simple and Complex Projects
//note:Please uncomment when trying to run the programs, because multiple scanner and close are used
//Thank you for your time and attention to check this program \(^_^)/
//This project is made by Agustinus Aldi Irawan Rahardja (05111942000010)
package Main;

import java.util.Scanner;
import Domain.second_class;

public class main_class {
	
	public static void main(String[] args) {
		
//		1.1 Simple Scanner program
//		Scanner sc_1 = new Scanner(System.in); 
//		String termvar;
//		System.out.println("Enter a study term"); 
//		termvar = sc_1.nextLine();		
//		Scanner sc_2 = new Scanner(System.in); 
//		String termdef;
//		System.out.println("Enter a definition"); 
//		termdef = sc_2.nextLine();
//		System.out.println(termvar+": "+termdef);
//		sc_1.close();
//		sc_2.close();
			
//		1.2. if else simple program using scanner
//		Scanner sc_3 = new Scanner(System.in);
//		int pertama,kedua;
//		System.out.println("Masukkan Integer pertama dan kedua");
//		pertama=sc_3.nextInt();
//		kedua=sc_3.nextInt();
//		if(pertama == kedua) {
//			System.out.println("Sama");
//		}else {
//			System.out.println("Tidak Sama");			
//		}
//		sc_3.close();
	
//		1.3 Cast/Variable Conversion program
		
//		1.3.1 Simple Conversion
//		Narrowing casting
//		note: Double->Float->Long->Int->Short->Byte
		
//      	int i = 100;  
//      	long l = i;
//      	float f = l;  
//      	System.out.println("Int value "+i); 
//      	System.out.println("Long value "+l); 
//      	System.out.println("Float value "+f);
		
//		Widening Casting
//		byte -> short -> char -> int -> long -> float -> double
//	    	int myInt = 9;
//	    	double myDouble = myInt; // Automatic casting: int to double
//	    	System.out.println(myInt);      // Outputs 9
//	    	System.out.println(myDouble);   // Outputs 9.0

//		1.3.2 Byte Conversion
//      byte b;  
//      int a = 257;  
//      double d = 323.142; 
//      System.out.println("Conversion of int to byte.");   
//			b = (byte) a;  
//			System.out.println("a = " + a + " b = " + b); 
//			System.out.println("\nConversion of double to byte.");   
//			b = (byte) d;  
//			System.out.println("d = " + d + " b= " + b);
		
//		1.3.3 Type Promotion
//		1.) Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
//		2.) If one operand is a long, float or double: 
//		the whole expression is promoted to long, float or double respectively.
//        byte by = 42;  
//        char ch = 'a';  
//        short sh = 1024; 
//        int it = 50000; 
//        float fl = 5.67f; 
//        double db = .1234; 
//          
//        // The Expression 
//        double result = (fl * by) + (it / ch) - (db * sh); 
//          
//        //Result after all the promotions are done 
//        System.out.println("result = " + result);		
        
//		1.3.4 using object
//		int number;
//		Object o;
//		char firstInitial = 'A';
//		number = (int)firstInitial;
//		o = (Object)firstInitial;
//		System.out.print(o);
//		System.out.print("\n"+number);

//		1.3.5 Type casting operator
//		int nomor;
//		nomor = (int)(Math.random() * 10 + 1);
//		System.out.println("The random number is " + nomor + ".");
		
//		//1.4. do while program
//	    int sum = 0;
//	    int num = 0;
//	    Scanner sc_4 = new Scanner(System.in);
//	    do {
//	      sum += num;
//	      System.out.println("Enter a number");
//	      num = sc_4.nextInt();
//	    } while(num >= 0); 		   
//	    System.out.println("Sum = " + sum);
//	    sc_4.close();	
				
//		1.5. Switch Calculator program		
//		Scanner reader = new Scanner(System.in);
//        System.out.print("Enter two numbers: ");
//
//        // nextDouble() reads the next double from the keyboard
//        double first = reader.nextDouble();
//        double second = reader.nextDouble();
//
//        System.out.print("Enter an operator (+, -, *, /): ");
//        char operator = reader.next().charAt(0);
//
//        double result;
//
//        switch(operator)
//        {
//            case '+':
//                result = first + second;
//                break;
//
//            case '-':
//                result = first - second;
//                break;
//
//            case '*':
//                result = first * second;
//                break;
//
//            case '/':
//                result = first / second;
//                break;
//
//            // operator doesn't match any case constant (+, -, *, /)
//            default:
//                System.out.printf("Error! operator is not correct");
//                return;
//        }
//
//        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
//        reader.close();
		
//		1.6. Switch program using different class in different package
		
//		Scanner scan = new Scanner(System.in);  	
//		second_class calculator= new second_class();
//		System.out.println("Enter first number");
//		int num1 = scan.nextInt();
//		calculator.value1(num1);
//		System.out.println("Enter second number");
//		int num2 = scan.nextInt();
//		calculator.value2(num2);
//		
//		char input;
//		input = scan.next().charAt(0);
//		calculator.comm(input);
//		
//		System.out.println(calculator.getAnswer());
//		scan.close();
	}
}