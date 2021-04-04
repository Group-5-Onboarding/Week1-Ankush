package AssignmentSet1;

import java.util.Scanner;

public class FoodCorner {
	public static void main(String[] args) {
		int total = 0;
		int q = 0;

		
		Scanner input = new Scanner(System.in);
		 
		System.out.println("Food type: ");
		char type = input.next().charAt(0); 
		
		System.out.println("Quantity: ");
		q = input.nextInt();
		
		System.out.println("Distance (KMs): ");
		int distance  = input.nextInt();

		if(type == 'V' || type == 'v') {
			if(q<1 || distance <0) {
				System.out.println("Total = -1");
				return;
			}
			total = q*12;
			
			if(distance > 3 && distance <= 6) {
				total = total + distance -3;
			}
			if (distance >6) {
				total = total + ((distance-6) *2)+3;
			}
			
			
			
		
		} else if(type == 'N' || type == 'n'){
			if(q<1 || distance <0) {
				System.out.println("Total = -1");
				return;
			}
			total = q*15;
			
			if(distance > 3 && distance <= 6) {
				total = total + distance -3;
			}
			if (distance >6) {
				total = total + ((distance-6) *2)+3;
			}
			
		} else {
			System.out.println("Total = -1");
			return;
		}
			

		System.out.println("Total: " + total);
		
		
		
	}
}
