package Listconcepts12;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist12 {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.add("testcomplete");
		ll.add("selenium");
		ll.add("rft");
		ll.add("qft");

		System.out.println("content of linkedlist" + ll);
		// add first and last

		ll.addFirst("Naveen");
		ll.addLast("Automation");
		System.out.println("content of linkedlist" + ll);

		// get method

		System.out.println(ll.get(0));
		// set method
		ll.set(0, "rana");
		System.out.println(ll.get(0));

		System.out.println("content of linkedlist" + ll);
		// remove first and last
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist" + ll);

		// there are 4 ways to print all the values of linkedlist

		// for loop
		// advance for loop
		// iterator
		// while loop

		System.out.println("*****using for loop*****");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));

		}
		// using iterator
		System.out.println("****using iterator***");

		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

		// using advance for loop
		// for(String str : ll){
		// System.out.println(str);

		// System.out.println("***using advance for loop**");
		// for(String str : ll){
		// System.out.println(str);
		// using while loop
		System.out.println("***using while loop**");

		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}

	}
}
