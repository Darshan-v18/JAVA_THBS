package Practice;
import java.util.*;
	public class AryList {
		static List<String> movies = new ArrayList<>();
	public static void main(String[] args) {
		int opt;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("\nSelect your option\n 1.Add\n 2.Delete\n 3.Display\n 4.Exit\n");
			opt=s.nextInt();
			switch(opt) {
			case 1: System.out.println("Enter the movie name to add\n");
					String mov=s.next();
					addMov(mov);
					break;
			case 2: System.out.println("Enter the movie name to delete\n");
					String mov1=s.next();
					delMov(mov1);
					break;
			case 3: displayMov();
					break;
			case 4: System.out.println("Exiting the program");
					break;
			default : System.out.println("Enter the correct option");
			}
			
		}
		while(opt!=4);

		}
	
	private static void addMov(String str){
		movies.add(str);
		System.out.println(str+" added to the movies list");
	}
	
	private static void delMov(String str) {
		if(movies.contains(str)) {
			movies.remove(str);
			System.out.println(str+ " is removed from the movies list");
		}
		else {
			System.out.println(str+ " is not preset in the movies list");
		}
	}
	
	private static void displayMov() {
		System.out.println("The list of movies is as follows\n"); 
		Iterator<String> it = movies.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		for(String ls:movies) {
//			System.out.println(ls);
//		}
	}
		
}


