import java.util.*;
public class spyNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		//convert number into string
		String new_num = Integer.toString(num);
		int sum = 0;
		for(int i=0; i<new_num.length(); i++) {
			//sum = sum + new_num.charAt(i);
			System.out.println(new_num.charAt(i));
		}
		//System.out.println(sum);
	}
}
