//*Write a java program to find the maximum and minimum and how many times they both occur
//in an array of n elements. Find out the positions where the maximum first occurs and the
//minimum last occurs.
//*Sample Run:
//Enter number of elements of Array: 5
//Enter elements of the array: 12 14 12 14 13
//Maximum element of Array is 14 and occurs 2 times.
//Minimum element of Array is 12 and occurs 2 times.
//First occurrence of maximum element is at position 2.
//Last occurrence of minimum element is at position 3.
package dsa;

import java.util.Scanner;

public class Alpha7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the " + n + " number of integer:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0], min = arr[0], p = 1, q = 1,a=0;
		for (int i = 1; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
				p = 1;
			} else if (max == arr[i]) {
				p++;
			}

			if (min > arr[i]) {
				min = arr[i];
				q = 1;
			} else if (min == arr[i]) {
				q++;
			}
		}

		System.out.println("The maximum element of the given array is: " + max);
		System.out.println("The maximum number is repeated " + p + " times");
		System.out.println("The minimum element of the given array is: " + min);
		System.out.println("The minimum number is repeated " + q + " times");
		System.out.println("First occurrence of maximum element is at position:"+a);
		for(int i = 0; i < n; i++) {
			if(max==arr[i]) {
				a=i;
				
			}
		}

		// Sorting the array in ascending order
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.print("The arrangement in ascending order is: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// Sorting the array in descending order
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.print("The arrangement in descending order is: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
