package OOPsConceptsPart1;


public class Functionsinjava12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functionsinjava12 obj = new Functionsinjava12();
		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		String s1 = obj.qa();
		System.out.println(s1);
		int l2 = obj.division(50, 5);
		System.out.println(l2);
		

	}

	public void test() {// no input and no output
		System.out.println("test--method");
	}

	public int pqr() {// no input but some output
		System.out.println("pqr--method");
		int i = 20;
		int j = 30;
		int k = i + j;

		return k;
	}

	public String qa() {// no input but some output
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	}

	public int division(int x, int y) {
		System.out.println("divsion--method");
		int z = x / y;
		return z;
}
}
