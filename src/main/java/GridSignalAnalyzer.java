public class GridSignalAnalyzer {

	//	--	PHASE 1: Initial Recon (The Data Grid)
	// Mission Data: The Scrambled Communications Grid
	static char[][] scrambledGrid = {
			{'C', 'H', 'A', 'R', 'L', 'I', 'E'},
			{'A', 'L', 'P', 'H', 'A'},
			{'T', 'A', 'N', 'G', 'O', '7'},
			{'B', 'R', 'A', 'V', 'O'}
	};

	public static void main(String[] args) {

		GridSignalAnalyzer analyzer = new GridSignalAnalyzer();

		System.out.println("--- PHASE 2: STANDARD FOR-LOOP MANEUVER ---");
		analyzer.analyzeWithForLoop(scrambledGrid);

		System.out.println("--- PHASE 3: ADVANCED FOR-EACH SWEEP ---");
		analyzer.analyzeWithForEachLoop(scrambledGrid);

		System.out.println("--- PHASE 4: HYBRID LOOP APPROACH ---");
		analyzer.analyzeWithHybridLoop(scrambledGrid);
	}

	//	--	PHASE 2: The Standard Maneuver (Nested For-Loop)
	void analyzeWithForLoop(char[][] grid) {
		for (int row=0; row<grid.length; row++) {
			for (int col=0; col<grid[row].length; col++) {
				System.out.print(grid[row][col] + " ");
			}
			System.out.println();
		}
	}

	//	--	PHASE 3: The Advanced Sweep (Nested For-Each Loop with Hash Code Analysis)
	void analyzeWithForEachLoop(char[][] grid) {
		for (char[] rowArray: grid) {
			System.out.println("Processing Row with Hash: " + rowArray);
			for(char col: rowArray) {
				System.out.println("-> " + col);
			}
		}
	}

	//	--	PHASE 4: The Hybrid Approach (Combined For-Each and For Loop)
	void analyzeWithHybridLoop(char[][] grid) {
		for (char[] rowArray: grid) {
			for (int col=0; col<rowArray.length; col++) {
				System.out.print(rowArray[col] + " ");
			}
			System.out.println();
		}
	}

}