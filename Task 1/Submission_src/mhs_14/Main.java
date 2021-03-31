package mainPackage;
import tasksPackage.Tasks;

public class Main {
	public static void main(String[] args) {
		Tasks command = new Tasks();
		
		command.branching();
		command.conversion();
		command.loop();
		command.switcher();
		
		System.out.println("\n- The program ends -");
	}
}