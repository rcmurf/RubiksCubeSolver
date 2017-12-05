
public class PuzzleRotations {

	//Rotates the top row of the cube counter-clockwise.
	public static RubiksCube rotateTopRowCounterClockwiseOnce(RubiksCube cube) {
		
		RubiksCube cubeNew = RubiksCubeStandardOps.rubiksCubeCopy(cube);
		
		//rotate side1
		cubeNew.side1[0][0] = cube.side1[0][2];
		cubeNew.side1[0][1] = cube.side1[1][2];
		cubeNew.side1[0][2] = cube.side1[2][2];
		
		cubeNew.side1[1][0] = cube.side1[0][1];
		cubeNew.side1[1][2] = cube.side1[2][1];
		
		cubeNew.side1[2][0] = cube.side1[0][0];
		cubeNew.side1[2][1] = cube.side1[1][0];
		cubeNew.side1[2][2] = cube.side1[2][0];
		
		//rotate side2
		cubeNew.side2[0][0] = cube.side6[0][0];
		cubeNew.side2[0][1] = cube.side6[0][1];
		cubeNew.side2[0][2] = cube.side6[0][2];
		
		//rotate side4
		cubeNew.side4[0][0] = cube.side5[0][0];
		cubeNew.side4[0][1] = cube.side5[0][1];
		cubeNew.side4[0][2] = cube.side5[0][2];
		
		//rotate side5
		cubeNew.side5[0][0] = cube.side2[0][0];
		cubeNew.side5[0][1] = cube.side2[0][1];
		cubeNew.side5[0][2] = cube.side2[0][2];
		
		//rotate side6
		cubeNew.side6[0][0] = cube.side4[0][0];
		cubeNew.side6[0][1] = cube.side4[0][1];
		cubeNew.side6[0][2] = cube.side4[0][2];
		
		
		return cubeNew;
	}
	
	//Rotates the top row of the cube clockwise.
	public static RubiksCube rotateTopRowClockwiseOnce(RubiksCube cube) {
		
		RubiksCube cubeNew = RubiksCubeStandardOps.rubiksCubeCopy(cube);
		
		//rotate side1
		cubeNew.side1[0][0] = cube.side1[2][0];
		cubeNew.side1[0][1] = cube.side1[1][0];
		cubeNew.side1[0][2] = cube.side1[0][0];
		
		cubeNew.side1[1][0] = cube.side1[2][1];
		cubeNew.side1[1][2] = cube.side1[0][1];
		
		cubeNew.side1[2][0] = cube.side1[2][2];
		cubeNew.side1[2][1] = cube.side1[1][2];
		cubeNew.side1[2][2] = cube.side1[0][2];
		
		//rotate side2
		cubeNew.side2[0][0] = cube.side5[0][0];
		cubeNew.side2[0][1] = cube.side5[0][1];
		cubeNew.side2[0][2] = cube.side5[0][2];
		
		//rotate side4
		cubeNew.side4[0][0] = cube.side6[0][0];
		cubeNew.side4[0][1] = cube.side6[0][1];
		cubeNew.side4[0][2] = cube.side6[0][2];
		
		//rotate side5
		cubeNew.side5[0][0] = cube.side4[0][0];
		cubeNew.side5[0][1] = cube.side4[0][1];
		cubeNew.side5[0][2] = cube.side4[0][2];
		
		//rotate side6
		cubeNew.side6[0][0] = cube.side2[0][0];
		cubeNew.side6[0][1] = cube.side2[0][1];
		cubeNew.side6[0][2] = cube.side2[0][2];
		
		
		return cubeNew;
	}
	
	
	//Rotates the middle row of the cube counter-clockwise.
	public static RubiksCube rotateMiddleRowCounterClockwiseOnce(RubiksCube cube) {
		
		RubiksCube cubeNew = RubiksCubeStandardOps.rubiksCubeCopy(cube);
		
		//rotate side2
		cubeNew.side2[1][0] = cube.side6[1][0];
		cubeNew.side2[1][1] = cube.side6[1][1];
		cubeNew.side2[1][2] = cube.side6[1][2];
		
		//rotate side4
		cubeNew.side4[1][0] = cube.side5[1][0];
		cubeNew.side4[1][1] = cube.side5[1][1];
		cubeNew.side4[1][2] = cube.side5[1][2];
		
		//rotate side5
		cubeNew.side5[1][0] = cube.side2[1][0];
		cubeNew.side5[1][1] = cube.side2[1][1];
		cubeNew.side5[1][2] = cube.side2[1][2];
		
		//rotate side6
		cubeNew.side6[1][0] = cube.side4[1][0];
		cubeNew.side6[1][1] = cube.side4[1][1];
		cubeNew.side6[1][2] = cube.side4[1][2];
		
		
		return cubeNew;
	}
	
