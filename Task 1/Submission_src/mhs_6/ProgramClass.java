package Function;

import java.util.Scanner;

public class ProgramClass{
	
	Scanner s = new Scanner(System.in);
	
	public void ifelse() {
	int a = 4;
	int b = 3;
	
	if(a == b) {
		System.out.println("True");
	}else {
		System.out.println("False");			
	}
}

	public void cast() {
		int intnum = 100;
		double doublenum = intnum;
		
		System.out.println(intnum);
		System.out.println(doublenum);
	}

	public void dowhile() {
		int i = 1;
		do {
			System.out.println(i);
			++i;
		}
		while (i <= 5);
	}

	public void scan() {
		String name;
		System.out.println("Who are you?");
		name = s.next();
		
		System.out.println("\nHello there " + name );
	}

public void switchcase() {
		char input;
		int num1 = 5;
		int num2 = 6;

		System.out.println("insert a,b or c");
		input = s.next().charAt(0);
		
	switch (input){ 
		case 'a':
			System.out.println("it's a");
			break;
		case 'b':
			System.out.println("it's b");
			break;
		case 'c':
			System.out.println("it's c");
			break;
		default:
			System.out.println("Invalid Command.");
	}
	}
}
