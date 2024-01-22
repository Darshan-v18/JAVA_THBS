package Practice;

public class Person {
	private String name;
	private int age;
	
	
	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Person p1 =new Person("abc",20);
		Person p2 = new Person("cde",21);
		System.out.println(p1.getName()+" " +p1.getName());
		System.out.println(p2.getName()+" " +p2.getAge());

	}

}
