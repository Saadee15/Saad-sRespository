package Calculator;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter first Number :");
		int a = Input.nextInt();
		
		System.out.println("Enter Second Number :");
		int b = Input.nextInt();
		
		System.out.println("Select operation :");
		String c = Input.next();
		
		switch(c) {
		
		case "addition":
			System.out.println(a + b);
			break;
		case "Subtraction":
			System.out.println(a - b);
			break;
		case "Multiplication":
			System.out.println(a * b);
			break;
		case "Division":
			System.out.println(a / b);
			break;
		}
	}

}
