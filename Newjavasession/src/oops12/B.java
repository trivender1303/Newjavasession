package oops12;

public class B extends A {
	
	public B(){
		super(70);
		System.out.println("child constructor");
		
	}
	
	public static void main(String[]args){
		
		B obj = new B();
	}

}
