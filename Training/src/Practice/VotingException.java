package Practice;

import java.util.List;

public class VotingException  {
	
	
public static void main(String[] args) throws MyownException {
		int age=16;
		
			vote(age);
		
	}
	
public static void vote(int age)throws MyownException {
try {
	if(age<18) {
		System.out.println("cannot vote");
		throw new MyownException("no vote");
	}
	else {
		System.out.println("can vote");
	}
} catch (MyownException e) {
	e.printStackTrace();
}
	// TODO: handle exception
}

}
