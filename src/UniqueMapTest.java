import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class UniqueMapTest {

	@Test
	public void isUniqueTest() {
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
		
		assertTrue(UniqueMap.isUnique(fnames));
		assertFalse(UniqueMap.isUnique(mnames));
	}

}
