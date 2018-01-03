package textAdventure.rooms;
import textAdventure.Location;
import textAdventure.rooms.*;
import textAdventure.rooms.nextRoom;

public class startRoom extends Location {
	public startRoom(String title, String description) {
		super("Start Room", "This is the room where you start.");
		textAdventure.Exit northExit = new textAdventure.Exit("north", nextRoom);
	}
}
