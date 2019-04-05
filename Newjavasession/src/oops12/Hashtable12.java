package oops12;

import java.util.Hashtable;

public class Hashtable12 {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();
		h.put("A", 100);
		h.put("B", 200);
		h.put("C", 300);
		
		System.out.println(h.size());
		System.out.println(h.get("B"));
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(100, 500);
		h1.put(445, 587);
		h1.put(897, 211);;
		
		System.out.println(h1.size());
		System.out.println(h1.get(445));
		
		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
		h2.put(1, "selenium");
		h2.put(2, "Automation");
		System.out.println(h2.get(2));
		
	}

}
