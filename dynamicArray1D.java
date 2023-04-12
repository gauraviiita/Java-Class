import java.util.*;
public class dynamicArray1D {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		// initialize the array
		int arr [] = new int[size];
		System.out.println("Enter the elements of array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Print the element of the array: ");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] +" ");
		}
	}
}
