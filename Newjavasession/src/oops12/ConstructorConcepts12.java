package oops12;

public class ConstructorConcepts12 {

	public ConstructorConcepts12() {
		System.out.println("default constructor");
	}

	public ConstructorConcepts12(int x) {
		System.out.println("single param constructor");
		System.out.println("the value of x " + x);
	}

	public ConstructorConcepts12(int x, int y) {
		System.out.println("two params constructor");
		System.out.println("the value of x " + x);
		System.out.println("the value of y " + y);
	}

	public static void main(String[] args) {

		ConstructorConcepts12 obj = new ConstructorConcepts12();
		ConstructorConcepts12 obj2 = new ConstructorConcepts12(10);
		ConstructorConcepts12 obj3 = new ConstructorConcepts12(10, 20);
	}

}
