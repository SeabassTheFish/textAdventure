package textAdventure;
import textAdventure.Main.*;

public class Actor {
	public void Act(Location currentRoom, String input) {
		switch (input) {
			case ("north"):
				if (currentRoom.exits[0] != null) {
					currentRoom = currentRoom.exits[0].leadsTo;
				}
				break;
			default:
				System.out.println("Sorry, I couldn't understand that.");
		}
	}
}
