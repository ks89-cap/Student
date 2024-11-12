import java.util.Arrays;

public class Second_Largest {
	 /*

    static int second_largest(int[] arr) {
        int a = Integer.MIN_VALUE; // Largest
        int b = Integer.MIN_VALUE; // Second largest

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a) {
                b = a; // Update second largest
                a = arr[i]; // Update largest
            } else if (arr[i] > b && arr[i] != a) {
                b = arr[i]; // Update second largest
            }
        }

        return (b == Integer.MIN_VALUE) ? -1 : b; // Return -1 if no second largest exists
    }

    public static void main(String[] args) {
        int arr[] = {12, 34, 1, 10, 34, 1};
        
        System.out.println(second_largest(arr)); // Output: 34
    }
    */
	static int largest(int[] arr, int i)
	{
		Arrays.sort(arr);
		return arr[i-2];
	}
	public static void main(String[] args )
	{
		int arr[]= {100,200,400,600};
		int i=arr.length;
		System.out.println(largest(arr,i));
	}
}