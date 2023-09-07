package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Pick a year");
		int givenyear = in.nextInt();
		boolean leapYear = (givenyear % 4 == 0) && (givenyear % 100 != 0) || (givenyear % 400 == 0);
		System.out.println(givenyear + " is a leap year: " + leapYear);
		
	}

}
