package practise;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//RotateArray1(new int[] {1, 2, 3, 4, 5, 6, 7}, 2, 7);	// Rotate Array (Method 1)
		
		//CyclicRotateArrayByOne(new int[] {1, 2, 3, 4, 5});	// Cyclic Rotate Array By One
		
	}
	
	/*
	 * Rotate Array (Method 1)
	 */
	public static void RotateArray1(int arr[], int d, int n) {
		
		int[] temp = new int[n];
		int j = 0;
		for (int i = d; i < n; i++) {
			temp[j] = arr[i];
			System.out.println(temp[j]);
			j++;
		}
		for (int i = 0; i < d; i++) {
			temp[j] = arr[i];
			System.out.println(temp[j]);
			j++;
		}
	}
	
	/*
	 * Cyclic Rotate Array By One
	 */
	public static void CyclicRotateArrayByOne(int arr[]) {
		
		int temp = arr[arr.length - 1];
		
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		
		arr[0] = temp;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}	
	
 }
