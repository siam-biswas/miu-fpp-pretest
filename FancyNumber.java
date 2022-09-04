
public class FancyNumber {
	
//	A fancy number is a number in the sequence 1,1,5,17,61,... Note the first two fancy numbers
//	are 1 and any fancy number other than the first two is sum of three times previous one and two times
//	the one before that. see below
//	1,
//	1,
//	3*1 + 2*1 = 5,
//	5*3 + 2*1 = 17,
//	17*3 + 5*2 = 61
//	Write a function named isFancy that returns 1, if it's integer argument is a Fancy number,
//	otherwise it returns 0.
	
	
	static int isFancy(int n) {
		
		if (n < 1) return 0; 
		if (n == 1) return 1;
		
		int prev = 1;
		int current = 1;
		
		while (current < n) {
			int temp = current;
			current = 3*current + 2*prev;
			prev = temp;
		}
		
		return current == n ? 1 : 0;
	}
	
	static void fancyNumberTest() {
		System.out.println(isFancy(1));
		System.out.println(isFancy(5));
		System.out.println(isFancy(6));
		System.out.println(isFancy(15));
		System.out.println(isFancy(17));
		System.out.println(isFancy(61));
		System.out.println(isFancy(0));
	}
	
	public static void main(String[] args) {
		fancyNumberTest();
	}

}
