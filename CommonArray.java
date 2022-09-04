
public class CommonArray {
	
//	Write a function to return an array containing all elements common to two
//	given arrays containing distinct positive integers. You should not use any inbuilt
//	methods. You are allowed to use any number of arrays.
//
//	The signature of the function is:
//	int[] f(int[] first, int[] second)
//
//	Examples:
//	 --------------------------------|--------------------------------------------------------------
//	| if the input parameters are    | return                                                       |
//	|--------------------------------|--------------------------------------------------------------|
//	| {1,8,3,2},{4,2,6,1}            | {1,2}                                                        |
//	|--------------------------------|--------------------------------------------------------------|
//	| {1,8,3,2,6},{2,6,1}            | {2,6,1}                                                      |
//	|--------------------------------|--------------------------------------------------------------|
//	| {1,3,7,9},{7,1,9,3}            | {1,3,7,9}                                                    |
//	|--------------------------------|--------------------------------------------------------------|
//	| {1,2}, {3,4}                   | {}                                                           |
//	|--------------------------------|--------------------------------------------------------------|
//	| {}, {1,2,3}                    | {}                                                           |
//	|--------------------------------|--------------------------------------------------------------|
//	| {1,2}, {}                      | {}                                                           |
//	|--------------------------------|--------------------------------------------------------------|
//	| {1,2}, null                    | null                                                         |
//	|--------------------------------|--------------------------------------------------------------|
//	| null, {}                       | null                                                         |
//	|--------------------------------|--------------------------------------------------------------|
//	| null, null                     | null                                                         |
//	 --------------------------------|--------------------------------------------------------------

	
	static int[] commonArray(int[] first,int[] second) {
		
		if (first == null || second == null){
			return null;
		}
		
		if (first.length == 0 || second.length == 0){
			return new int[]{};
		}
		
		int [] firstCheck = first.length <= second.length ? first : second;
		int [] secondCheck = first.length <= second.length ? second : first;
		int [] common = new int[firstCheck.length];
		int count = 0;
		
		for (int i=0;i<firstCheck.length;i++) {
			for (int j=0;j<secondCheck.length;j++) {
				if (firstCheck[i] == secondCheck[j]) {
					common[count] = firstCheck[i];
					count++;
					break;
				}
			}
		}
		
		int [] commonCheck = new int[count];
		for (int i=0;i<count;i++) {
			commonCheck[i] = common[i];
		}
				
		
		return commonCheck;
	}
	
	static void nullCheckPrint(int[] a) {
		if (a != null) {
			System.out.print('{');
			for (int i=0;i<a.length;i++) {
				if (i > 0) System.out.print(',');
				System.out.print(a[i]);
			}
			System.out.print('}');
			System.out.println();
		}else {
			System.out.println((String)null);
		}
	}
	
	
	static void commmonArrayTest() {
		nullCheckPrint(commonArray(new int[] {1,8,3,2},new int[] {4,2,6,1}));
		nullCheckPrint(commonArray(new int[] {1,8,3,2,6},new int[] {2,6,1}));
		nullCheckPrint(commonArray(new int[] {1,3,7,9},new int[] {7,1,9,3}));
		nullCheckPrint(commonArray(new int[] {1,2},new int[] {3,4}));
		nullCheckPrint(commonArray(new int[] {},new int[] {11,2,3}));
		nullCheckPrint(commonArray(new int[] {1,2},new int[] {}));
		nullCheckPrint(commonArray(new int[] {1,2},null));
		nullCheckPrint(commonArray(null,new int[]{}));
		nullCheckPrint(commonArray(null,null));
	}
	
	
	
	public static void main(String[] args) {
		commmonArrayTest();
	}
	
	

}
