import java.util.*;

class oddEven {
	public static void main (String args[]) {
		
		System.out.println("Enter Number");
		Scanner nums = new Scanner(System.in);
		int num = nums.nextInt();
		
		if (num % 2 == 0){
			System.out.println("It's an Even Number");
		}
		else{
			System.out.println("It's an Odd Number");
		}
		
		
	}
}