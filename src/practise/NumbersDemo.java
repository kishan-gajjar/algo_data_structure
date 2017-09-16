package practise;

public class NumbersDemo {

	public static void main(String[] args) {
		
		//System.out.println(isMultipleOf3(21));	// Check if number is Multiple of 3
		
		//System.out.println(multiplyBySeven(1)); // Multiply given number to 7 using shift operator
		
		//System.out.println(SquareRootMethod1(9));	// Find Square root of Number (Method 1)
		
		//System.out.println(SquareRootMethod2(4));	// Find Square root of Number (Method 2)
		

	}
	
	/*
	 * Check if number is Multiple of 3 
	 */
	public static boolean isMultipleOf3(int n) {
		
		if(n < 0) n = -n;
		if(n == 0) return true;
		if(n == 1) return false;
		
		int odd_count = 0, even_count = 0;
		
		while(n > 0) {
			
			if((n & 1) == 1) odd_count++;
			n = n >> 1;
			
			if((n & 1) == 1) even_count++;
			n = n >> 1;
			
		}
		
		 return isMultipleOf3(odd_count - even_count);
	}
	
	
	/*
	 * Multiply given number to 7 using shift operator
	 */
	public static int multiplyBySeven(int n) {
		
		/*
		 * e can multiply a number by 7 using bitwise operator. 
		 * First left shift the number by 3 bits (you will get 8n) 
		 * then subtract the original number from the shifted number
		 * and return the difference (8n – n).
		 */
		return ((n << 3) - n);
	}


	/*
	 * Incomplete functions
	 */
	public static String Permutation(String s, int l, int r) {
		
		if (l == r) return s;
		
		return s;
	}
	
	/*
	 * Utility function for Permutation
	 */
	public static String Swap(String s, int i, int j) {
		
		char temp;
		char[] charArray = s.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		
		return String.valueOf(charArray);
	}

	
	/*
	 * Find Square root of Number (Method 1)
	 */
	public static int SquareRootMethod1(int n) {
		
		// Cannot find square root of negative numbers
		if (n < 0) return 0;
		
		// Square root of 0 is 0 and 1 is 1
		if (n == 0 || n == 1) return n;
		
		int result = 1, i = 1;
		while (result < n) {
			
			if (result == n) return result;
			i++;
			result = i*i;
		}
		
		if (i*i == n) return i;
		
		return i-1;
	}
	
	
	/*
	 *  Find Square root of Number (Method 2)
	 */
	public static int SquareRootMethod2(int n) {
		
		// Cannot find square root of negative numbers
		if (n < 0) return 0;
		
		// Square root of 0 is 0 and 1 is 1
		if (n == 0 || n == 1 ) return n;
		
		int start = 0, end = n/2, ans = 0;
		
		while(start <= end) {
			
			int mid = (start + end)/2;
			
			if (mid * mid == n) return mid;
			if (mid * mid > n) {
				ans = mid;
				end = mid - 1;
			} else {
				ans = mid;
				start = mid + 1 ;
				
			}
		}
		
		return ans;
	}
	
}
