package Practice;

public  abstract class Animals implements Ani {
	public String name;
	private static int dog_count=0;
	
	protected int get_count() {
		return dog_count;
	}
	
//	public int increment_count() {
//		return dog_count++;
//	}
	public Animals(String name) {
		this.name=name;
		dog_count++;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eat() {
		
		System.out.println(name+" eats");

	}

	
}
