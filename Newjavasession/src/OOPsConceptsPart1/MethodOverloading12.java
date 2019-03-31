package OOPsConceptsPart1;

public class MethodOverloading12 {

	public static void main(String[] args) {
	
		MethodOverloading12 obj = new MethodOverloading12();
		obj.sum();
		obj.sum(45);
		obj.sum(45, 82);
		
		
		
		
	}

	public void sum(){
		System.out.println("sum method with o input");
	}
	public void sum(int x){
		System.out.println("sum method with 1 input");
		System.out.println(x);
	}
	public void sum(int x,int y){
		System.out.println("sum method wih 2 input");
		System.out.println(x+y);
	}
	
	
}
