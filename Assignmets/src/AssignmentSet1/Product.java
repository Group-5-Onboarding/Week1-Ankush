package AssignmentSet1;

public class Product {
	public static void main(String[] args) {
		int a = 2;
		int b = 6;
		int c = 7;
		
		int p = 0;
		
		if(a == 7) {
			p = b*c;
		}
		else if(b == 7) {
			p = c;
		}
		else if (c == 7) {
			p = -1;
		}
		else {
			p = a*b*c;
		}
		
		System.out.println(p);
	}
}
