
public class PerfectSquare {
	
//	Write a function nextPerfectSquare that returns the first perfect square that is greater than
//	it's integer argument. A perfect square is an integer that is equal to some integer squared.
//
//	For example 16 is a perfect square because 16 = 4*4. However 15 is not a perfect square because
//	there is no integer n such that 15 = n*n.
//
//	The signature of the function is
//	int isPerfectSquare(int n)
//	Examples
//	 -------------------------|--------------------------------------------------------------
//	| n                       | next perfect square                                          |
//	|-------------------------|--------------------------------------------------------------|
//	| 6                       | 9                                                            |
//	|-------------------------|--------------------------------------------------------------|
//	| 36                      | 49                                                           |
//	|-------------------------|--------------------------------------------------------------|
//	| 0                       | 1                                                            |
//	|-------------------------|--------------------------------------------------------------|
//	| -5                      | 0                                                            |
//	 -------------------------|--------------------------------------------------------------
	
	
	static int isPerfectSquare(int n) {
		
		int current = n + 1;
		
		while (true) {
			for (int i=0;i<=current;i++) {
				if (i*i == current) {
					return current;
				}
			}
			current++;
		}
	}
	
	
	static void perfectSquareTest() {
		System.out.println(isPerfectSquare(6));
		System.out.println(isPerfectSquare(36));
		System.out.println(isPerfectSquare(0));
		System.out.println(isPerfectSquare(-5));
	}
	
	public static void main(String[] args) {
		perfectSquareTest();
	}

}
