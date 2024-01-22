package junitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void test() {
		Employee e1= new Employee();
		Boolean actual=e1.chechStr("HelloHe");
		Boolean expected=true;
		assertEquals(expected,actual);
	
	}

}
