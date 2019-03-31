package OOPsConceptsPart1;

public class LocalAndGlobalVariable12 {

	//global variable 
	//class variable
	int age = 25;
	String name = "Tom";
	
	
	public static void main(String[] args) {
		LocalAndGlobalVariable12 ob = new LocalAndGlobalVariable12();
		int i = 10;
		System.out.println(ob.age);
		System.out.println(ob.name);
		System.out.println(i);
		
		
	}
	
	public void test(){
		int a = 43;//local variable for test method 
		int age = 24;
		
	}

}
