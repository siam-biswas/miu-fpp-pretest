
public class MostOccurence {
	
//	Write a function that will return the most occurring number in an array. If there is more than
//	one such number, the function may return any one of them.
//	If you are programming in Java or C#, the function signature is int answerTwo(int[] a)
//
//	Examples
//	-------------------------|----------|------------------------------------------------------------
//	| a                       | return   | Explanation                                                |
//	|-------------------------|----------|------------------------------------------------------------|
//	| {6,8,1,8,2}             | 8        | 8 occurs two times. No other number occurs 3 or more times |
//	|-------------------------|----------|------------------------------------------------------------|
//  | {6,8,1,8,6}             | 8 or 6   | 8, 6. The Function may return either 8 or 6                |
//	-------------------------|----------|------------------------------------------------------------

	
	static int answerTwo(int [] a) {
		
		int max = 0;
		int maxCount = 0;
		int count = 0;
		
		for (int i=0;i<a.length;i++) {
			
			count = 1;
			for (int j=0;j<a.length;j++) {
				if (i!=j && a[i] == a[j]) {
					count++;
				}
			}
			
			if (count > maxCount){
				maxCount = count;
				max = a[i];
			}
			
			
		}
		
		return max;
	}
	
	static void mostOccurenceTest() {
		System.out.println(answerTwo(new int[]{6,8,1,8,2}));
		System.out.println(answerTwo(new int[]{6,8,1,8,6}));
	}
	
	
	public static void main(String[] args) {
		mostOccurenceTest();
	}
}
