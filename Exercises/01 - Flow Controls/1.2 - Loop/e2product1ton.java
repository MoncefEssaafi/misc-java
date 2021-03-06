/**
* computes the product from 1 to N (i.e. N!)
*/

public class e2product1ton {
	
	public static void main(String[] args) {
		int lowerbound = 1;	// from i = 1
		int upperbound = 10;	// to i = k == 10.
		int product = 1;
		int cindex = lowerbound;
		
		while (cindex <= upperbound) {
			product *= cindex;	// prod from i=1 to i=10 of i.
			++cindex;
		}
		System.out.println(product);
	}
}
