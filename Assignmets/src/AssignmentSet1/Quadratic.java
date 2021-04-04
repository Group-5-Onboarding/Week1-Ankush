package AssignmentSet1;

public class Quadratic {
	public static void main(String[] args) {
		double d = 0;
		int a = 1;
		int b = 4;
		int c = 6;
				
		d = (b*b) - (4*a*c);
		
		double root1 = 0;
		double root2 = 0;
		
		if(d == 0) {
			root1 = ((b*-1) + d) / (a*2);
			System.out.println("Root: " + root1);
		}
		else if (d > 0) {
			root1 = ((b*-1) + d) / (a*2);
			root2 = ((b*-1) - d) / (a*2);
			System.out.println("Root 1: " + root1);
			System.out.println("Root 1:" + root2);
		}
		else {
			System.out.println("No real roots");
		}
		

	}
}
