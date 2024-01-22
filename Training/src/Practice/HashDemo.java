package Practice;
import java.util.*;

public class HashDemo {
	public static void main(String[] args) {
		HashSet hs	= new HashSet<>();
		hs.add(true);
		hs.add("Hello");
		hs.add(1232);
		System.out.println(hs);
		
		
		
		
		HashSet<Employee> Emp = new HashSet<>();
		
		Emp.add(new Employee("abc",20,55));
		Emp.add(new Employee("sjs",44,70));
		
		for(Employee e:Emp) {
			System.out.println(e.getName());
			System.out.println(e.getAge());
			System.out.println(e.getNum());
		}
			
	}

}