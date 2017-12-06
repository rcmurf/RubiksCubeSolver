
public class RubiksSolver {
	public static void main(String[] args) {
		
		RubiksCube cube = RubiksCubeStandardOps.initializeCube();

		if (RubiksCubeStandardOps.checkIfCubeIsSolved(cube)){
			System.out.println("The Rubik's Cube is solved!");
			System.out.println("Here is the solved cube:\n\n");
			RubiksCubeStandardOps.printRubiksCube(cube);
		} else {
			RubiksCubeStandardOps.solveRubiksCube(cube);
		}
	}	
}
