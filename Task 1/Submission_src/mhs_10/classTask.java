package packageBravo;
import java.util.Scanner;

public class classTask {
Scanner input = new Scanner(System.in);
	
	float total=0;
	public void type(int room) {
		int price[] = new int [6], count=0;
		do {
			System.out.println("Specify the room you wanted\n1.Single\n2.Double\n3.Suite\nType in the numbers:");
			price[count]=input.nextInt();
			if (price[count]==1) {
				total+=50.3;
			}
			else if (price[count]==2) {
				total+=75.6;
			}
			else {
				total+=100.2;
			}
			count++;
		}while (count<room);
	}
	public void round() {
		float temp=total;
		int fin=(int)temp;
		System.out.println("The ammount you have to pay is "+fin+" USD");
	}
	public void payment() {
		int pay;
		pay=input.nextInt();
		switch (pay) {
		case 1 :
			System.out.println("Payment will be done in our counter");
			break;
		case 2 :
			System.out.println("You will be redirected to the payment website");
			break;
		}
	}
}
