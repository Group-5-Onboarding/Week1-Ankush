package AssignmentSet3;

import java.util.Scanner;

public class FindNum {
	
	public static int[] findNumbers(int num1, int num2) {
		int sizeOfArray = num2 - num1;
		
		if(num2 < 10) {
			
			int[] numbers = {0};
			return numbers;
		}else {
			
			int[] numbers = new int[sizeOfArray];
			int index = 0;
			
			for(int i = 10; i <= num2; i++) {
				int sum = 0;
				
				int n = i;
				while(n != 0) {
					sum += (n % 10);
					n = n/10;
				}
				if(sum % 3 == 0 || i % 5 == 0) {
					numbers[index] = i;
					index++;
					
				}else {
					continue;
				}
			}
			return numbers;
		}
	}
	
	public static void main(String[] args) {
		try(Scanner input = new Scanner(System.in)){
			
			System.out.println("First number: ");
			int num1 = input.nextInt();
			
			System.out.println("Second number: ");
			int num2 = input.nextInt();
			
			if(num1 < num2) {
				int[] numbers = findNumbers(num1, num2);
				if(numbers[0] == 0) {
					System.out.println("There is no such number!");
				}else {
					for(int n : numbers) {
						if(n == 0) {
							break;
						}
						System.out.println(n);
					}
				}
			}else {
				System.out.println("Second number in not greater then first number!");
			}
		}

	}

}
