package Assignment1;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		int a,b,largest;
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		a=obj.nextInt();
		
		System.out.println("Enter the second number");
		b=obj.nextInt();
		
		if(a<b) {
			largest=b;
		}
		else {
			largest=a;
		}
		System.out.println(largest);
	}

}
