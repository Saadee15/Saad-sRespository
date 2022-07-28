package pck.Operators;

public class pkgClass {
	
	// Arthematic Operator

	public static void main(String[] args) {
		
		sum();
		Sub();
		Mult();
		Div();
		Incr();
		Decr();
		AddOp();	
		SubOp();
		MultOp();
		DivOp();
		ModuOp();	}
				
		public static void sum() {
			
			int a = 9;
			int b = 6;
			
			int c = a + b;// C+ = C+A
			System.out.println(c);
	}
		public static void Sub() {
			
			int a = 9;
			int b = 6;
			
			int c = a - b;
			System.out.println(c);
		}
		public static void Mult() {
			
			int a = 9;
			int b = 6;
			
			int c = a * b;
			System.out.println(c);
		}
		public static void Div() {
			
			int a = 9;
			int b = 6;
			
			int c = a / b;
			System.out.println(c);
		}
		public static void Incr() {
			
			int a = 9;
			
			a++;
			System.out.println(a);
		}
		
		public static void Decr() {
			
			int a = 9;
			
			a--;
			System.out.println(a);
		}
		
	// ASSIGNMENGT OPERATOR
		
	public static void AddOp() {
			
			int a = 9;
			int c = 6;
			c+=a;
			
			
			System.out.println(c);
}
	public static void SubOp() {
		
		int a = 9;
		int c = 6;
		c-=a; // C - =A meANS  (C-A)
		
		
		System.out.println(c);
	}
	
	public static void MultOp() {
		
		int a = 9;
		int c = 6;
		c*=a;
		
		
		System.out.println(c);
	}
	public static void DivOp() {
		
		int a = 9;
		int c = 6;
		c/=a; // Question: why does this operator not give me value in decimal when the answer should be 0.6
		
		
		System.out.println(c);
	}
	
public static void ModuOp() {
		
		int a = 15;
		int c = 100;
		c%=a;
		
		
		System.out.println(c);
}
}

