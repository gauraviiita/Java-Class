import java.util.*;
public class BMI {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person weight in Kg: ");
		float weight = sc.nextFloat();
		System.out.println("Enter height of person in meter: ");
		float height = sc.nextFloat();
		//calculate the bmi
		float bmi = weight / (height * height);
		System.out.println(bmi);
		
		if(bmi < 18.5) {
			System.out.println("Under weight");
		}else if(bmi >= 18.5 && bmi <=24.9) {
			System.out.println("Normal weight");
		}else if(bmi >= 25.0 && bmi <= 29.0) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
	}
}
