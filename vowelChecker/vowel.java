import java.util.*;

class vowelChecker{
	public static void main (String args[] ){
		
		System.out.println("Enter Letter");
		Scanner vowels = new Scanner(System.in);
		char vowel = vowels.next().charAt(0);
		
		switch(vowel){
			case 'a':
			case 'A':
				System.out.println("Vowel");
				break;
				
			case 'e':
			case 'E':
				System.out.println("Vowel");
				break;

			case 'i':
			case 'I':
				System.out.println("Vowel");
				break;

			case 'o':
			case 'O':
				System.out.println("Vowel");
				break;

			case 'u':
			case 'U':
				System.out.println("Vowel");
				break;

			default: System.out.println("Not a Vowel");			
		}
		
		
	}
}      