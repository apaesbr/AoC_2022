package aoc2022.Day4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Puzzle1 {
	
	public static void main(String[] args) {
		try {
			int fullyOvercomedPairs = 0;
			
			File myObj = new File("input.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String strLine[] = data.split(",");
				String elf1 = strLine[0];
				String elf2 = strLine[1];
				
				String elf1Assignment[] = elf1.split("-");
				int elf1Start = Integer.parseInt(elf1Assignment[0]);
				int elf1Finish = Integer.parseInt(elf1Assignment[1]);
				
				String elf2Assignment[] = elf2.split("-");
				int elf2Start = Integer.parseInt(elf2Assignment[0]);
				int elf2Finish = Integer.parseInt(elf2Assignment[1]);
				
				if (elf1Start >= elf2Start && elf1Finish <= elf2Finish ||
						elf2Start >= elf1Start && elf2Finish <= elf1Finish) {
					fullyOvercomedPairs ++;
				}
			}
			System.out.println("fullyOvercomedPairs: " + fullyOvercomedPairs);
			myReader.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.getMessage();
		}
	}

}
