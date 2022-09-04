
public class Anagram {
	
//	One word is an anagram of another word if it is a rearrangement of all the letters of the second word.
//	For example, the character arrays {'s', 'i', 't'} and {'i', 't', 's'} represent words that are anagrams 
//	of one another because "its" is a rearrangement of all the letters of "sit" and vice versa. 
//	Write a function that accepts two character arrays and returns 1 if they are anagrams of one another,
//	otherwise it returns 0. For simplicity, if the two input character arrays are equal, you may consider them to be anagrams
//
//	If you are programming in Java or C#, the function signature is:
//	int areAnagrams(char [ ] a1, char [ ] a2)
//	If you are programming in C or C++, the function signature is
//	int areAnagrams(a1 char[ ], a2 char[ ], int len) where len is the length of a1 and a2.
//	Hint: Please note that "pool" is not an anagram of "poll" even though they use the same letters. 
//	Please be sure that your function returns 0 if given these two words! You can use another array to
//	keep track of each letter that is found so that you don't count the same letter twice (e.g., the attempt 
//	to find the second "o" of "pool" in "poll" should fail.)
//	Hint: do not modify either a1 or a2, i.e., your function should have no side effects! 
//	If your algorithm requires modification of either of these arrays, you must work with a copy of the array and modify the copy!
//	Examples
//	if input arrays are return
//	{'s', 'i', 't'} and {'i', 't', 's'} 1 
//	{'s', 'i', 't'} and {'i', 'd', 's'} 0 
//	{'b', 'i', 'g'} and {'b', 'i', 't'} 0 
//	{'b', 'o', 'g'} and {'b', 'o', 'o'} 0 
//	{} and {} 1 
//	{'b', 'i', 'g'} and {'b', 'i', 'g'} 1

	
	static int areAnagrams(char [] a1, char [] a2) {
		
		if ( a1.length == 0 && a2.length == 0) {
			return 1;
		}
		
		if ( a1.length != a2.length) {
			return 0;
		} 
		
		for (int i = 0; i < a1.length; i++) {
			
			int count = 1;
			
			for (int j = 0; j < a1.length; j++) {
				if ( i != j && a1[i] == a1[j]) {
					count++;
				}
			} 
			
			int matchCount = 0;
			
			for (int j = 0; j < a2.length; j++) {
				if ( a1[i] == a2[j]) {
					matchCount++;
				}
			}
			
			if (count != matchCount) {
				return 0;
			}
		}
		
		return 1;
	}
	

	
	
	static void anagramTest() {
		System.out.println(areAnagrams(new char[] {'s', 'i', 't'},new char[] {'i', 't', 's'}));
		System.out.println(areAnagrams(new char[] {'s', 'i', 't'},new char[] {'i', 'd', 's'}));
		System.out.println(areAnagrams(new char[] {'b', 'i', 'g'},new char[] {'b', 'i', 't'}));
		System.out.println(areAnagrams(new char[] {'b', 'o', 'g'},new char[] {'b', 'o', 'o'}));
		System.out.println(areAnagrams(new char[] {},new char[] {}));
		System.out.println(areAnagrams(new char[] {'b', 'i', 'g'},new char[] {'b', 'i', 'g'}));
	}
	
	
	
	public static void main(String[] args) {
		anagramTest();
	}
}
