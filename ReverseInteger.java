
public class ReverseInteger {
	
//	Question 4
//	Write a function to reverse an integer using numeric operators and without
//	using any arrays or other data structures.
//
//	The signature of the function is:
//	int f(int n)
//	Examples
//
//	 --------------------------------|--------------------------------------------------------------
//	| if the input integer is        | return                                                       |
//	|--------------------------------|--------------------------------------------------------------|
//	| 1234                           | 4321                                                         |
//	|--------------------------------|--------------------------------------------------------------|
//	| 12005                          | 50021                                                        |
//	|--------------------------------|--------------------------------------------------------------|
//	| 1                              | 1                                                            |
//	|--------------------------------|--------------------------------------------------------------|
//	| 1000                           | 1                                                            |
//	|--------------------------------|--------------------------------------------------------------|
//	| 0                              | 0                                                            |
//	|--------------------------------|--------------------------------------------------------------|
//	| -12345                         | -54321                                                       |
//	 --------------------------------|--------------------------------------------------------------
	
	
	static int reverseInteger(int n) {
		
		if (n == 0) return 0;
		
		int sign = n < 0 ? -1 : 1;
		n = n < 0 ? -n : n;
		int reverse = 0;
		
		while(n!=0) {
			reverse = reverse * 10 + n % 10;
			n /= 10;
		}
		
		return sign * reverse;
	}
	
	static void reverseIntegerTest() {
		System.out.println(reverseInteger(1234));
		System.out.println(reverseInteger(12005));
		System.out.println(reverseInteger(1));
		System.out.println(reverseInteger(1000));
		System.out.println(reverseInteger(0));
		System.out.println(reverseInteger(-12345));
	}
	
	public static void main(String[] args) {
		reverseIntegerTest();
	}

}
