/*Write a Java program that can take a positive integer greater than 2 as input and write out the
number of times one must repeatedly divide this number by 2 before getting a value less
than 2.*/

package dsa;

import java.util.Scanner;

public class Alpha1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number greater than 2: ");
		int n = sc.nextInt();
		int a = 0, r = 0;
		if(n<2) {
			System.out.println("The entered number is smaller than 2");
			return;
		}
		while (n > 2) {
			n = n / 2;
			a++;
		}
		System.out.print("The number times that  can be divided by 2 is  " + a);

	}

}
