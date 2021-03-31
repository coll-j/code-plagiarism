package Domain;

public class second_class {
	public int value1;
	public int value2;
	public char comm;
	
	public second_class() {
		
	}
		
	public void value1(int value1) {
		this.value1 = value1;
	}
	
	public void value2(int value2) {
		this.value2 = value2;
	}
		
	public void comm (char comm) {
		this.comm = comm;
	}
		
	public int getAnswer() {
		switch (comm){ 
			case '+':
				return value1+value2;
			case '-':
				return value1-value2;
			case '*':
				return value1*value2;
			case '/':
				return value1/value2;
			case '%':
				return value1%value2;
			default:
				return 0;
		}
	}
}