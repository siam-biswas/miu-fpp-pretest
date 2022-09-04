
public class PorcupineNumber {

//	A prime number is an integer that is divisible only by 1 and itself. A porcupine number is a prime
//	number whose last digit is 9 and the next prime number that follows it also ends with the digit 9.
//	For example 139 is a porcupine number because:
//	a - it is prime
//	b - it ends in a 9
//	c - The next prime number after it is 149 which also ends in 9.
//	Note that 140, 141, 142, 143, 144, 145, 146, 147, and 148 are not prime so 149 is the next prime
//	number after 139.
//
//	Write a method named findPorcupineNumber which takes an integer argument n and returns the first
//	porcupine number that is greater than n. So findPorcupineNumber(0) would return 139 (because 139
//	happens to be the first porcupine number) and so would findPorcupineNumber(138).
//	But findPorcupineNumber(139) would return 409 which is the second porcupine number.
//
//	The function signature is
//	int findPorcupineNumber(int n)
//	You may assume that a porcupine number greater than n exists.
//	You may assume that a function isPrime exists that returns 1 if its argument is prime, otherwise
//	it returns 0. e.g isPrime(7) returns 1 and isPrime(8) returns 0.
//	Hint: Use modulo base 10 arithmetic to get last digit of a number.

	static int isPrime(int n) {

		if (n < 2) {
			return 0;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return 0;
			}
		}

		return 1;

	}

	static int findPorcupineNumber(int n) {

		int pN = 0;
		boolean isFirstPN = false;
		int max = Integer.MAX_VALUE;
		n++;

		while (n <= max) {

			if (isFirstPN == true) {
				if (isPrime(n) == 1) {
					if (n % 10 == 9) {
						break;
					} else {
						isFirstPN = false;
					}
				}
			} else {
				if (isPrime(n) == 1 && n % 10 == 9) {
					isFirstPN = true;
					pN = n;
				}
			}

			n++;
		}

		return pN;

	}

	static void porcupineNumberTest() {
		System.out.println(findPorcupineNumber(0));
		System.out.println(findPorcupineNumber(139));
	}

	public static void main(String[] args) {
		porcupineNumberTest();
	}

}
