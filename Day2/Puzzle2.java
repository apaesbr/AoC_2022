package aoc2022.day2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Puzzle2 {
	
	/*
	 * Opponent		You			Result		Score
	 * --------------------------------------------
	 * A			Y (2)		Won (6)		2+6=8
	 * B			X (1)		Loose (0)	1+0=1
	 * C			Z (3)		Draw (3)	3+3=6
	 * 
	 * A, X = Rock = score value = 1
	 * B, Y = Paper = score value = 2
	 * C, Z = Scissors = score value = 3
	 * 
	 * X means you need to lose
	 * Y means you need to end the round in a draw and
	 * Z means you need to win
	 * 
	 * Your score for match:
	 * (L)ost: 0
	 * (D)raw: 3
	 *  (W)on: 6
	 */
	public static void main(String[] args) {
		
		try {
			int score = 0;
			
			Map<String, Integer> you = new HashMap<>();
			you.put("X", 1);
			you.put("Y", 2);
			you.put("Z", 3);
			
			File myObj = new File("input.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String strLine[] = data.split(" ");
				String opponent = strLine[0];
				String myself = strLine[1];
				
				if (myself.equalsIgnoreCase("X")) {
					// X means you need to lose
					if (opponent.equalsIgnoreCase("A")) {			// Rock
						myself = "Z";
					} else if (opponent.equalsIgnoreCase("B")) {	// Paper
						myself = "X";
					} else if (opponent.equalsIgnoreCase("C")) {	// Scissors
						myself = "Y";
					}
				} else if (myself.equalsIgnoreCase("Y")) {
					// Y means you need to draw
					if (opponent.equalsIgnoreCase("A")) {			// Rock
						myself = "X";
					} else if (opponent.equalsIgnoreCase("B")) {	// Paper
						myself = "Y";
					} else if (opponent.equalsIgnoreCase("C")) {	// Scissors
						myself = "Z";
					}					
				} else if (myself.equalsIgnoreCase("Z")) {
					// Z means you need to win
					if (opponent.equalsIgnoreCase("A")) {			// Rock
						myself = "Y";
					} else if (opponent.equalsIgnoreCase("B")) {	// Paper
						myself = "Z";
					} else if (opponent.equalsIgnoreCase("C")) {	// Scissors
						myself = "X";
					}					
				}
				
				if ((opponent.equalsIgnoreCase("A") && myself.equalsIgnoreCase("X")) ||
						(opponent.equalsIgnoreCase("B") && myself.equalsIgnoreCase("Y")) ||
						(opponent.equalsIgnoreCase("C") && myself.equalsIgnoreCase("Z"))) {
					// draw
//					System.out.println(" Draw: " + myself + ": " + you.get(myself) + " + 3");
					score += 3 + you.get(myself);
				} else if ((opponent.equalsIgnoreCase("B") && myself.equalsIgnoreCase("Z")) ||
						(opponent.equalsIgnoreCase("C") && myself.equalsIgnoreCase("X")) ||
						(opponent.equalsIgnoreCase("A") && myself.equalsIgnoreCase("Y"))) {
					// won
//					System.out.println("  Won: " + myself + ": " + you.get(myself) + " + 6");
					score += 6 + you.get(myself);
				} else {
					// Loose
//					System.out.println("Loose: " + myself + ": " + you.get(myself) + " + 0");
					score += you.get(myself);
				}
			}
			System.out.println("Score: " + score);
			myReader.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.getMessage();
		}
	}

}
