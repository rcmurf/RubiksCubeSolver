
public class RubiksCube {

	public String[][] side1;
	public String[][] side2;
	public String[][] side3;
	public String[][] side4;
	public String[][] side5;
	public String[][] side6;

	// Constructor for an existing cube and its current state.
	public RubiksCube(String[][] sideOne, String[][] sideTwo, String[][] sideThree, String[][] sideFour, String[][] sideFive, String[][] sideSix) {
		side1 = sideOne;
		side2 = sideTwo;
		side3 = sideThree;
		side4 = sideFour;
		side5 = sideFive;
		side6 = sideSix;
	}

	// Constructor for an empty cube.
	public RubiksCube() {
		side1 = null;
		side2 = null;
		side3 = null;
		side4 = null;
		side5 = null;
		side6 = null;
	}

}
