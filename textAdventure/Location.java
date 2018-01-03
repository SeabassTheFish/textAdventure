package textAdventure;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import textAdventure.Exit.*;
import textAdventure.Misc.*;

public class Location {
	// Member Variables
		public String title;
		public String description;
		public List<Exit> exits = new ArrayList<Exit>();
		
		
		// Returns location
		public String getTitle() {
			return title;
		}
		
		// Assigns location title
		public void setTitle(String roomTitle) {
			title = roomTitle;
		}
		
		// Adds exit in current location
		public void addExit(Exit exit) {
			exits.add(exit);
		}
		
		// Removes an exit from current location
		public void removeExit(Exit exit) {
			if (exits.contains(exit)) {
				exits.remove(exit);
			}
		}
		
		// Returns a vector of exits
		//TODO
		
		public Location(String title, String description) {
			title = title;
			description = description;
		}
}
