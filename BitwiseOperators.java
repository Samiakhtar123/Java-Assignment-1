package Assignment1;

public class BitwiseOperators {

	public static void main(String[] args) {
		 int a = 5;  // Binary: 0101
	        int b = 3;  // Binary: 0011

	        System.out.println("AND: " + (a & b));   // 1 (0001)
	        System.out.println("OR: " + (a | b));    // 7 (0111)
	        System.out.println("XOR: " + (a ^ b));   // 6 (0110)
	        System.out.println("NOT: " + (~a));      // -6 (Inverts all bits)
	        System.out.println("Left shift: " + (a << 1)); // 10 (1010)
	        System.out.println("Right shift: " + (a >> 1)); // 2 (0010)
	}

}
