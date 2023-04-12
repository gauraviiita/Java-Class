import java.util.*;
public class isOddnum {
	
	
	 public static boolean isOdd(int number)
	   { 
	    return number % 2 !=0;

	}

	public static void main(String args[]) {
		 int number;
	     System.out.println("Enter an integer to check if it is odd or even: ");
	     Scanner input = new Scanner(System.in);
	     number = input.nextInt();
	     isOdd(number);
	     
	     
	     if(isOdd(number)) {
	    	 System.out.println("ODD");
	     }else {
	    	 System.out.println("Even");
	     }
	}
}
