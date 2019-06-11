package octest;

import java.util.Scanner;

public class OcTest {
	
	public static void main(String[] args) {
		System.out.println("Application is running...");
		
		boolean isRunning = true;
		Scanner scanner = new Scanner(System.in);
		String input;
		
		while(isRunning) {
			System.out.println("quit? y/n: ");
			input = scanner.nextLine();
			if(input.equals("y")) {
				isRunning = false;
			}
		}
		
		scanner.close();
		System.out.println("Bye");
	}

}
