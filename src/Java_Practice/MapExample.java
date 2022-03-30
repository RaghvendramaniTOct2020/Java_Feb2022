package Java_Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map1=new HashMap<>();
		map1.put(1, "Raghv");
		map1.put(2, "Shyan");
		map1.put(3, "anishaghv");
		
		Set<Entry<Integer, String>> set=map1.entrySet();
		Iterator<Entry<Integer, String>> itr=set.iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, String> entry=itr.next();
			Integer Key=entry.getKey();
			String val=entry.getValue();
			System.out.println("Key: "+Key+" Value: " +val);
		}
		

		
	}

}
