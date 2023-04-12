import java.util.*;
public class dynamicarray2d {
	public static void main(String args[]) {
		//take the input from user using Scanner object 
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number of rows of array: ");
		int rows = sc.nextInt();
		System.out.printf("Enter teh number of columns of array");
		int cols = sc.nextInt();
		
		//create an array
		int arr[][] = new int[rows][cols];
		
		//enter the elements of array.
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		//print the elements of the array;
		System.out.println("Elements of the array are as follows: ");
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
