package aoc2022.Day6;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Puzzle2 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> oneChars = new HashMap<>();
		Map<Integer, Boolean> validations = new HashMap<>();

		int i = 0;
		Boolean stopLoopFor = false;
		String extractedChar = null;
		int arraySize = 14;
		
		try {
			File myObj = new File("sample.txt");
			Scanner myReader = new Scanner(myObj);
			
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				for (i = 0; i < data.length() && !stopLoopFor; i++ ) {
					extractedChar = Character.toString(data.charAt(i));
					if (i < arraySize) {
						if (i == 0) {
							oneChars.put(i, extractedChar);
							validations.put(i, false);
						} else {
							if (oneChars.containsValue(extractedChar)) {
								oneChars.put(i, extractedChar);
								validations.put(i, true);
							} else {
								oneChars.put(i, extractedChar);
								validations.put(i, false);
							}
						}
					} else {
						oneChars.remove(0);
						validations.remove(0);
						for (int j = 0; j < (arraySize-1); j++) {
							oneChars.put(j, oneChars.get((j+1)));
							validations.put(j, validations.get((j+1)));
						}
						
						if (oneChars.containsValue(extractedChar)) {
							oneChars.put((arraySize-1), extractedChar);
							validations.put((arraySize-1), true);
						} else {
							oneChars.put((arraySize-1), extractedChar);
							validations.put((arraySize-1), false);
						}
						
						for (int h = 0; h < arraySize; h++) {
							if (Collections.frequency(oneChars.values(), oneChars.get(h))>1) {
								validations.put(h, true);
							} else {
								validations.put(h, false);
							}
						}
						
						if (validations.containsValue(true)) {
							stopLoopFor = false;
						} else {
							stopLoopFor = true;
							System.out.println("pos: " + (i+1));
						}
					}
				}
				stopLoopFor = false;
			}
			myReader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
