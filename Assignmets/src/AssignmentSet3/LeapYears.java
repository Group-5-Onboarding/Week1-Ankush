package AssignmentSet3;

import java.util.Scanner;

public class LeapYears {

	public static int[] findLeapYears(int year) {
		int[] years = new int[15];
		years[0] = year;
		for(int i = 1; i < 15; i++) {
			years[i] = years[i - 1] + 4;
		}
		return years;
	}
	
	public static void main(String[] args) {
		
		try( Scanner input = new Scanner(System.in)){
			
			System.out.println("Please enter a year: ");
			int year = input.nextInt();
			
			if(year % 4 == 0) {
				int[] years = findLeapYears(year);
				for(int y: years) {
					System.out.println(y);
				}
			}else {
				System.out.println(year + " is not a leap year.");
			}
		}

	}
}
