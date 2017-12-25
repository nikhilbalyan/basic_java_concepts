package third_day_15th_november_2017;



abstract class Animal {
    protected boolean isMammal;
    protected boolean isCarnivorous;
    
    public Animal(boolean isMammal, boolean isCarnivorous) {
        this.isMammal = isMammal;
        this.isCarnivorous = isCarnivorous;
    }
    
    public boolean getIsMammal() {
        return this.isMammal;
    }
    
    public boolean getIsCarnivorous() {
        return this.isCarnivorous;
    }
    
    abstract public String getGreeting();
    
    public void printAnimal(String name) {
        System.out.println( 
        	"A " + name + " says '" + this.getGreeting() 
            + "', is " + (this.getIsCarnivorous() ? "" : "not ") 
        	+ "carnivorous, and is " + (this.getIsMammal() ? "" : "not ") + "a mammal."
        );
    }
}

class Dog extends Animal {

	public Dog() {
		super(true, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "ruff";
	}
	
}

class Cow extends Animal {

	public Cow() {
		super(true, false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "moo";
	}
	
}

class Duck extends Animal {

	public Duck() {
		super(false, false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "quack";
	}
	 
}

public class AnimalInheritanceSolution {
	public static void main(String[] args) {
		 Animal dog = new Dog();
	        dog.printAnimal("dog");
	        	
	        Animal cow = new Cow();
	        cow.printAnimal("cow");

	        Animal duck = new Duck();
	        duck.printAnimal("duck");
	}
}
