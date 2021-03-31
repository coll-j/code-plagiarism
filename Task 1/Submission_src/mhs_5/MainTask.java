package PackageMain;
import PackageSecond.SecondTask;

public class MainTask {
	
	public static void main(String[] args) {
		
		SecondTask command = new SecondTask();
		
		command.Branch();
		command.Cast();
		command.Loop();
		command.Switch();
	}
}