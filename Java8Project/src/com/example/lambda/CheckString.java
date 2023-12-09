package com.example.lambda;

public class CheckString {

	public static boolean isNonNumericString(String str) {
		return (str != null && !str.equals("") && str.chars().allMatch(Character::isLetter));
	}

	public static void main(String[] args) {

		System.out.printf("%s is NonNumeric String?=%b\n", "shubham", isNonNumericString("shubham"));
	}
}
