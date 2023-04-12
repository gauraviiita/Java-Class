import java.util.*;
//import java.util.*;
public class question2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person weight in kg : ");
		float weight = sc.nextInt();
		System.out.println("Enter height of person in meter: ");
		float height = sc.nextInt();
		
		float bmi = weight / (height * height);
		System.out.println(bmi);
		/*
		if(bmi < 18.5) {
			System.out.println("The person is under weight.");
		}else if(18.5 < bmi || bmi <= 24.9){
			System.out.println("Normal weight");
		}else if(25.0 <= bmi || bmi <= 29.9) {
			System.out.println("Overweight");
		}else {
			System.out.println("Obese");
		}*/
	}
}
