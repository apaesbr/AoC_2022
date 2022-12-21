package aoc2022.Day6;

import java.io.File;
import java.util.Scanner;

public class Puzzle1 {
	
	public static void main(String[] args) {
		
		String pos[] = new String[4];		
		Boolean igual0 = false;
		Boolean igual1 = false;
		Boolean igual2 = false;
		Boolean igual3 = false;
		int i = 0;
		
		try {
			File myObj = new File("sample.txt");
			Scanner myReader = new Scanner(myObj);
			
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();

				pos[0] = Character.toString(data.charAt(0));
				pos[1] = Character.toString(data.charAt(1));
				pos[2] = Character.toString(data.charAt(2));
				pos[3] = Character.toString(data.charAt(3));
				
				if (pos[0].equals(pos[1])) {
					igual0 = true;
					igual1 = true;
				}
				if (pos[0].equals(pos[2])) {
					igual0 = true;
					igual2 = true;
				}
				if (pos[0].equals(pos[3])) {
					igual0 = true;
					igual3 = true;
				}
				if (pos[1].equals(pos[2])) {
					igual1 = true;
					igual2 = true;
				}
				if (pos[1].equals(pos[3])) {
					igual1 = true;
					igual3 = true;
				}
				if (pos[2].equals(pos[3])) {
					igual2 = true;
					igual3 = true;
				}
//				System.out.println("pos: " + pos[0] + pos[1] + pos[2] + pos[3] + ": " + igual0 + "," + igual1 + "," + igual2 + "," + igual3);
				
				if (igual0 == false && igual1 == false && igual2 == false && igual3 == false) {
					System.out.println("pos: " + (i+1));
					i = data.length();
				} else {
					for (i = 4; i < data.length(); i++) {
						igual0 = false;
						igual1 = false;
						igual2 = false;
						igual3 = false;
						
						pos[0] = pos[1];
						pos[1] = pos[2];
						pos[2] = pos[3];
						pos[3] = Character.toString(data.charAt(i));
						
						
						if (pos[0].equals(pos[1])) {
							igual0 = true;
							igual1 = true;
						}
						if (pos[0].equals(pos[2])) {
							igual0 = true;
							igual2 = true;
						}
						if (pos[0].equals(pos[3])) {
							igual0 = true;
							igual3 = true;
						}
						if (pos[1].equals(pos[2])) {
							igual1 = true;
							igual2 = true;
						}
						if (pos[1].equals(pos[3])) {
							igual1 = true;
							igual3 = true;
						}
						if (pos[2].equals(pos[3])) {
							igual2 = true;
							igual3 = true;
						}

						if (igual0 == false && igual1 == false && igual2 == false && igual3 == false) {
							System.out.println("pos: " + (i+1));
							i = data.length();
						}
//						System.out.println("pos: " + pos[0] + pos[1] + pos[2] + pos[3] + ": " + igual0 + "," + igual1 + "," + igual2 + "," + igual3);
					}
				}
			}
			myReader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
