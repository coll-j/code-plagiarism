package packageAlpha;
import packageBravo.classTask;
import java.util.Scanner;

public class classMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		classTask run = new classTask();
		System.out.println("This program is made to reserve rooms in a hotel.");
		System.out.println("How much room do you want to reserve (Max 5):");
			int room = input.nextInt();
			
			if (room<=0) {
				System.out.println("Room is not existent");
				
			}
			else if (room>5) {
				System.out.println("You over-reserved");
				
			}
			else {
				System.out.println("You reserved "+room+" room");
				run.type(room);
				run.round();
				System.out.println("What type of payment will you be using\n1.Cash\n2.Online transfer\nType in the numbers:");
				run.payment();
			}
	}
}
