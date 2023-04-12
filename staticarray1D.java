
public class staticarray1D {
	public static void main(String args[]) {
		
		int arr [] = new int[5];
		arr[0] = 10;
		arr[1] = 30;
		arr[2] = 60;
		arr[3] = 70;
		arr[4] = 80;
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		//print the array element.
		// only one element want to print 
		System.out.println(arr[2]);
		//print all the elements of the array
		for (int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
			
		
		
		for (int j = 0; j< a.length; j++) {
			System.out.println(a[j]);
		}
		
	}
}
