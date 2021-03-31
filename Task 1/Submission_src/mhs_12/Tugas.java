package Tasks;
import java.util.Scanner;

public class Tugas {
	
	Scanner masukan = new Scanner(System.in);
	
	public void Percabangan() {
		int number = masukan.nextInt();
		
		if(number >=0)
			System.out.println("Angka >= 0");
		else
			System.out.println("Angka = 0"); }
	
	public void Conversion() {
		int W = 20;
		double Casting = W;
		
		System.out.println(W);
		System.out.println(Casting); }

	public void Loop() {
		int counter = 0;
		
		do {
			System.out.println(counter);
			counter++;}
		while (counter<=5); }
	
	public void Switch() {
		System.out.println("Please enter the password");
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		
		switch (password) {
		case "Informatics ITS":
			System.out.println("Welcome to ITS");
			break;
		case "Engineering":
			System.out.println("Go Away");
			break;
		default:
			System.out.println("Please try again later");
			break; }
	}
}
