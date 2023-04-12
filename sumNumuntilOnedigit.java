
public class sumNumuntilOnedigit {
	public static void main(String args[]) {
		int num = 9294;
		int sum =0;
		int lastnum = 0;
		int firstdigit;
		int num1;
		while(num >= 10) {
			firstdigit = num % 10;
			lastnum = lastnum + firstdigit;
			//num = num / 10;
			num = num / 10;
		}
		
		while(lastnum >= 1) {
			num1 = lastnum % 10;
			sum = sum +num1;
			lastnum = lastnum / 10;
		}
		
		System.out.println(sum);
	}
}
