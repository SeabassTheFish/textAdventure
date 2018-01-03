package textAdventure;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void init() {
		List<Location> rooms = new ArrayList<Location>();
		List<Actor> actors = new ArrayList<Actor>();
		List<GameObject> objects = new ArrayList<GameObject>();
		
		// Locations
		Location startRoom = new Location("Start Room", "This is the starting room.");
		rooms.add(startRoom);
		Location nextRoom = new Location("Next Room","This is the next room.");
		rooms.add(nextRoom);
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.println("Random description");
			String response = reader.next();
			response = Parser.interpret(response);
			System.out.println(response);
		}
	}

}
