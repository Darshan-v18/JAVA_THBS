package Practice;
import java.util.*;


public class Arraylist {
public static void main(String[] args) {
	List<String> movies = new ArrayList<>();
	int opt;
	Scanner s = new Scanner(System.in);
	do {
		System.out.println("\nSelect your option\n 1.Add\n 2.Delete\n 3.Display\n 4.Exit\n");
		opt=s.nextInt();
		switch(opt) {
		case 1: System.out.println("Enter the movie name to add\n");
		String mov=s.next();
		movies.add(mov);
		System.out.println(mov+" added to the movies list");
		break;
		case 2: System.out.println("Enter the movie name to delete\n");
		String mov1=s.next();
		if(movies.contains(mov1)) {
			movies.remove(mov1);
			System.out.println(mov1+ " is removed from the movies list");
		}
		else {
			System.out.println(mov1+ " is not preset in the movies list");
		}
		break;
		case 3: System.out.println("The list of movies is as follows\n"); 
		for(String ls:movies) {
			System.out.println(ls);
		}
		break;
		case 4: System.out.println("Exiting the program");
		break;
		default : System.out.println("Enter the correct option");
		
		}
		
	}
	while(opt!=4);

	}
	
}
