package object_type_casting;
interface animals {
	void printTemp();
	void hello();
}

class Animal implements animals {
	/*int temp;
	int Stringa;
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getStringa() {
		return Stringa;
	}
	public void setStringa(int stringa) {
		Stringa = stringa;
	}*/
	public void printTemp() {
		System.out.println("print inside animal");
	}
	public void hello() {
		System.out.println("print inside hello");
	}
	
}

class Domb implements animals {

	@Override
	public void printTemp() {
		// TODO Auto-generated method stub
		System.out.println("print inside domb");
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("print inside domb");
	}
	
}

class Wudnt {
	public void stop() {
		System.out.println("stop world");
	}
}

public class ObjectTypeCasting {
	public static void main(String[] args) {
		Animal anim = new Animal();
		Domb dmb = new Domb();
		Wudnt wud = new Wudnt();
		
		if(anim instanceof animals) {
			anim.printTemp();
		}
		
		
//		d = a;
		
/*		Integer n = 34;
		Object d = "Lomb";
		Object dd = 23;
		if(dd instanceof Integer) {
			int t = (Integer) dd;
			System.out.println("dd is instance of Integer "+t);
		} else {
			System.out.println("dd is not an instance of Integer");
		}
		if(d instanceof Integer) {
			System.out.println("d is instance of integer");
		} else {
			System.out.println("d is not an instance of integer");
		}*/
	}
}
