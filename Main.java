import java.util.Scanner;

// calculates total, average, max, minimum, interest of list of purchases

public class Main {
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		int count;
		double purchase;
		double minimum;
		double max;
		double totalSum;
		double interestRate;
		
		totalSum = 0;
		interestRate = 0.20;
		count = 0;	
			while (count < 5) {
			purchase = scnr.nextDouble();
			totalSum = totalSum + purchase;
			count++;
			}
			
			System.out.println("Total:" + totalSum);
			System.out.println("Average:"+ totalSum / 5);
			System.out.println("Interest:" + totalSum * interestRate);
		}
		
	}






