package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setcollection {

	public static void main(String[] args) {
		//HashSet<Integer> hs= new HashSet<>();//one null value,there is no order of elements
		//LinkedHashSet<Integer> hs=new LinkedHashSet<>();//one null value,same as insertion order
		TreeSet<Integer> hs=new TreeSet<>();//no null value,Ascending order
		hs.add(21);
		hs.add(5);
		hs.add(12);
		hs.add(56);
		hs.add(5);
        //hs.add(null);
		//hs.add(null);
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println("Elements in hashset is "+it.next());
		}
		
	}

}
