package OOPsConceptPart2;

public class HSBCbank12 implements USbank12, Brazilbank12 {// we are achieving
															// multiple
															// inheritance

	// if a class implementing any interface, then its mandatory to define /over
	// ride all the method of interface
	// these three methods are from us bank

	public void credit() {
		System.out.println("USbank--credit");
	}

	public void debit() {
		System.out.println("Usbank--debit");
	}

	public void transfermoney() {
		System.out.println("USbank12--transfermoney");
	}

	// separate methods of hsbc bank class
	public void educationloan() {
		System.out.println("HSBCbank--educationloan");
	}

	public void carloan() {
		System.out.println("HSBCbank--carloan");
	}

	// this is from brazil bank ::overridden methods of brazil bank
	public void mutualfunds() {
		System.out.println("Brazilbank12--mutualfunds");
	}

}
