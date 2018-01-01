// Exit Class
import Location.*;

public class Exit
{
	private String m_direction;
	private Location m_leadsTo = null;
	
	// Default Constructor
	public Exit()
	{
		m_direction = null;
		m_leadsTo = null;
	}
	
	// Full Constructor
	public Exit(String direction, Location leadsTo)
	{
		m_direction = direction;
		m_leadsTo = leadsTo;
	}
	
	public void setLeadsTo(Location leadsTo)
	{
		m_leadsTo = leadsTo;
	}
	
	public void setDirection(String direction)
	{
		m_direction = direction;
	}
}