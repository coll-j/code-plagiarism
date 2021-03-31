package PackageSecond;
import java.util.Scanner;

public class SecondTask {
Scanner input = new Scanner(System.in);
	
	public void Branch() {
		int num = input.nextInt();
		
		if(num > 10)
			System.out.println("The number is bigger than 10");
		else
			System.out.println("The number is smaller than 10");
	}
	
	public void Cast() {
		float num = input.nextFloat();
			System.out.println((int)num);
	}
	
	public void Loop() {
		int num = input.nextInt();
		do {
			System.out.println(num);
			num++;
		}
		while(num < 100);
	}
	
	public void Switch() {
		int num = input.nextInt();
		
		switch(num) {
			case 1 :
				System.out.println("Iam Ugly");
				break;
			
			case 2 :
				System.out.println("Iam Beautiful");
				break;
			
			case 3 :
				System.out.println("Iam Average");
				break;	
				
			default :
				System.out.println("Error");
				break;
		}
	}
}
