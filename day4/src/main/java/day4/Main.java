package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice;
		int x = 0;
		System.out.println("Choose your number of choice from 1 to 9.");
		Scanner in = new Scanner(System.in);  
		choice = in.nextLine();
		x = Integer.parseInt(choice);
		System.out.println("Counting.....");
		toCount(x);
	}
	
	public static void toCount( int x) {
		if (x > 0 && x <= 9) {
			
			toCount(x - 1);
			
			System.out.println(x);
		}
		else if (x <= 0 && x >= 9){
			System.out.println("Please follow instruction above. Thank you!");
		}
		
	}

}
