import java.util.*;

class calculator {
	public static void main (String args[]){
		
		System.out.println("Enter First Number");
		Scanner num1 = new Scanner(System.in);
		int num_1 = num1.nextInt();
		
		System.out.println("Enter Second Number ");
		Scanner num2 = new Scanner(System.in);
		int num_2 = num2.nextInt();
		
		
		int quot = num_1 / num_2;
		int rem = num_1 % num_2;
		
		System.out.println("The Quotient is: " +(quot));
		System.out.println("The Remainder is: " +(rem));
		
	}
	
	
}
     