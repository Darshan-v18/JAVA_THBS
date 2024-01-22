package Practice;

import java.util.*;

public class Linkedlist {
public static void main(String[] args) {
	LinkedList<String> ll =new LinkedList<>();
	ll.add("Avengers");
	ll.add(0,"Spiderman");
	System.out.println(ll);
	
	ll.add("KGF");
	System.out.println(ll);
	ll.set(2, "Ironman");
	System.out.println(ll);
	ll.addAll(2,ll);
	System.out.println(ll);
	
	ll.remove(3);
	System.out.println(ll);
	ll.remove("Ironman");
	System.out.println(ll);
	ll.addFirst("jhaj");
	ll.addLast("abc");
	System.out.println(ll);
	Iterator<String> it = ll.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
