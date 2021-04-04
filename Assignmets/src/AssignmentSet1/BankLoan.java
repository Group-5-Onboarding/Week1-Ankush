package AssignmentSet1;

import java.util.Scanner;

public class BankLoan {
	
	public static void main(String[] args) {
		int anum = 0;
		int abal = 250000;
		int salary = 0;
		String type = "car";
		int loan = 0;
		int emi = 0;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Account Number: ");
		anum = input.nextInt();
		
		int length = String.valueOf(anum).length();
		if(length != 4 && anum / 1000 != 1) {
			System.out.println("Invalid Account Number.");
			return;
		}
		
		System.out.println("Salary: ");
		salary = input.nextInt();
		input.nextLine();
		
		System.out.println("Type: ");
		type = input.nextLine();
		
		
		System.out.println("Expected loan amount: ");
		loan = input.nextInt();
		
		System.out.println("Expected EMIs amount: ");
		emi = input.nextInt();
		
		/*System.out.println(salary);
		System.out.println(type);
		System.out.println(loan);
		System.out.println(emi);*/
		
		if(type.equals("car") && salary > 25000) { 
			if(loan <= 500000 && emi <= 36) {
				System.out.println("Account #: " + anum);
				System.out.println("eligible loan amount: 500,000");
				System.out.println("eligible EMIs: 36");
				System.out.println("requested loan amount: " +loan);
				System.out.println("requested EMIs: " + emi);
				
			}else {
				System.out.println("Loan  not approved.");
			}
		}
		else if(type.equals("house") && salary >50000) { 
			if(loan <= 6000000 && emi <= 60) {
				System.out.println("Account #: " + anum);
				System.out.println("eligible loan amount: 6,000,000");
				System.out.println("eligible EMIs: 60");
				System.out.println("requested loan amount: " +loan);
				System.out.println("requested EMIs: " + emi);
				
			}else {
				System.out.println("Loan  not approved.");
			}
		}else if(type.equals("business") && salary >70000) { 
			if(loan <= 7500000 && emi <= 84) {
				System.out.println("Account #: " + anum);
				System.out.println("eligible loan amount: 7,500,000");
				System.out.println("eligible EMIs: 84");
				System.out.println("requested loan amount: " +loan);
				System.out.println("requested EMIs: " + emi);
				
			}else {
				System.out.println("Loan  not approved.");
			}
		}else {
			System.out.println("1Loan  not approved.");
		}
	
		
	
		
		
		
		
	
	
	}
	
}