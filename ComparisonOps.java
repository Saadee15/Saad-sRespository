package pck.Operators;

public class ComparisonOps {

	public static void main(String[] args) {
		
		EqualTo();
		NotEqualTo();
		GreatLessOp();
		GrEqLsEqOp();
		
	

	}
	
	public static void EqualTo() {
		
		String GivenPassword = "Howdy123";
		String RetrievedPassword = "howdy124";
		System.out.println(GivenPassword==RetrievedPassword);
	}
	
	public static void NotEqualTo() {
		
		String GivenPassword = "Howdy123";
		String RetrievedPassword = "howdy124";
		System.out.println(GivenPassword!=RetrievedPassword);
	}
	public static void GreatLessOp() {
	
	int GivenDigits = 456872;
	int RetrievedDigits = 875982;
	
	System.out.println(GivenDigits > RetrievedDigits); // Greater Than Operator
	System.out.println(GivenDigits < RetrievedDigits); // Less Than Operator
	
	}
	public static void GrEqLsEqOp() {
		
		int GivenDigits = 80000;
		int RetrievedDigits = 875982;
		
		System.out.println(GivenDigits >= RetrievedDigits); // Greater or Equal to Operator
		System.out.println(GivenDigits <= RetrievedDigits); // Less or Equal to Operator
	}
	
}


