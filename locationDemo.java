// Location Demo

import java.util.*;
import java.applet.*;
import java.awt.*;
import Location.*;
import Exit.*;

public class LocationDemo extends Applet
{
	Location currentLocation;
	String command;
	
	TextField commandInput;
	TextArea displayOutput;
	Button buttonInput;
	
	public LocationDemo()
	{
		super();
	}
	
	public void init()
	{
		super.init();
		
		setBackground(Color.white);
		setForeground(color.black);
		
		Panel appletPanel = new Panel();
		
		BorderLayout b = new BorderLayout();
		appletPanel.setLayout(b);
		add(appletPanel);
		
		commandInput = new TextField(20);
		displayOutput = new TextArea(10, 60);
		buttonInput = new Button("Go");
		Panel inputPanel = new Panel();
		
		inputPanel.add(commandInput);
		inputPanel.add(buttonInput);
		inputPanel.add("North", displayOutput);
		inputPanel.add("South", inputPanel);
		
		Location l1 = new Location("Entrance", "You stand at the entrance");
		Location l2 = new Location("End", "You hit the end");
		Location l3 = new Location("Room", "You have found a dark room");
		
		l1.addExit(new Exit("north", l2);
		l1.addExit(new Exit("east", l3);
		
		l2.addExit(new Exit("south", l1);
		
		l3.addExit(new Exit("west", l1);
		
		currentLocation = l1;
		
		showLocation();
		repaint();
	}
	
	private void showLocation()
	{
		displayOutput.appendText("\n" + currentLocation.getTitle() + "\n");
		displayOutput.appendText("\n");
		
		displayOutput.appendText(currentLocation.getDescription() + "\n");
		
		displayOutput.appendText("\nAvailable exits: \n");
		for (Enumeration e = currentLocation.getExits().elements(); e.hasMoreElements();)
		{
			Exit an_exit = (Exit) e.nextElement();
			displayOutput.appendText(an_exit + "\n");
		}
	}
	
	public boolean action (Event evt, Object focus)
	{
		String command;

		// Was a button pressed ? 
		if (evt.target instanceof Button)
		{
			// Obtain string
			command = commandInput.getText();

			// Don't parse blank commands
			if (command.length() == 0)
				return true;

			// Convert to uppercase for comparison
			command = command.toUpperCase();

			// Search for an exit match
			for (Enumeration e = currentLocation.getExits().elements(); e.hasMoreElements();)
			{
				Exit an_exit = (Exit) e.nextElement();

				if ( (an_exit.getDirectionName().compareTo(command) == 0) ||
					 (an_exit.getShortDirectionName().compareTo(command) == 0 )
				   )
				{
					// Set location to the location pointed to by exit
					currentLocation = an_exit.getLeadsTo();

					// Show new location
					showLocation();

					// Clear text area
					commandInput.setText (new String());

					// Event handled
					return true;
				}				
			}

			// If code reaches here, direction is invalid
			displayOutput.appendText ("\nHuh? Invalid direction!\n");

			// Clear text area
			commandInput.setText (new String());

			// Event handled
			return true;
		}
		// Event not handled
		else return false;
	}
}