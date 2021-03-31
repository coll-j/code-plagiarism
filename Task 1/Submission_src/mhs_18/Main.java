package Main;

import java.util.Scanner;
import Class.Tasks;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Tasks command = new Tasks();
        
        command.Percabangan();
        command.Con();
        command.Looping();
        command.Switcher();  
	}
}
