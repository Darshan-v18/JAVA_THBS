package Practice;
public class StringAssign {
//	public static  String name="Tho";
//	public static  int year=2004;

	public static String passGenerator(String name,int year) {
		String pass = "";
		if(name.length()<=4) {
			pass=name+year;
		}
		else {
			
			name=name.substring(0,5);
			pass=name+year;
		}
	
		return pass;
	}
	
public static void main(String[] args) {
		System.out.println(passGenerator("charan",2001));
	}

}
