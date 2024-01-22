package Practice;
import java.util.*;
public class HashMap_practice {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "avengers");
		map.put(2, "lion king");

		for(Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
