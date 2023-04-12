import java.util.*;
public class spyNumber0 {
	public static void main(String args[]) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int product =1;
		int sum = 0;
		int reminder;
		
		while(num > 0) {
			reminder = num % 10;
			//System.out.println(reminder);
			sum = sum + reminder;
			product = product * reminder;
			num = num / 10;
			System.out.println(num);
		}
		// compare the sum and product.
		if(sum == product) {
			System.out.println("Given number is spy number");
		}else {
			System.out.println("Given number is no spy number");
		}
	}
}