	//Rotates the middle row of the cube clockwise.
	public static RubiksCube rotateMiddleRowClockwiseOnce(RubiksCube cube) {
			
		RubiksCube cubeNew = RubiksCubeStandardOps.rubiksCubeCopy(cube);
		
		//rotate side2
		cubeNew.side2[1][0] = cube.side5[1][0];
		cubeNew.side2[1][1] = cube.side5[1][1];
		cubeNew.side2[1][2] = cube.side5[1][2];
		
		//rotate side4
		cubeNew.side4[1][0] = cube.side6[1][0];
		cubeNew.side4[1][1] = cube.side6[1][1];
		cubeNew.side4[1][2] = cube.side6[1][2];
		
		//rotate side5
		cubeNew.side5[1][0] = cube.side4[1][0];
		cubeNew.side5[1][1] = cube.side4[1][1];
		cubeNew.side5[1][2] = cube.side4[1][2];
		
		//rotate side6
		cubeNew.side6[1][0] = cube.side2[1][0];
		cubeNew.side6[1][1] = cube.side2[1][1];
		cubeNew.side6[1][2] = cube.side2[1][2];
		
		return cubeNew;
	}
	
	//Rotates the bottom row of the cube counter-clockwise.
	public static RubiksCube rotateBottomRowCounterClockwiseOnce(RubiksCube cube) {
		
		RubiksCube cubeNew = RubiksCubeStandardOps.rubiksCubeCopy(cube);
		
		//rotate side2
		cubeNew.side2[2][0] = cube.side6[2][0];
		cubeNew.side2[2][1] = cube.side6[2][1];
		cubeNew.side2[2][2] = cube.side6[2][2];
		
		//rotate side3
		cubeNew.side3[0][0] = cube.side3[2][0];
		cubeNew.side3[0][1] = cube.side3[1][0];
		cubeNew.side3[0][2] = cube.side3[0][0];
		
		cubeNew.side3[1][0] = cube.side3[2][1];
		cubeNew.side3[1][2] = cube.side3[0][1];
		
		cubeNew.side3[2][0] = cube.side3[2][2];
		cubeNew.side3[2][1] = cube.side3[1][2];
		cubeNew.side3[2][2] = cube.side3[0][2];
	
		//rotate side4
		cubeNew.side4[2][0] = cube.side5[2][0];
		cubeNew.side4[2][1] = cube.side5[2][1];
		cubeNew.side4[2][2] = cube.side5[2][1];
		
		//rotate side5
		cubeNew.side5[2][0] = cube.side2[2][0];
		cubeNew.side5[2][1] = cube.side2[2][1];
		cubeNew.side5[2][2] = cube.side2[2][1];
		
		//rotate side6
		cubeNew.side6[2][0] = cube.side4[2][0];
		cubeNew.side6[2][1] = cube.side4[2][1];
		cubeNew.side6[2][2] = cube.side4[2][1];
		
		return cubeNew;
	}
	
	//Rotates the bottom row of the cube clockwise.
	public static RubiksCube rotateBottomRowClockwiseOnce(RubiksCube cube) {
		
		RubiksCube cubeNew = RubiksCubeStandardOps.rubiksCubeCopy(cube);
		
		//rotate side2
		cubeNew.side2[2][0] = cube.side5[2][0];
		cubeNew.side2[2][1] = cube.side5[2][1];
		cubeNew.side2[2][2] = cube.side5[2][2];
		
		//rotate side3
		cubeNew.side3[0][0] = cube.side3[0][2];
		cubeNew.side3[0][1] = cube.side3[1][2];
		cubeNew.side3[0][2] = cube.side3[2][2];
		
		cubeNew.side3[1][0] = cube.side3[0][1];
		cubeNew.side3[1][2] = cube.side3[2][1];
		
		cubeNew.side3[2][0] = cube.side3[0][0];
		cubeNew.side3[2][1] = cube.side3[1][0];
		cubeNew.side3[2][2] = cube.side3[2][0];
	
		//rotate side4
		cubeNew.side4[2][0] = cube.side6[2][0];
		cubeNew.side4[2][1] = cube.side6[2][1];
		cubeNew.side4[2][2] = cube.side6[2][1];
		
		//rotate side5
		cubeNew.side5[2][0] = cube.side4[2][0];
		cubeNew.side5[2][1] = cube.side4[2][1];
		cubeNew.side5[2][2] = cube.side4[2][1];
		
		//rotate side6
		cubeNew.side6[2][0] = cube.side2[2][0];
		cubeNew.side6[2][1] = cube.side2[2][1];
		cubeNew.side6[2][2] = cube.side2[2][1];
		
		return cubeNew;
	}
}
