import java.util.*;
import java.util.Scanner;


class calculator {
	public static void main (String args[]){
		System.out.println("Enter First Number ");
		Scanner num1 = new Scanner(System.in);
		int num_1 = num1.nextInt();
		
		System.out.println("Choose Operator ");
		Scanner opp = new Scanner(System.in);
		char opps = opp.next().charAt(0);
		
		System.out.println("Enter Second Number ");
		Scanner num2 = new Scanner(System.in);
		int num_2 = num2.nextInt();
		
		if(opps == '+'){
			System.out.println("Your Result is: "+(num_1+num_2));
		}
		else if(opps == '-'){
			System.out.println("Your Result is: "+(num_1-num_2));
		}
		else if(opps == '*'){
			System.out.println("Your Result is: "+(num_1*num_2));
		}
		else if(opps == '/'){
			System.out.println("Your Result is: "+(num_1/num_2));
		}
		else{
			System.out.println("Invalid Operator");
		}
		
		
		
		
	} 
}


//https://github.com/himanshu-xgileit/XTJ2022-1

//https://github.com/himanshu-xgileit/XTJ2022-1/wiki