package textAdventure;

import java.util.Vector;
import textAdventure.Exit.*;
import textAdventure.Misc.*;

public class Location {
	// Member Variables
		public String title;
		public String description;
		public Exit[] exits = new Exit[10];
		
		
		// Returns location
		public String getTitle() {
			return title;
		}
		
		// Assigns location title
		public void setTitle(String roomTitle) {
			title = roomTitle;
		}
		
		// Adds exit in current location
		public void addExit(Exit exit, int index) {
			Misc.insertIntoArray(exits, index, exit);
		}
		
		// Removes an exit from current location
		//TODO
		
		// Returns a vector of exits
		//TODO
		
		public Location(String title, String description) {
			title = title;
			description = description;
		}
}
