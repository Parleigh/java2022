import java.util.*;

class largeNum {
	
	public static void main (String args[]){
		
		System.out.println("Enter First Number");
		Scanner num1 = new Scanner(System.in);
		int num_1 = num1.nextInt();
		
		System.out.println("Enter Second Number ");
		Scanner num2 = new Scanner(System.in);
		int num_2 = num2.nextInt();
		
		System.out.println("Enter Second Number ");
		Scanner num3 = new Scanner(System.in);
		int num_3 = num2.nextInt();      

		if(num_1 > num_2){
			if(num_1 > num_3){
				System.out.println("The largest Number is: " + num_1);
			}else{
				System.out.println(num_3);
			}
			
		}
		else
		{
			if(num_2 > num_3){
				System.out.println("The largest Number is: " + num_2);
			}else{
				System.out.println("The largest Number is: " + num_3);
			}
		}
		
		
		
		
	}
	
	
}
     