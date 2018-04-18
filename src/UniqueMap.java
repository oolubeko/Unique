import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

//Write a method called isUnique that accepts a map whose keys and values are strings as
//a parameter and returns true if no two keys map to the same value, and false otherwise.
public class UniqueMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> fnames = new HashMap<String,String>();
		Map<String,String> mnames = new HashMap<String,String>();
		
		fnames.put("Janice", "Joplin");
		fnames.put("Barbara", "Streissand");
		fnames.put("Beatrice", "LeStrange");
		fnames.put("Bonnabel", "Bubblegum");
		
		mnames.put("Stephen", "Curry");
		mnames.put("Seth", "Curry");
		mnames.put("Bon", "Jovi");
		mnames.put("Kurt", "Cobain");
		
		System.out.println(isUnique(fnames));
		System.out.println(isUnique(mnames));

	}

	@Test
	static boolean isUnique(Map<String, String> names) {
		
		//the basic idea I will use is to map the values of the HashMap to a Set and check
		//to see if the size of the Set and the size of the HashMap are the same
		
		Collection<String> values = names.values();
		Set<String> check = new HashSet<String>();
		
		for(String value:values) {
			check.add(value);
		}
		
		return check.size() == values.size();
	}

}
