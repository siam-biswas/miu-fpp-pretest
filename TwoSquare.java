
public class TwoSquare {
	
//	Consider the positive integer 50. Note that 50 = 25 + 25 = 5^2 + 5^2 and 50 = 1 + 49 = 1^2 + 7^2,
//	Thus 50 can be expressed as a sum of the two squares in two different ways.
//	Write a method whether or not a positive integer n can be expressed as a sum of two squares in
//	exactly two different ways.
//	The signature of the function is
//	int answerOne(int n)
	
	static int answerOne(int n) {
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				if (n == i*i + j*j) {
					return 1;
				}
			}
		}
		
		return 0;
	}
	
	
	static void twoSquareTest() {
		System.out.println(answerOne(50));
		System.out.println(answerOne(30));
		System.out.println(answerOne(100));
	}
	
	
	public static void main(String[] args) {
		twoSquareTest();
	}

}
