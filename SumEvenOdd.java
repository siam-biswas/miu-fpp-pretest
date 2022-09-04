
public class SumEvenOdd {

//	Write a function that takes an array of integers as an argument and returns a
//	value based on the sums of the even and odd numbers in the array. Let X = the sum of the odd
//	numbers in the array and let Y = the sum of the even numbers. The function should return X - Y
//	The signature of the function is:
//	int f(int[] a)
//	Examples:
//	 -----------------------|-----------------------------------------------------------------------
//	| if input array is     | return                                                                |
//	|-----------------------|-----------------------------------------------------------------------|
//	| {1}                   | 1                                                                     |
//	|-----------------------|-----------------------------------------------------------------------|
//	| {1,2}                 | -1                                                                    |
//	|-----------------------|-----------------------------------------------------------------------|
//	| {1,2,3}               | 2                                                                     |
//	|-----------------------|-----------------------------------------------------------------------|
//	| {1,2,3,4}             | -2                                                                    |
//	|-----------------------|-----------------------------------------------------------------------|
//	| {3,3,4,4}             | -2                                                                    |
//	|-----------------------|-----------------------------------------------------------------------|
//	| {}                    | 0                                                                     |
//	 -----------------------------------------------------------------------------------------------

	static int sumEvenOdd(int[] items) {

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 0; i < items.length; i++) {
			if (items[i] % 2 == 0){
				sumEven += items[i];
			}else {
				sumOdd += items[i];
			}
		}

		return sumOdd - sumEven;
	}

	static void sumEvenOddTest() {
		System.out.println(sumEvenOdd(new int[] { 1 }));
		System.out.println(sumEvenOdd(new int[] { 1,2 }));
		System.out.println(sumEvenOdd(new int[] { 1,2,3 }));
		System.out.println(sumEvenOdd(new int[] { 1, 2, 3, 4 }));
		System.out.println(sumEvenOdd(new int[] { 3,3,4,4 }));
		System.out.println(sumEvenOdd(new int[] { }));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumEvenOddTest();

	}

}
