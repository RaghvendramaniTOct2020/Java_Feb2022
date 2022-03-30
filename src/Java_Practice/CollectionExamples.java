package Java_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Raghv");
		al1.add("Kutub");
		al1.add("");

		al1.add("Manav");
		al1.add("Suresh");
		al1.add("Nahir");
		al1.add("Kutub");
		
		
		System.out.println(""+al1.get(4) );
		Collections.sort(al1);
		System.out.println(al1);
		System.out.println(""+al1.get(4) );

		
		LinkedList<String> l1=new LinkedList<>();
		l1.add("Raghv");
		l1.add("Abc");
		l1.add("Abc");
		l1.add("Mun");
		l1.add("Sun");
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.remove(1));
		System.out.println(l1.get(2));
		System.out.println(l1);

//Iterating with enhanced for loop
		for(String str: al1) {
			System.out.println(" "+ str +" --");
		}

		Iterator <String> itr=l1.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			System.out.println(itr.next());
			if(str.equalsIgnoreCase("mun"))
				itr.remove();
		}
		
		List<Integer> set=new ArrayList<>();
		set.add(1);
		set.add(10);
		set.add(55);
		set.add(55);

		System.out.println(set);
		
		Set<String> s1=new HashSet<>();
		s1.add("Raghv");
		s1.add("Raghv");
		s1.add(" ");
		s1.add(" ");

		s1.add("m");
		System.out.println(s1);
		System.out.println(s1.size());

		Set<String> s2=new LinkedHashSet<>();
		s2.add("Raghv");
		s2.add("Raghv");
		s2.add("Manik");
		System.out.println(s2);
		System.out.println(s2.size());
		
		Set<String> s3=new TreeSet<>();
		s3.add("Raghv");
		s3.add("ARaghv");
		s3.add("ARaghv");
		s3.add("null");
		s3.add("BManik");
		System.out.println(s3);
		System.out.println(s3.size());
		
		Iterator <String> itr22=s3.iterator();
		while(itr22.hasNext()){
			String str1=itr22.next();
			System.out.println(str1);
			
		}
		

		Map <String, Integer> map1=new HashMap<>();
		map1.put("Chem", 50);
		map1.put("Chem", 50);
		map1.put("Math", 60);
		map1.put("Phy", 60);
		map1.put("Bio", 90);
		System.out.println(map1);
		Set<Entry<String, Integer>> set1= map1.entrySet();
		Iterator<Entry<String, Integer>> maiItr=set1.iterator();
		while(maiItr.hasNext()) {
			Entry<String, Integer> entry=maiItr.next();
			String Key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println(Key+" "+value);
		}

	}

}
