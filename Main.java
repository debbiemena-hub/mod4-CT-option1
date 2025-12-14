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
		
		totalSum = 0;
		count = 0;	
			while (count < 5) {
			purchase = scnr.nextDouble();
			totalSum = totalSum + purchase;
			count++;
			}
			
			System.out.println("Total:" + totalSum);
			System.out.println("Average:"+ totalSum / 5);
		}
		
	}






