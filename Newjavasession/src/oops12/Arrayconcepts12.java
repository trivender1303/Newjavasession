package oops12;

public class Arrayconcepts12 {

	public static void main(String[] args) {

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i.length);
		System.out.println(i[3]);
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		System.out.println("**********");

		double d[] = new double[3];
		d[0] = 23.32;
		d[1] = 32.32;
		d[2] = 37.21;

		System.out.println(d.length);
		for (int e = 0; e < d.length; e++) {
			System.out.println(d[e]);
		}
		System.out.println("************");
		String s[] = new String[3];
		s[0] = "Selenium";
		s[1] = "Automation";
		s[2] = "testing";

		System.out.println(s.length);
		for (int w = 0; w < s.length; w++) {
			System.out.println(s[w]);
		}
		
		System.out.println("*********");
		
		Object obj[] = new Object[4];
		obj[0] = "tom";
		obj[1] = 'a';
		obj[2] = 234;
		obj[3] = 21.342;
		
		System.out.println(obj.length);
		
		
		
		
		
		
		
		

	}

}
