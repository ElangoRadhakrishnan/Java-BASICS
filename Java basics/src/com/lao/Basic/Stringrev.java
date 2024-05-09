package com.lao.Basic;

public class Stringrev {
	 public static String reverseString(String input) {
	      
		 StringBuilder reversed = new StringBuilder();
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed.append(input.charAt(i));
	        }
	        return reversed.toString();
	    }

	    public static void main(String[] args) {
	        String originalString = "Hello, world!";
	        String reversedString = reverseString(originalString);
	        System.out.println("Original: " + originalString);
	        System.out.println("Reversed: " + reversedString);
	    }
	}
