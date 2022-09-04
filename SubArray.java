
public class SubArray {
	
//	A Sub Array is defined to be an array in which each element is greater than sum of all
//	elements after that. see example below:
//	{13,6,3,2} is a sub array. Note that 13 > 6+3+2, 6 > 3+2, 3>2.
//	{11,5,3,2} is NOT a sub array. Note that 5 is not greater than 3+2.
//	Write a function named isSub that returns 1 if its array argument is a Sub array. otherwise it returns 0.
//	if you are programming in Java or C#, the function signature is: int isSub(int[] a)
	
	
	static int isSub(int[] a){
		
		if (a.length == 0) {
			return 0;
		}
		
		if (a.length < 2) {
			return 1;
		}

		for (int i = 0; i < a.length - 1; i++){
			int sum = 0;
			for (int j = i + 1; j < a.length; j++){
			    sum += a[j];
			}
			
			if (a[i] <= sum ){
			   return 0;
			}
		}

		return 1;

	}
	
	static void subArrayTest() {
		System.out.println(isSub(new int[] {13,6,3,2}));
		System.out.println(isSub(new int[] {11,5,3,2}));
		System.out.println(isSub(new int[] {}));
		System.out.println(isSub(new int[] {1}));
	}
	
	
	public static void main(String[] args) {
		subArrayTest();
	}

}
