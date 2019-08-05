package com.BasicProgram;

import java.util.Scanner;

public class LeapYear_Demo {
public static void main(String[] args) {
	int year;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the year");
	year=in.nextInt();
	if((year%400==0)||(year%4==0))
System.out.println("Year"+year+"is a leap year");
else
	System.out.println("Year"+year+"is not a leap year");
}
}
