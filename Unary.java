package Assignment1;

public class Unary {

	public static void main(String[] args) {
		 int x = 10;

	        System.out.println("Unary plus: " + +x);  // 10
	        System.out.println("Unary minus: " + -x); // -10

	        x++;
	        System.out.println("Increment: " + x);    // 11

	        x--;
	        System.out.println("Decrement: " + x);    // 10

	        boolean flag = true;
	        System.out.println("Logical NOT: " + !flag); // false
	}

}
