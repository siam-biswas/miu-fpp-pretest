
public class BeanArray {
	
//	A Bean array is defined to be an integer array where for every value n in the array,
//	there is also an element 2n, 2n+1 or n/2 in the array.
//
//	for example {4,9,8} is a Bean array because for 4,8 is present, for 9, 4 is present, for 8, 4 is present.
//	Other Bean arrays include {2,2,5,11,23}, {7,7,3,6} and {0}
//	The array {3,8,4} is not a Bean array because of the value 3 which requires that the array contains
//	either the value 6, 7 or 1 and none of these values are in the array.
//	Write a function named isBean that returns 1 if it's array argument is a Bean array,
//	otherwise it returns a 0.
//	if you are programming in Java or C#, the function signature is int isBean(int[] a)
	
	
	static int isBean(int[] a) {
		
		if (a.length == 0) return 0;
		if (a.length == 1) return 1;
		
		int bean = 1;
		
		for (int i=0;i<a.length;i++) {
			
			boolean found = false;
			
			for(int j=0;j<a.length;j++) {
				if (i != j){
					if (a[j] == 2*a[i] || a[j] == 2*a[i] + 1 || a[j] == a[i]/2) {
						found = true;
						break;
					}
				}
				
			}
			
			if (found == false) {
				bean = 0;
				break;
			}
				
		}
		
		return bean;
	}
	
	static void beanrrayTest() {
		System.out.println(isBean(new int[] {4,9,8}));
		System.out.println(isBean(new int[] {2,2,5,11,23}));
		System.out.println(isBean(new int[] {7,7,3,6}));
		System.out.println(isBean(new int[] {0}));
		System.out.println(isBean(new int[] {3,8,4}));
		System.out.println(isBean(new int[] {10,9}));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		beanrrayTest();

	}

}
