

public class iq3 {

	public static void main(String[] args) {
		/*
		 * // Write a Java Program to print the first 10 numbers of Fibonacci series.
		 * Fibonacci series: The next number is the sum of two previous numbers You have
		 * to print -> 1,1,2,3,5,8,13,21,34,55...
		 */
		int[] arr1 = new int[19];
		arr1[0] = 1;
		arr1[1] = 1;
		System.out.print (arr1[0]+" ");
		System.out.print (arr1[1]+" ");
		for (int i = 2; i < arr1.length; i++) {
			arr1[i] = arr1[i-1] + arr1[i - 2];
			System.out.print(arr1[i]+" ");
		}
	}
}
