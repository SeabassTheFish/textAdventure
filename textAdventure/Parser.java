package textAdventure;
// Interpreter

public class Parser {
	public String interpret(String input) {
		switch (input.toLowerCase()) {
			case "north":
			case "n":
				return "north";
			case "south":
			case "s":
				return "south";
			case "west":
			case "w":
				return "west";
			case "east":
			case "e":
				return "east";
			case "forward":
			case "f":
				return "forward";
			case "backward":
			case "back":
			case "b":
				return "backward";
			case "left":
			case "l":
			case "my left":
				return "left";
			case "right":
			case "r":
			case "my right":
				return "right";
			case "up":
			case "u":
				return "up";
			case "down":
			case "d":
				return "down";
			case "northeast":
			case "ne":
				return "northeast";				
			case "northwest":
			case "nw":
				return "northwest";				
			case "southeast":
			case "se":
				return "southeast";
			case "southwest":
			case "sw":
				return "southwest";
			case "in":
				return "in";
			case "out":
				return "out";
			default:
				return null;
		}
	}
}