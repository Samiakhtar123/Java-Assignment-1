package Assignment1;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
		
		int a,b,c,d;
		
		System.out.println("Enter the first number");
		a=obj.nextInt();
		
		System.out.println("Enter 2nd number");
		b=obj.nextInt();
		
		System.out.println("Enter 3rd number");
		c=obj.nextInt();
		
		if((a<b) && (b==c)) {
			
			d=a+b+c;
			System.out.println("Sum of three no" + d);
		}
		else {
			
			System.out.println("Condition is false");
	}

}
