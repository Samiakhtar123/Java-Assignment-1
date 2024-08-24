package Assignment1;

public class AssignmentOperators {

	public static void main(String[] args) {
		 int x = 10;

	        x += 5;  // Equivalent to x = x + 5;
	        System.out.println("Addition assignment: " + x); // 15

	        x -= 3;  // Equivalent to x = x - 3;
	        System.out.println("Subtraction assignment: " + x); // 12

	        x *= 2;  // Equivalent to x = x * 2;
	        System.out.println("Multiplication assignment: " + x); // 24

	        x /= 4;  // Equivalent to x = x / 4;
	        System.out.println("Division assignment: " + x); // 6

	        x %= 3;  // Equivalent to x = x % 3;
	        System.out.println("Modulus assignment: " + x); // 0
	}

}
