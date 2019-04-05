package Listconcepts12;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist12 {

	public static <E> void main(String[] args) {

		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		System.out.println(ar.get(2));

		ar.add(40);
		ar.add(50);
		ar.add(50);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// generic and non generic

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(500);
		ar1.add(600);

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("selenium");
		ar2.add("tesing");
		ar2.add("suite");

		System.out.println(ar2.size());
		for (int j = 0; j < ar2.size(); j++) {
			System.out.println(ar2.get(j));
		}
		ArrayList<E> ar3 = new ArrayList<E>();

		// create Employee object
		Employee12 e1 = new Employee12("Tom", 24, "dev");
		Employee12 e2 = new Employee12("steve", 25, "admin");
		Employee12 e3 = new Employee12("john", 26, "test");

		ArrayList<Employee12> ar4 = new ArrayList<Employee12>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);

		// using iterator
		Iterator<Employee12> it = ar4.iterator();
		while (it.hasNext()) {
			Employee12 emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		System.out.println("*************");
		/// add all method
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("selenium");
		ar5.add("tesing");
		ar5.add("suite");

		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Tom");
		ar6.add("Steve");
		ar6.add("john");

		ar5.addAll(ar6);
		for (int k = 0; k < ar.size(); k++) {
			System.out.println(ar5.get(k));
		}
		System.out.println("**************");
		// remove all
		ar5.removeAll(ar6);
		for(int k=0;k<ar5.size();k++){
			System.out.println(ar5.get(k));
		}
		System.out.println("*************");
		//retain all
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Tom");
		ar7.add("Steve");
		ar7.add("john");

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Tom");
		ar8.add("test");
		
		ar7.retainAll(ar8);
		
		for(int k=0;k<ar7.size();k++){
			System.out.println(ar7.get(k));
		}
		
		
		
		
		
		
		
		
	}

}
