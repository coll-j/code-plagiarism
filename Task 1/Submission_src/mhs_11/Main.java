package Package1;
import Package2.tasks;
public class Main {

	public static void main(String[] args) {
		tasks command = new tasks();
		
		System.out.print("Type a grade between A, AB, until E\n");
		command.scan();
		command.sw();
		command.looping();
		command.conversion();
	}

}
