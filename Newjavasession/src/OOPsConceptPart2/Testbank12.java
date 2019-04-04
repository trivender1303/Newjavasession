package OOPsConceptPart2;

public class Testbank12 {

	public static void main(String[] args) {

		//this is called static polymorphism or compile time polymorphism
		System.out.println(USbank12.min_bal);
		HSBCbank12 h = new HSBCbank12();
		h.credit();
		h.debit();
		h.transfermoney();
		h.educationloan();
		h.carloan();
		h.mutualfunds();
		System.out.println("********");
		//dynamic polymorphism or run time polymorphism
		USbank12 u = new HSBCbank12(); 
		u.credit();
		u.debit();
		u.transfermoney();
	
	}

}
