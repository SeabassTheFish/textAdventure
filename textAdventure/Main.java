package textAdventure;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Location currentLocation = new Location("Start Room", "This is the starting room.");
		Scanner reader = new Scanner(System.in);
		System.out.println("Random description");
		String response = reader.next();
		reader.close();
		System.out.println(response);
	}

}
