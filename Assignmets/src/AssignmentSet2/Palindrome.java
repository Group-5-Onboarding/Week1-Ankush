package AssignmentSet2;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String  args[]) {
		try(Scanner input = new Scanner(System.in)){
			
			System.out.println("Please enter palidrome: ");
			String palidrome = input.next();
			
			int half = palidrome.length() / 2;
			int left = half - 1;
			int right = palidrome.length() % 2 == 0? half : half + 1;
			
			while(left >= 0 && right < palidrome.length()) {
				if(palidrome.charAt(left) == palidrome.charAt(right)) {
					--left;
					++right;
				}else {
					System.out.println(palidrome + " is not a padlindrome");
					return;
				}
			}
		System.out.println(palidrome + " is a padlindrome");
		}
	}

}

