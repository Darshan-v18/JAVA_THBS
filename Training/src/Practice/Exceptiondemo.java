package Practice;

public class Exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			throw new MyownException("customized exception");
		}
		catch(MyownException e)
		{
//			System.out.println("caught");
			System.out.println(e.getMessage());
		}
}
}
