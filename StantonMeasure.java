
public class StantonMeasure {
	
//	The Stanton measure of an array is computed as follows. Count the number of 1s in the array.
//	Let this count be n. The Stanton measure is the number of times that n appears in the array.
//	For example, the Stanton measure of {1,4,3,2,1,2,3,2} is 3 because 1 occurs 2 times in the array and
//	2 occurs 3 times.
//	Write a function named stantonMeasure that returns the Stanton measure of its array argument.
//	If you are programming in Java or C#, the function prototype is
//	int stantonMeasure(int[] a)
//	Examples
//	 -------------------------|----------|------------------------------------------------------------
//	| if a is                 | return   | reason                                                     |
//	|-------------------------|----------|------------------------------------------------------------|
//	| {1}                     | 1        | 1 occurs 1 time, 1 occurs 1 time                           |
//	|-------------------------|----------|------------------------------------------------------------|
//	| {0}                     | 1        | 1 occurs 0 times, O occurs 1 time                          |
//	|-------------------------|----------|------------------------------------------------------------|
//	| {3,1,1,4}               | 0        | 1 occurs 2 times, 2 occurs 0 times                         |
//	|-------------------------|----------|------------------------------------------------------------|
//	| {1,3,1,1,3,3,2,3,3,3,4} | 6        | 1 occurs 3 times, 3 occurs 6 times                         |
//	|-------------------------|----------|------------------------------------------------------------|
//	| {}                      | 0        | 1 occurs 0 times, 0 occurs 0 times                         |
//	 -------------------------|----------|------------------------------------------------------------
	
	static int stantonMeasure(int[] a){

		int oneCount = 0;
		int count = 0;
		
		for (int i = 0; i < a.length ; i++){
			if (a[i] == 1){
				oneCount++;
			}
		}

		for (int i = 0; i < a.length ; i++){
			if (a[i] == oneCount){
				count++;
			}
		} 

		return count;
	}

	
	static void stantonMeasureTest() {
		System.out.println(stantonMeasure(new int[] {1} ));
		System.out.println(stantonMeasure(new int[] {0}));
		System.out.println(stantonMeasure(new int[] {3,1,1,4} ));
		System.out.println(stantonMeasure(new int[] {1,3,1,1,3,3,2,3,3,3,4} ));
		System.out.println(stantonMeasure(new int[] {}  ));
	}
	
	
	public static void main(String[] args) {
		stantonMeasureTest();
	}

}
