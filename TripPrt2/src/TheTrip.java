import java.util.Scanner;

public class TheTrip {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String menuChoice;
		
		do {
			System.out.println("A. Buy Stock");
			System.out.println("B. Sell Stock");
			System.out.println("X. Exit");
			System.out.print("Enter your selection: ");
			
			menuChoice = scanner.nextLine().toUpperCase();
			
			switch(menuChoice) {
			case "A": System.out.println("\nBuy Stock"); break;
			case "B": System.out.println("\nSell Stock"); break;
			case "X": System.out.println("\nInvalid Selection. Please try again."); break;
			
			}
			
			System.out.println();
		}while(!menuChoice.equals("X"));
		
		    scanner.close();
		}

	}
