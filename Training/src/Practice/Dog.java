package Practice;

public class Dog extends Animals{
	
	
	public Dog(String name) {
		super(name);
		System.out.println(super.get_count());
	}
	
	@Override
	public void sleep() {
		System.out.println(name+" sleeps");
		

	}

}
