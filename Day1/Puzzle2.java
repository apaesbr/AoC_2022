package aoc2022.day1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Puzzle2 {
	public static void main(String[] args) {		
		try {
			
			int valor = 0;
			int x = 0, a = 0, b = 0, c = 0;
			
			File myObj = new File("input.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				if (data.isEmpty()) {
					System.out.println("    x: " + x);
					System.out.println("taman: " + data.length());
					if (x > a) {
						c = b;
						b = a;
						a = x;
					} else if (x > b) {
						c = b;
						b = x;
					} else if (x > c) {
						c = x;
					}
					x = 0;
				} else {
					valor = Integer.parseInt(data);
					x += valor;
				}
			}
			// uncomment here if you remove the last empty line
//			if (x > a) {
//				c = b;
//				b = a;
//				a = x;
//			} else if (x > b) {
//				c = b;
//				b = x;
//			} else if (x > c) {
//				c = x;
//			}

			System.out.println(a + b + c);
			myReader.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.getMessage();
		}
	}
}
