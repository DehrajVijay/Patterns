package com.star;

import java.util.Scanner;

public class StarPattern2 {

	public static void main(String[] args) {
		int rows;
		int columns;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows");
		rows = sc.nextInt();
		System.out.println("enter the columns");
		columns = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) 
				System.out.print("*");
				System.out.println();
			}
		}

	}
