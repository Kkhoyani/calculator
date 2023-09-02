package calculator;

import java.util.Scanner;

public class main_java {

	public static void main(String[] args) {
		calculate c = new calculate();
		while(true){
		System.out.println("\nSelect the opration you want to perform:");
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Devision\n5. modulus\n0. End");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i == 0) {
			break;
		} else {
			System.out.println("Enter the First Number:");
			int a = sc.nextInt();
			System.out.println("Enter the Second Number:");
			int b = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("Addition : "+ c.add(a, b));
				break;
			case 2:
				System.out.println("Subtraction : "+ c.sub(a, b));
				break;
			case 3:
				System.out.println("Addition : "+ c.multiply(a, b));
				break;
			case 4:
				if(b == 0) {
					System.out.println("Invalid Input. Answer will be infinite");
				}
				else {
					System.out.println("Addition : "+ c.division(a, b));
				}
				break;
			case 5:
				System.out.println("Addition : "+ c.modulo(a, b));
				break;
			default:
				break;
			}
			}
		}

	}
}
