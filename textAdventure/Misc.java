package textAdventure;

public class Misc {
	public static void insertIntoArrayExit(Exit[] array, int insertIndex, Exit newValue) {
	    //move elements below insertion point.
	    for(int i=array.length-1; i > insertIndex; i--){
	        array[i] = array[i-1];
	    }

	    //insert new value
	    array[insertIndex] = newValue;
	}
	public static void insertIntoArrayLocation(Location[] array, int insertIndex, Location newValue) {
		for (int i = array.length - 1; i > insertIndex; i--) {
			array[i] = array[i - 1];
		}
		
		array[insertIndex] = newValue;
	}
	public static void removeFromArray(Exit[] array, int removeIndex) {

		    for(int i = removeIndex; i < array.length -1; i++){
		        array[i] = array[i + 1];
		    }
		}
}
