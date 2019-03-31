package OOPsConceptsPart1;

public class Wrapperclass12 {

	public static void main(String[] args) {

		String s = "100";
		System.out.println(s + 6);

		// conversion string to int

		int i = Integer.parseInt(s);
		System.out.println(i + 6);

		// wrapper classes : integer, character , boolean , double

		// string to boolean conversion

		String x = "true";
		boolean b = Boolean.parseBoolean(x);
		System.out.println(b);

		// int to string conversion

		int q = 100;
		System.out.println(q + 54);

		String z = String.valueOf(q);
		System.out.println(z + 54);

	}

}
