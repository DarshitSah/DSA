//The body mass index (BMI) is commonly used by health and nutrition professionals to estimate
//human body fat in populations. It is computed by taking the individual's weight (mass) in
//kilograms and dividing it by the square of their height in meters. i.e.
//Metric: BMI = 𝑾𝒆𝒊𝒈𝒉𝒕 (𝒌𝒈)/(𝑯𝒆𝒊𝒈𝒉𝒕)𝟐 (𝒎𝟐)
//Write a java program by using conditional statement to show the category for a given BMI.
package dsa;

import java.util.Scanner;

public class Alpha2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your weight:");
		double w = sc.nextDouble();
		System.out.println("Enter your height in meter:");

		double h = sc.nextDouble();
		double BMI = (w / Math.pow(h, 2));
		if (BMI < 18.5) {
			System.out.println("Underweighted");
		} else if (BMI >= 18.5 && BMI < 24.9) {
			System.out.println("Normal Weight");
		} else if (BMI >= 25 && BMI < 29) {
			System.out.println("Over Weight");
		} else {
			System.out.println("Obese");
		}

	}

}
