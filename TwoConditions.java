
public class TwoConditions {
	
//	Write a function that will return 1 if an integer array satisfies the following conditions and returns 0 otherwise.
//	1. it has even numbers of elements
//	2. Sum of all the numbers in the first half of the array is equal to the sum of all the numbers in the second half of the array.
//
//	If you are programming in Java, the function Signature is
//	int answerThree(int[] a)
//	Examples
//	 -------------------|--------|-----------------------------------------------------------------------
//	| a                 | return | Explanation                                                           |
//	|-------------------|--------|-----------------------------------------------------------------------|
//	| {5,4,3,2,3,4,6,1} | 1      | *There are 8 (even) number of elements in the array. Thus condition 1 |
//	|                   |        | satisfied.                                                            |
//	|                   |        | *The sum of all the numbers in the first half = 5+4+3+2 = 14          |
//	 -------------------|--------|-----------------------------------------------------------------------

	
	static int answerThree(int [] a){
		
		if (a.length % 2 != 0) {
			return 0;
		}
		
		int firstSum = 0;
		int lastSum = 0;
		int midIndex = a.length/2;
		
		for (int i=0;i<a.length;i++) {
			if (i < midIndex){
				firstSum += a[i];
			}else {
				lastSum += a[i];
			}
		}
		
		
		return firstSum == lastSum ? 1 : 0;
	}
	
	static void twoConditionsTest() {
		System.out.println(answerThree(new int[]{5,4,3,2,3,4,6,1}));
		System.out.println(answerThree(new int[]{5,4,3,2,3,4,6}));
		System.out.println(answerThree(new int[]{5,4,3,2,3,4,6,2}));
		System.out.println(answerThree(new int[]{6,4,3,2,3,4,6,2}));
	}
	
	
	public static void main(String[] args) {
		twoConditionsTest();
	}

}
