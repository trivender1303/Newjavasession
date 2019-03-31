package OOPsConceptsPart1;

public class StaticAndNonstaticmethod12 {

	static int age = 25;
	String s = "Tom";
	
	public static void main(String[] args) {

		//there are two ways of calling static methods
		//1.direct calling
		//2.call by class name
		
		sum();
		System.out.println(age);
		
		
		StaticAndNonstaticmethod12.sum();
		System.out.println(StaticAndNonstaticmethod12.age);
		
		
		
	}
	public void test(){
		System.out.println("Test method");
	}
	public static void sum(){
		System.out.println("sum method");
	}

}
