/* Text Adventure Beginnings */

public class Location
{
	// Member Variables
	private String m_title;
	private String m_description;
	private Vector m_exits;
	
	// Returns location
	public String getTitle()
	{
		return m_title;
	}
	
	// Assigns location title
	public void setTitle(String roomTitle)
	{
		m_title = roomTitle;
	}
	
	// Adds exit in current location
	public void addExit(Exit exit)
	{
		m_exits.addElement(exit);
	}
	
	// Removes an exit from current location
	public void removeExit(Exit exit)
	{
		if (m_exits.contains(exit))
		{
			m_exits.removeElement(exit);
		}
	}
	
	// Returns a vector of exits
	public Vector getExits()
	{
		// Returns clone
		return (Vector) m_exits.clone();
	}
	
	public Location(title, description)
	{
		m_title = title;
		m_description = description;
	}
}

