package com.lao.Basic;
import java.util.Scanner;
public class Pallindrome {
	 public static boolean isPalindrome(String str) {
	        // Remove non-alphanumeric characters and convert to lowercase
	        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        
	        int left = 0;
	        int right = cleanStr.length() - 1;

	        while (left < right) {
	            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPal = isPalindrome(input);
        if (isPal) {
            System.out.println("'" + input + "' is a palindrome.");
        } else {
            System.out.println("'" + input + "' is not a palindrome.");
        }
    }

}

