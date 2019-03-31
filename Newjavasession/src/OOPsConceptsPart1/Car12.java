package OOPsConceptsPart1;


public class Car12 {

	int mod;
	int wheel;
	
	public static void main(String[] args) {

		Car12 bmw = new Car12();
		Car12 audi = new Car12();
		Car12 merc = new Car12();

		bmw.mod = 2015;
		bmw.wheel = 4;

		audi.mod = 2016;
		audi.wheel = 4;

		merc.mod = 2017;
		merc.wheel = 6;

		System.out.println(bmw.mod);
		System.out.println(bmw.wheel);

		System.out.println(audi.mod);
		System.out.println(audi.wheel);

		System.out.println(merc.mod);
		System.out.println(merc.wheel);

	}

}
