package tugas;

import java.util.Scanner;

public class homework_2 {
	
	public static void main(String[] args) {
		
		
		// do-while operation //
		
		int a = 0;
		
		do {
			System.out.println(a + " repetition");
			a++;
		} while (a <= 20);
		
		
		// switch operation //
		
		String light;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n# Traffic Light Program Detection #");
		System.out.print("\n\nPlease input the light: ");
		light = scan.nextLine();
		
		switch(light) {
			case "red":
				System.out.println("\nRed Light, Stop!");
				break;
			case "yellow":
				System.out.println("\nYellow Light, Be Careful!");
				break;
			case "green":
				System.out.println("\nGreen Light, Please Go Ahead!");
				break;
			default:
				System.out.println("\nWrong colour light!");
		}
		
	}
	
}
