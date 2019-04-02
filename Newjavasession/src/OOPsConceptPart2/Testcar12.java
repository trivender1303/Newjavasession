package OOPsConceptPart2;

public class Testcar12 {

	public static void main(String[] args) {

		// static polymorphism -- compile time polymorphism
		BMW12 b = new BMW12();
		b.start();
		b.stop();
		b.refuel();
		b.theftsaftey();
		b.engine();

		System.out.println("*************");

		Car12 c = new Car12();
		c.start();
		c.stop();
		c.refuel();
		c.engine();

		System.out.println("**********");
		//this is called dynamic polymorphism -- run time polymorphism
		//this is also called top casting
		Car12 c1 = new BMW12();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		
		
		
	}

}
