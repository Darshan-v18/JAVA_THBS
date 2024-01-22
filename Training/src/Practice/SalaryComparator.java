package Practice;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee_comp>  {

	@Override
	public int compare(Employee_comp o1, Employee_comp o2) {
		Employee_comp e1 = o1;
		Employee_comp e2 = o2;
		
		if (e1.getSalary()==e2.getSalary())
			return 0;
		else if(e1.getSalary()>e2.getSalary())
			return 1;
		else 
			return -1;
	
	}

}
