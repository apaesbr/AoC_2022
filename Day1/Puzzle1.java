package aoc2022.day1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Puzzle1 {
	public static void main(String[] args) {		
		try {
			
			int x = 0, y = 0, elf = 0, winner = 0;
			File myObj = new File("input.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				if (data.length() >= 1) {
					int valor = Integer.parseInt(data);
					x += valor;
				} else {
					elf++;
					if (x > y) {						
						y = x;
						winner = elf;
					}
					x = 0;
				}
			}
			System.out.println("Number of elfs: " + elf);
			System.out.println("Winner elfs: " + winner);
			System.out.println("Elf Callories: " + y);
			myReader.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.getMessage();
		}
	}
}
