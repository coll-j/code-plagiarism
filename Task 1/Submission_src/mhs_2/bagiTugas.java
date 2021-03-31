package tugas;

import java.util.Scanner;

public class bagiTugas{
	Scanner enter = new Scanner(System.in);
	
	public void cabang() {
		int angka=enter.nextInt();
		
		if (angka < 10)
			System.out.println("Kurang dari 10");
		else 
			System.out.println("Lebih dari 10");
	}
	public void conversion(){
		
		int angka = enter.nextInt();
	    float angka2 = angka; 

	    System.out.println(angka);      
	    System.out.println(angka2);       
		 
	}
	public void doWhile() {
	
		int i = 0;
		do {
		  System.out.println(i);
		  i++;
		}
		while (i < 10);
		
	}
	public void switcher() {
		int angka = enter.nextInt();
		
		switch(angka) {
		
		case 1 :
			System.out.println("You inputted 1");
			break;
		case 2 :
			System.out.println("You inputted 2");
			break;
		case 3 :
			System.out.println("You inputted 3");
			break;
			
		default :
			System.out.println("The nummber is other than 1,2,3");
			break; 
		}
	}
	}
