/*
 * SimpleCalculator.java
 *
 * Neel Shah (github.com/nks5295)
 * Phil Lopreiato (github.com/phil-lopreiato)
 *
 * Four function calculator that performs addition, subtraction,
 * multiplication, and division.
 *
 * This class is missing code and it is to be filled out during
 * the GWU ACM Git workshop
 */


import java.util.Scanner;

public class SimpleCalculator {

	private static final int ERROR = -1234567890;

	public SimpleCalculator(){
	}

	/*
	 * Method add
	 * Args:
	 *		int num1 - one of the two operands
	 *		int num2 - another operand
	 * Return:
	 *		An integer that is the sum of the arguments
	 */
	public int add(int num1, int num2) {
		// TODO: Complete this method
	}

	/*
	 * Method subtract
	 * Args:
	 *		int num1 - one of the two operands
	 *		int num2 - another operand
	 * Return:
	 *		An integer that is the difference of the arguments
	 */
	public int subtract(int num1, int num2) {
		// TODO: Complete this method
	}

	/*
	 * Method multiply
	 * Args:
	 *		int num1 - one of the two operands
	 *		int num2 - another operand
	 * Return:
	 *		An integer that is the product of the arguments
	 */
	public int multiply(int num1, int num2) {
		// TODO: Complete this method
	}

	/*
	 * Method divide
	 * Args:
	 *		int num1 - one of the two operands
	 *		int num2 - another operand
	 * Return:
	 *		An integer that is the quotient of the arguments
	 *		note: this method does not account for what is lost
	 *		      due to integer divison
	 */
	public int divide(int num1, int num2) {
		// TODO: Complete this method
	}

	/*
	 * Continuously loops and asks for two numbers and an operation.
	 * If the operation is accepted, it will run that operation
	 * against the two inputted numbers and print the result.
	 */
	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();
		Scanner scanner = new Scanner(System.in);

		int num1 = 0, num2 = 0;
		int result = ERROR;
		String operand = null;

		while (true) {
			System.out.print("Enter num1: ");
			num1 = scanner.nextInt();

			System.out.print("Enter num2: ");
			num2 = scanner.nextInt();

			System.out.print("Enter operand (+, -, *, /): ");
			operand = scanner.next();

			switch (operand) {
				case "+":
					// TODO: Add the numbers
					break;
				case "-":
					// TODO: Subtract the numbers
					break;
				case "*":
					// TODO: Multiply the numbers
					break;
				case "/":
					// TODO: Divide the numbers
					break;
				default:
					System.out.println("Not a valid operand, try again.");
					result = ERROR;
					break;
			}

			if (result != ERROR) {
				System.out.println(num1+" + "+num2+" = "+result);

				System.out.print("Go again? (y/n): ");
				String repeat = scanner.next();

				if (repeat.equals("n")) return;

				System.out.println();
			}
		}
	}

}
