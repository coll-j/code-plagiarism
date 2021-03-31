package tugas;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		
		// scanner program // 
		
		String name, address, email;
		int age;
			
		Scanner keyboard = new Scanner(System.in);
			
		System.out.println(" Data of Informatics Engineering Students ");
			
		System.out.println("Student Name: ");
		name = keyboard.nextLine();
			
		System.out.print("Address: ");
		address = keyboard.nextLine();
		
		System.out.println("Email: ");
		email = keyboard.nextLine();	
		
		System.out.print("Age: ");
		age = keyboard.nextInt();
			
		
		System.out.println("------------------------------");
		System.out.println("Student Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Email: " + email);
		System.out.println("Age: " + age);
		
		
		//If-Else operation //
		
		if(age <= 18) {
			System.out.println("Hi " + name + ", you're still young!");
		} else if (age <= 25){
			System.out.println("Hi " + name + ", you're quite young!");
		} else if (age <= 35){
			System.out.println("Hi" + name + ", you're quite old!");
		} else {
			System.out.println("Hi" + name + ", you're old enogh");
		}
			
	}
		
}
