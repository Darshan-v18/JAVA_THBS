package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Comparable_demo {
 

	public static void main(String[] args) {
		List<Student> hs = new ArrayList<>();
		hs.add(new Student("dce",19));
		hs.add(new Student("bga",17));
		hs.add(new Student("ade",19));
		hs.add(new Student("abc",21));
		
		Collections.sort(hs);
		
		for(Student st:hs) {
			System.out.println("The name is "+st.getName()+ " and the age is " +st.getAge());
		
		
		}
			

	}

}
