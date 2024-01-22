package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;



public class Employee_comp {
	private String name;
	private int age;
	private int salary;
	public Employee_comp(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee_comp [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) {
		
		HashSet<Employee_comp> emp = new HashSet<>();
		emp.add(new Employee_comp("dar",21,30000));
		
		emp.add(new Employee_comp("abc",19,20000));
		emp.add( new Employee_comp("def",22,25000));
		emp.add(new Employee_comp("bee",18,15000));
	     List<Employee_comp> empList = new ArrayList<>(emp);
		

//	     Collections.sort(empList, new SalaryComparator());
	     Collections.sort(empList, new AgeComparator());
		Iterator it = empList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

	
}
