package oops12;

public class Contructorwiththiskeyword {
	String name;
	int age;
	
	public Contructorwiththiskeyword(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		
		Contructorwiththiskeyword obj = new Contructorwiththiskeyword("trivender",25);
	}

}
