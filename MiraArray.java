
public class MiraArray {
	
//	A Meera array is any array that contains the value 1 if and only if it contains 9.
//	The array {7,9,0,10,1} is a Meera array because it contains 1 and 9.
//	The array {6,10,8} is a Meera array because it contains no 1 and no 9.
//	The array {7,6,1} is not a Meera array because it contains 1 but does not contain a 9.
//	The array {9,10,0} is not a Meera array because it contains a 9 but does not contain 1.
//	It is okay if a Meera array contains more than one value 1 and more than one 9.
//	So the array {1,1,0,8,0,9,9,1} is a Meera array.
//	Write a function named isMeera that returns 1 if it's array argument is a Merra array
//	and returns 0 otherwise.
//	If you are programming in Java or C#, the function signature is int isMeera(int[] a)
	
	static int isMeera(int[] a) {
		
		boolean hasOne = false;
		boolean hasNine = false;
		
		for (int i=0;i<a.length;i++) {
			if (a[i] == 1) {
				hasOne = true;
			}
			if (a[i] == 9) {
				hasNine = true;
			}
		}
		
		return (hasOne == true && hasNine == true) || (hasOne == false && hasNine == false) ? 1 : 0;
	}
	
	static void miraArrayTest() {
		System.out.println(isMeera(new int[] {7,9,0,10,1}));
		System.out.println(isMeera(new int[] {6,10,8}));
		System.out.println(isMeera(new int[] {7,6,1}));
		System.out.println(isMeera(new int[] {9,10,0}));
		System.out.println(isMeera(new int[] {1,1,0,8,0,9,9,1}));
		System.out.println(isMeera(new int[] {10,9}));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miraArrayTest();

	}

}
