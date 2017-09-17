package practise;
import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {

		String str = "Morgan Stanley";
		StringDemo sd = new StringDemo();

		sd.RecursiveReverse(str); // Reverse the String using Recursive Method 1

		System.out.println(sd.RecursiveReverse(str.toCharArray(), 0, str.length() - 1)); // Reverse the String using
																							// Recursive Method 2

		sd.IterativeReverse(str.toCharArray()); // Reverse the String using Iterative Method

		str = "Ab,c,de!$";
		sd.ReverseWithoutSpecialCharacter(str.toCharArray()); // Reverse the String without touching Special Characters
																// using Iterative Method
		
		str = "geeksforgeeks";
		sd.RemoveDuplicates(str.toCharArray()); // Remove Duplicates from the String
		
		sd.RemoveDuplicatesHashing(str.toCharArray()); // Remove Duplicates from the String using bit Manipulation

	}

	/*
	 * Reverse the String using Recursive Method 1
	 */
	public void RecursiveReverse(String str) {

		if (str.length() <= 1 || str == null) {
			System.out.println(str);
		} else {
			System.out.print(str.charAt(str.length() - 1));
			RecursiveReverse(str.substring(0, str.length() - 1));
		}
	}

	/*
	 * Reverse the String using Recursive Method 2
	 */
	public String RecursiveReverse(char[] str, int start, int end) {

		if (end < start) {
			String s = new String(str);
			return s;
		}

		char temp = str[start];
		str[start] = str[end];
		str[end] = temp;
		RecursiveReverse(str, start + 1, end - 1);

		String s = new String(str);
		return s;
	}

	/*
	 * Reverse the String using Iterative Method
	 */
	public void IterativeReverse(char[] str) {

		for (int i = 0; i < str.length / 2; i++) {
			char temp = str[i];
			str[i] = str[str.length - 1 - i];
			str[str.length - 1 - i] = temp;
		}

		System.out.println(str);
	}

	/*
	 * Reverse the String without touching Special Characters using Iterative Method
	 */
	public void ReverseWithoutSpecialCharacter(char[] str) {

		int start = 0, end = str.length - 1;

		while (start < end) {

			if ((str[start] >= 'A' && str[start] <= 'Z' || str[start] >= 'a' && str[start] <= 'z')
					&& (str[end] >= 'A' && str[end] <= 'Z' || str[end] >= 'a' && str[end] <= 'z')) {
				char temp = str[start];
				str[start] = str[end];
				str[end] = temp;
				start++;
				end--;
			} else if (!(str[start] >= 'A' && str[start] <= 'Z' || str[start] >= 'a' && str[start] <= 'z')) {
				start++;
			} else if (!(str[end] >= 'A' && str[end] <= 'Z' || str[end] >= 'a' && str[end] <= 'z')) {
				end--;
			}
		}

		System.out.println(str);
	}
	
	/*
	 * Remove Duplicates from the String
	 */
	public void RemoveDuplicates(char[] str) {
			
		Arrays.sort(str);
		char[] new_str = new char[str.length];
		
		new_str[0] = str[0];
		int j = 1;
		for (int i = 1; i < str.length-1; i++) {
			
			if(str[i] == str[i-1]) {
				continue;
			} else {
				new_str[j] = str[i];
				j++;
			}
		}
		
		System.out.println(new_str);
	}
	
	
	/*
	 * Remove Duplicates from the String using Hashing
	 */
	public void RemoveDuplicatesHashing(char[] str) {
		
		int[] hash = new int[128];
		char[] new_str = new char[str.length];
		int j = 0;
		
		for (int i = 0; i < str.length-1; i++) {
			
			if(hash[str[i]] == 1) continue;
			else {
				new_str[j] = str[i];
				j++;
				hash[str[i]] = 1;
			}
		}
		
		System.out.println(new_str);
	}
}