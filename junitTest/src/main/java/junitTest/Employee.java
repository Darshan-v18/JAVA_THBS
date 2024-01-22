package junitTest;

public class Employee {
	public static Boolean chechStr(String str) {
		String first2char= str.substring(0,2);
		String last2char=str.substring(str.length()-2);
	
		if(first2char.equals(last2char)) 
			return true;
		return false;
	}
	
}
