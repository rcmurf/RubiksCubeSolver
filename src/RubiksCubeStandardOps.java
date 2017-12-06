/**
 * side1 = top of cube
 * side2 = side facing you
 * side3 = bottom of cube
 * side4 = side facing away from you
 * side5 = right side of cube
 * side6 = left side of cube
 */

public class RubiksCubeStandardOps {
	
	//Initialize the Rubik's Cube in its existing state.
	public static RubiksCube initializeCube() {
		String[][] side1 = new String[3][3];
		String[][] side2 = new String[3][3];
		String[][] side3 = new String[3][3];
		String[][] side4 = new String[3][3];
		String[][] side5 = new String[3][3];
		String[][] side6 = new String[3][3];
		
		side1[0][0] = "blue";
		side1[1][0] = "blue";
		side1[2][0] = "blue";
		side1[0][1] = "blue";
		side1[1][1] = "blue";
		side1[2][1] = "blue";
		side1[0][2] = "blue";
		side1[1][2] = "blue";
		side1[2][2] = "blue";
		
		side2[0][0] = "orange";
		side2[0][1] = "orange";
		side2[0][2] = "orange";
		side2[1][0] = "orange";
		side2[1][1] = "red";
		side2[1][2] = "green";
		side2[2][0] = "orange";
		side2[2][1] = "orange";
		side2[2][2] = "red";
		
		side3[0][0] = "white";
		side3[0][1] = "white";
		side3[0][2] = "green";
		side3[1][0] = "white";
		side3[1][1] = "green";
		side3[1][2] = "yellow";
		side3[2][0] = "green";
		side3[2][1] = "orange";
		side3[2][2] = "yellow";
		
		side4[0][0] = "yellow";
		side4[0][1] = "yellow";
		side4[0][2] = "white";
		side4[1][0] = "yellow";
		side4[1][1] = "orange";
		side4[1][2] = "white";
		side4[2][0] = "green";
		side4[2][1] = "yellow";
		side4[2][2] = "white";
		
		side5[0][0] = "white";
		side5[0][1] = "white";
		side5[0][2] = "red";
		side5[1][0] = "red";
		side5[1][1] = "yellow";
		side5[1][2] = "green";
		side5[2][0] = "yellow";
		side5[2][1] = "red";
		side5[2][2] = "orange";
		
		side6[0][0] = "red";
		side6[0][1] = "red";
		side6[0][2] = "yellow";
		side6[1][0] = "green";
		side6[1][1] = "white";
		side6[1][2] = "green";
		side6[2][0] = "red";
		side6[2][1] = "red";
		side6[2][2] = "green";
		
		RubiksCube cube = new RubiksCube(side1, side2, side3, side4, side5, side6);
		return cube;
	}
	
	//Solves the Rubik's Cube from its existing state.
	public static void solveRubiksCube(RubiksCube cube) {
		System.out.println("Solving the Rubik's Cube...");
		
		System.out.println("Here is the current cube:\n");
		printRubiksCube(cube);
		System.out.println("-----------------------------------------");
		
		//cube = PuzzleRotations.rotateTopRowCounterClockwiseOnce(cube);
		//cube = PuzzleRotations.rotateTopRowClockwiseOnce(cube);
		//cube = PuzzleRotations.rotateMiddleRowCounterClockwiseOnce(cube);
		//cube = PuzzleRotations.rotateMiddleRowClockwiseOnce(cube);
		//cube = PuzzleRotations.rotateBottomRowCounterClockwiseOnce(cube);
		//cube = PuzzleRotations.rotateBottomRowClockwiseOnce(cube);
		
		cube = PuzzleRotations.rotateLeftColumnForwardOnce(cube);
		
		printRubiksCube(cube);
	}
	
	//Checks to see if the Rubik's Cube is solved.
	public static boolean checkIfCubeIsSolved(RubiksCube cube) {
		boolean solved = true;
		
		solved = checkIfSideIsAllTheSameColor(cube.side1);
		if (!solved) {
			return solved;
		}
		
		solved = checkIfSideIsAllTheSameColor(cube.side2);
		if (!solved) {
			return solved;
		}
		solved = checkIfSideIsAllTheSameColor(cube.side3);
		if (!solved) {
			return solved;
		}
		
		solved = checkIfSideIsAllTheSameColor(cube.side4);
		if (!solved) {
			return solved;
		}
		
		solved = checkIfSideIsAllTheSameColor(cube.side5);
		if (!solved) {
			return solved;
		}
		
		solved = checkIfSideIsAllTheSameColor(cube.side6);
		if (!solved) {
			return solved;
		}
		
		return solved;
	}
	
	//Checks to see if a specific side of the Rubik's Cube is all the same color.
	public static boolean checkIfSideIsAllTheSameColor(String[][] cubeSide) {
		boolean sameColor = true;
		String color = cubeSide[0][0];
		
		for (int i = 0; i < cubeSide[0].length; i++) {
			for (int j = 0; j < cubeSide[1].length; j++) {
				if (cubeSide[i][j] != color) {
					return false;
				}
			}
		}
		
		return sameColor;
	}
	
	//Prints the Rubik's Cube to the screen.
	public static void printRubiksCube(RubiksCube cube) {
		System.out.println("Side 1");
		printCubeSide(cube.side1);
		System.out.println("Side 2");
		printCubeSide(cube.side2);
		System.out.println("Side 3");
		printCubeSide(cube.side3);
		System.out.println("Side 4");
		printCubeSide(cube.side4);
		System.out.println("Side 5");
		printCubeSide(cube.side5);
		System.out.println("Side 6");
		printCubeSide(cube.side6);
		
	}
	
	//Prints a specific side of the Rubik's Cube.
	public static void printCubeSide(String[][] cubeSide) {
			
		for (int i = 0; i < cubeSide[0].length; i++) {
			for (int j = 0; j < cubeSide[1].length; j++) {
					System.out.printf("%2s ", cubeSide[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	}
	
	//Copies a Rubik's Cube and returns the newly copied cube.
	public static RubiksCube rubiksCubeCopy(RubiksCube cube) {
		
		RubiksCube cubeNew = new RubiksCube();
		
		cubeNew.side1 = copyCubeSide(cube.side1);
		cubeNew.side2 = copyCubeSide(cube.side2);
		cubeNew.side3 = copyCubeSide(cube.side3);
		cubeNew.side4 = copyCubeSide(cube.side4);
		cubeNew.side5 = copyCubeSide(cube.side5);
		cubeNew.side6 = copyCubeSide(cube.side6);
		
		return cubeNew;
		
	}
	
	//Copies a specific side of a Rubik's cube and returns the newly copied side.
	public static String[][] copyCubeSide(String[][] side){
		
		String[][] copiedSide = new String[3][3];
		
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				copiedSide[i][j] = side [i][j];
			}
		}
		
		return copiedSide;
		
	}
	
}
