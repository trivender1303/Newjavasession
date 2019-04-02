package OOPsConceptsPart1;

public class CallbyReferenceAndCallbyValue12 {

	int p;
	int q;

	public static void main(String[] args) {

		CallbyReferenceAndCallbyValue12 obj = new CallbyReferenceAndCallbyValue12();
		int x = 40;
		int y = 50;
		obj.testsum(x, y);// call by value or pass by value

		obj.p = 50;
		obj.q = 60;

		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	public int testsum(int a, int b) {
		int c = a + b;
		return c;

	}

	public void swap(CallbyReferenceAndCallbyValue12 t) {

		int temp;
		temp = t.p;// w temp is 50
		t.p = t.q;// now p is 60
		t.q = temp;// now q is 50

	}

}
