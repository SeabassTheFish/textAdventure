package textAdventure;

public class Exit {
		public String direction;
		public Location leadsTo = null;
		
		// Default Constructor
		public Exit()
		{
			direction = null;
			leadsTo = null;
		}
		
		// Full Constructor
		public Exit(String direction, Location leadsTo)
		{
			direction = direction;
			leadsTo = leadsTo;
		}
		
		public void setLeadsTo(Location leadsTo)
		{
			leadsTo = leadsTo;
		}
		
		public void setDirection(String direction)
		{
			direction = direction;
		}
}
