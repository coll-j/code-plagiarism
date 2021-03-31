package task;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = scan.next();
		
		System.out.println("How old are you?");
		int age = scan.nextInt();
		
		System.out.println("Halo. My name " + name + ", I'am " + age + " years old");
		System.out.print("Age classification according to WHO is ");
//		System.out.println("How old are you?");	
//		int age = scan.nextInt();
		
		if ( age >= 60 && age <= 120) {
			System.out.println("Elderly");
		} else if ( age >=20 && age <60) {
			System.out.println("Adult");
		} else if ( age >=11 && age <20) {
			System.out.println("Adolescents");
		} else if ( age >=2 && age <11) {
			System.out.println("Children");
		} else if ( age >=0 && age <2) {
			System.out.println("Infants");
		} else {
			System.out.println("Sorry, The age is not in the range");
		}
		
	}
}
