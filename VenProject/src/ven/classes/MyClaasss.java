package ven.classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;



public class MyClaasss {

	public static void main(String[] args) {
		MyClasss my = new MyClasss();
		
		List a = new ArrayList();
		
		a.add(1);
		a.add(3);
		a.add(4);
		a.add(1,2);
		
		LinkedHashMap lhmp = new LinkedHashMap();
		lhmp.put(1, 1);
		
		
		
		
		Set set = new HashSet();
		
		
		Hashtable map = new Hashtable();
		
		map.put(2, 0);
		map.put(1, null);
		
		set.add(1);
		set.add(1);
		my.main();
	}

}
