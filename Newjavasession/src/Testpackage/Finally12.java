package Testpackage;

public class Finally12 {

	public static void main(String[] args) {

		test2();
		
		
	}
	
	public static void test2(){
		int i = 10;
		try{
			System.out.println("inside the try block");
			int k = i/0;
			
		}
		catch(ArithmeticException e){
			System.out.println("inside the catch block");
			System.out.println("you cannot divide by zero in java");
		}
		
		finally{
			System.out.println("execute this code even after any exception");
		}
	}

}
