// Interpreter

public String interpret(String input)
{
	switch (changeCase.toLowerCase(input))
	{
		case "north":
		case "n":
			return "north";
			break;
		case "south":
		case "s":
			return "south";
			break;
		case "west":
		case "w":
			return "west";
			break;
		case "east":
		case "e":
			return "east";
			break;
		case "forward":
		case "f":
			return "forward";
			break;
		case "backward":
		case "back":
		case "b":
			return "backward";
			break;
		case "left":
		case "l":
		case "my left":
			return "left";
			break;
		case "right":
		case "r":
		case "my right":
			return "right";
			break;
		case "up":
		case "u":
			return "up";
			break;
		case "down":
		case "d":
			return "down";
			break;
		case "northeast":
		case "ne":
			return "northeast";
			break;
		case "northwest":
		case "nw":
			return "northwest";
			break;
		case "southeast":
		case "se":
			return "southeast";
			break;
		case "southwest":
		case "sw":
			return "southwest";
			break;
		case "in":
			return "in";
		case "out":
			return "out";
		default:
			return null;
	}
}