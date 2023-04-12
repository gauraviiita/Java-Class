import java.util.*;
public class question1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// check either number is grater than 2 or not
		if (num > 2) {
			int count = 0;
			int new_num;
			while(num > 2) {
				num = num / 2;
				count = count + 1;
			}
			System.out.println("The num of times one must "
					+ "repeatedly divide this number by 2 "
					+ "before getting a value less than 2 is : "
					+ count);
		}
		else {
			System.out.println("Please enter a number above than 2. ");
		}
	}
}
