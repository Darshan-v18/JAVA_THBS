package Practice;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee_comp>{
	
	@Override
	public int compare(Employee_comp o1, Employee_comp o2) {
		Employee_comp emp1= (Employee_comp) o1;
		Employee_comp emp2=(Employee_comp) o2;
		if(emp1.getAge() == emp2.getAge())
			return 0;
		else if(emp1.getAge()>emp2.getAge())
			return 1;
		else
			return -1;
	}


}
