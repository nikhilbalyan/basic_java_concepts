package november_28th_2017;

public class StaticFeaturesOOP {
	static int a;
	static int b;
	public StaticFeaturesOOP() {
		a = 23;
		b = 34;
	}
	static {
		a = 100;
		b = 100;
	}
	
	public static void main(String[] args) {
		StaticFeaturesOOP st = new StaticFeaturesOOP();
		System.out.println("the value of a = " + a);
		System.out.println("the value of b = " + b);
		
	}
}
