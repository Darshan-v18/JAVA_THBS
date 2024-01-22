package Practice;

public class MyownException extends Throwable {
	public MyownException(String s) {
		super(s);
		System.out.println("Under the age of 18, So cannot vote");
	}
	
}
