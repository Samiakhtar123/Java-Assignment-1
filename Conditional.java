package Assignment1;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		int a,b,big;
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter any two nummber");
		a=obj.nextInt();
		b=obj.nextInt();
		big=(a>b?a:b);
		
		System.out.println("Largest number is" + big);
	}

}
