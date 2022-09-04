public class CharArray {
	
//	Write a function that accepts a character array, a zero-based start position and
//	a length. It should return a character array containing lengthCharacters starting with
//	the startCharacter of the input array. The function should do error checking on the start
//	position and the length and return null if the either value is not legal.
//
//	The function signature is:
//	char[] f(char[] a, int start, int len)
//
//	 --------------------------------|--------------------------------------------------------------
//	| if the input parameters are is | return                                                       |
//	|--------------------------------|--------------------------------------------------------------|
//	| {'a','b','c'}, 0, 4            | null                                                         |
//	|--------------------------------|--------------------------------------------------------------|
//	| {'a','b','c'}, 0, 3            | {'a','b','c'}                                                |
//	|--------------------------------|--------------------------------------------------------------|
//	| {'a','b','c'}, 0, 2            | {'a','b'}                                                    |
//	|--------------------------------|--------------------------------------------------------------|
//	| {'a','b','c'}, 0, 1            | {'a'}                                                        |
//	|--------------------------------|--------------------------------------------------------------|
//	| {'a','b','c'}, 1, 3            | null                                                         |
//	|--------------------------------|--------------------------------------------------------------|
//	| {'a','b','c'}, 1, 2            | {'b','c'}                                                    |
//	|--------------------------------|--------------------------------------------------------------|
//	| {'a','b','c'}, 1, 1            | {'b'}                                                        |
//	|--------------------------------|--------------------------------------------------------------|
//	| {'a','b','c'}, 2, 2            | null                                                         |
//	|--------------------------------|--------------------------------------------------------------|
//	| {'a','b','c'}, 2, 1            | {'c'}                                                        |
//	|--------------------------------|--------------------------------------------------------------|
//	| {'a','b','c'}, 3, 1            | null                                                         |
//	|--------------------------------|--------------------------------------------------------------|
//	| {'a','b','c'}, 1, 0            | {}                                                           |
//	|--------------------------------|--------------------------------------------------------------|
//	| {'a','b','c'}, -1, 2           | null                                                         |
//	|--------------------------------|--------------------------------------------------------------|
//	| {'a','b','c'}, -1, -2          | null                                                         |
//	|--------------------------------|--------------------------------------------------------------|
//	| {}, 0, 1                       | null                                                         |
//	 -----------------------------------------------------------------------------------------------
//
//	NOTE: To ease debugging, i will return string containing the characters
	
	
	static char[] charArray(char[] a,int start,int len) {
		
		if (start < 0 || len < 0 || start + len > a.length) {
			return null;
		}
		
		char[] b = new char[len];
		
		for (int i=start,j=0; j<len;i++,j++) {
			b[j] = a[i];
		}
		
		return b;
	}
	
	
	static void nullCheckPrint(char[] a) {
		if (a != null) {
			System.out.println(a);
		}else {
			System.out.println((String)null);
		}
	}
	
	
	static void charArrayTest() {
		nullCheckPrint(charArray(new char[] {'a','b','c'}, 0, 4));
		nullCheckPrint(charArray(new char[] {'a','b','c'}, 0, 3));
		nullCheckPrint(charArray(new char[] {'a','b','c'}, 0, 2));
		nullCheckPrint(charArray(new char[] {'a','b','c'}, 0, 1));
		nullCheckPrint(charArray(new char[] {'a','b','c'}, 1, 3));
		nullCheckPrint(charArray(new char[] {'a','b','c'}, 1, 2));
		nullCheckPrint(charArray(new char[] {'a','b','c'}, 1, 1));
		nullCheckPrint(charArray(new char[] {'a','b','c'}, 2, 2));
		nullCheckPrint(charArray(new char[] {'a','b','c'}, 2, 1));
		nullCheckPrint(charArray(new char[] {'a','b','c'}, 3, 1));
		nullCheckPrint(charArray(new char[] {'a','b','c'}, 1, 0));
		nullCheckPrint(charArray(new char[] {'a','b','c'}, -1, 2));
		nullCheckPrint(charArray(new char[] {'a','b','c'}, -1, -2));
		nullCheckPrint(charArray(new char[] {}, 0, 1));
	}
	
	
	
	public static void main(String[] args) {
		charArrayTest();
	}

}
