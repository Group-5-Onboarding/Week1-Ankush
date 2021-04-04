package AssignmentSet2;

import java.util.Scanner;

public class RabbitsAndChickens {
	
	public static void main(String[] args) {
		
		try(Scanner input = new Scanner(System.in)){
			
			System.out.println("Enter # of heads: ");
			int h = input.nextInt();
			
			System.out.println("Enter # of legs: ");
			int l = input.nextInt();
			
			int r = (l - 2 * h)/2;
			int c = h - r;
			
			if(r > h || l % 2 !=0) {
				System.out.println("The number of chickens and rabbits cannot be found");
			}else {				
				System.out.println("Chickens = " + c);
				System.out.println("Rabits = " + r);
			}
		}

	}


}
