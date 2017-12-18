
public class RubiksCubeSolvingAlgorithms {
	
	public static RubiksCube runSolvingAlgorithm(RubiksCube cube){
		
		RubiksCube cubeNew = new RubiksCube();
		cubeNew = RubiksCubeStandardOps.rubiksCubeCopy(cube);
		
		int algorithmOneCount = 0;
		int algorithmTwoCount = 0;
		//int count = 0;
		
		cubeNew = startAlgorithmOne(cubeNew);
		algorithmOneCount++;
		
		RubiksCubeStandardOps.printRubiksCube(cubeNew);
		System.out.println("-----------------------------------------");
		
		cubeNew = startAlgorithmOne(cubeNew);
		algorithmOneCount++;
		
		RubiksCubeStandardOps.printRubiksCube(cubeNew);
		System.out.println("-----------------------------------------");
		
		/*while (!RubiksCubeStandardOps.checkIfCubeIsSolved(cubeNew) && !RubiksCubeStandardOps.checkIfCubesAreEqual(cube, cubeNew) && count <= 1000) {
			
			count++;
			System.out.println(count);
			cubeNew = startAlgorithmOne(cubeNew);
			algorithmOneCount++;
			
			while(!RubiksCubeStandardOps.checkIfCubeIsSolved(cubeNew) && !RubiksCubeStandardOps.checkIfCubesAreEqual(cube, cubeNew)) {
				cubeNew = startAlgorithmOne(cubeNew);
				algorithmOneCount++;
			}
			
			if (!RubiksCubeStandardOps.checkIfCubeIsSolved(cubeNew)) {
				cubeNew = startAlgorithmTwo(cubeNew);
				algorithmTwoCount++;
			}
			
		}*/
		
		System.out.printf("The first algorithm ran %d times! \n", algorithmOneCount);
		System.out.printf("The second algorithm ran %d times! \n", algorithmTwoCount);
	
		
		if (RubiksCubeStandardOps.checkIfCubesAreEqual(cube, cubeNew)) {
			System.out.println("\nBoth cubes are equal and the algorithm is insufficient alone!");
		}
		
		
		return cubeNew;
	}

	public static RubiksCube startAlgorithmOne(RubiksCube cube) {
		
		RubiksCube cubeNew = RubiksCubeStandardOps.rubiksCubeCopy(cube);
		
		//Rotate left column forward twice
		if(RubiksCubeStandardOps.checkIfCubeIsSolved(cubeNew)) {
			return cubeNew;
		}else {
			cubeNew = PuzzleRotations.rotateLeftColumnForwardOnce(cubeNew);
		}
		
		if(RubiksCubeStandardOps.checkIfCubeIsSolved(cubeNew)) {
			return cubeNew;
		}else {
			cubeNew = PuzzleRotations.rotateLeftColumnForwardOnce(cubeNew);
		}
		
		
		//Rotate right column forward twice
		if(RubiksCubeStandardOps.checkIfCubeIsSolved(cubeNew)) {
			return cubeNew;
		}else {
			cubeNew = PuzzleRotations.rotateRightColumnForwardOnce(cubeNew);
		}
		
		if(RubiksCubeStandardOps.checkIfCubeIsSolved(cubeNew)) {
			return cubeNew;
		}else {
			cubeNew = PuzzleRotations.rotateRightColumnForwardOnce(cubeNew);
		}
		
		
		//Rotate bottom row clockwise twice
		if(RubiksCubeStandardOps.checkIfCubeIsSolved(cubeNew)) {
			return cubeNew;
		}else {
			cubeNew = PuzzleRotations.rotateBottomRowClockwiseOnce(cubeNew);
		}
		
		if(RubiksCubeStandardOps.checkIfCubeIsSolved(cubeNew)) {
			return cubeNew;
		}else {
			cubeNew = PuzzleRotations.rotateBottomRowClockwiseOnce(cubeNew);
		}
		
		
		//Rotate left column backward twice
		if(RubiksCubeStandardOps.checkIfCubeIsSolved(cubeNew)) {
			return cubeNew;
		}else {
			cubeNew = PuzzleRotations.rotateLeftColumnBackwardOnce(cubeNew);
		}
		
		if(RubiksCubeStandardOps.checkIfCubeIsSolved(cubeNew)) {
			return cubeNew;
		}else {
			cubeNew = PuzzleRotations.rotateLeftColumnBackwardOnce(cubeNew);
		}
		
		
		//Rotate right column backward twice
		if(RubiksCubeStandardOps.checkIfCubeIsSolved(cubeNew)) {
			return cubeNew;
		}else {
			cubeNew = PuzzleRotations.rotateRightColumnBackwardOnce(cubeNew);
		}
		
		if(RubiksCubeStandardOps.checkIfCubeIsSolved(cubeNew)) {
			return cubeNew;
		}else {
			cubeNew = PuzzleRotations.rotateRightColumnBackwardOnce(cubeNew);
		}
		
		return cubeNew;
		
	}
	
	public static RubiksCube startAlgorithmTwo(RubiksCube cube) {
		
		RubiksCube cubeNew = RubiksCubeStandardOps.rubiksCubeCopy(cube);
		
		//Rotate bottom row counter-clockwise once
		if(RubiksCubeStandardOps.checkIfCubeIsSolved(cubeNew)) {
			return cubeNew;
		}else {
			cubeNew = PuzzleRotations.rotateBottomRowCounterClockwiseOnce(cubeNew);
		}
		
		return cubeNew;
		
	}
}
