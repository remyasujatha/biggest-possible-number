package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BiggestPossibleNumber {
	
	static ArrayList<Long> numberArray = new ArrayList<Long>();
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong();
		ArrayList<Long> numArray = convertToLongArray(number);
		Collections.sort(numArray, Collections.reverseOrder());
		long result = convertArrayToLong(numArray);
		System.out.println(result);
	}

	private static long convertArrayToLong(ArrayList<Long> numArray) {
		long result = 0;
		for (Long num : numArray) {
			result = result*10 + num;
		}
		return result;
	}

	private static ArrayList<Long> convertToLongArray(long number) {
		if(number==0) {
			return numberArray;
		}
		long digit = number % 10;
		if(digit!= 5) {
			numberArray.add(digit);
		}
		return convertToLongArray(number/10);
	}

}
