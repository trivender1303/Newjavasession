package oops12;

public class Ifelse12 {

	public static void main(String[] args) {

		int i = 20;
		int j = 30;

		if (i > j) {
			System.out.println("i is greater than j");

		} else {
			System.out.println("j is greater than i");
		}

		// relational operator-- < , > , <= , >= , == , !=

		int a = 10;
		int b = 10;

		if (a == b) {
			System.out.println("a is equal to b");

		} 
		else {
			System.out.println("a is not equal to b");
		}
	

	// write a logic find out a greatest number

	int a1 = 342;
	int b1 = 435;
	int c1 = 451;
	
	// we use nested if-else

	if(a1>b1&b1>c1)
	{
		System.out.println("a1 is greatest number ");
	}
	
	else if(b1>c1){
		System.out.println("b1 is greatest number");
	}
	
	else{
		System.out.println("c1 is greatest number ");
	}

}
}


