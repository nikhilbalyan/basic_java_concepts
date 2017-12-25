package november_28th_2017;

public class StaticVariableMethodCalling {
	static int a = 23;
	int b = 30;
	
	static {
		a = 100;
	}
	
	{
		a = 200;
		b = 200;
	}
	
	public static void main(String[] args) {
		StaticVariableMethodCalling var = new StaticVariableMethodCalling();
		var.add();
		System.out.println(a);
	}
	
	public void add() {
		System.out.println(a+b);
	}
	
}
