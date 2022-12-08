package aoc2022.day3;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Puzzle2 {
	
	public static void main(String[] args) {
		try {
			
			Map<Character, Integer> alphaMap = new HashMap<>();

			alphaMap.put('a',1);
			alphaMap.put('b',2);
			alphaMap.put('c',3);
			alphaMap.put('d',4);
			alphaMap.put('e',5);
			alphaMap.put('f',6);
			alphaMap.put('g',7);
			alphaMap.put('h',8);
			alphaMap.put('i',9);
			alphaMap.put('j',10);
			alphaMap.put('k',11);
			alphaMap.put('l',12);
			alphaMap.put('m',13);
			alphaMap.put('n',14);
			alphaMap.put('o',15);
			alphaMap.put('p',16);
			alphaMap.put('q',17);
			alphaMap.put('r',18);
			alphaMap.put('s',19);
			alphaMap.put('t',20);
			alphaMap.put('u',21);
			alphaMap.put('v',22);
			alphaMap.put('w',23);
			alphaMap.put('x',24);
			alphaMap.put('y',25);
			alphaMap.put('z',26);
			alphaMap.put('A',27);
			alphaMap.put('B',28);
			alphaMap.put('C',29);
			alphaMap.put('D',30);
			alphaMap.put('E',31);
			alphaMap.put('F',32);
			alphaMap.put('G',33);
			alphaMap.put('H',34);
			alphaMap.put('I',35);
			alphaMap.put('J',36);
			alphaMap.put('K',37);
			alphaMap.put('L',38);
			alphaMap.put('M',39);
			alphaMap.put('N',40);
			alphaMap.put('O',41);
			alphaMap.put('P',42);
			alphaMap.put('Q',43);
			alphaMap.put('R',44);
			alphaMap.put('S',45);
			alphaMap.put('T',46);
			alphaMap.put('U',47);
			alphaMap.put('V',48);
			alphaMap.put('W',49);
			alphaMap.put('X',50);
			alphaMap.put('Y',51);
			alphaMap.put('Z',52);
			
			int score = 0;
			
			File myObj = new File("input.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String line1 = myReader.nextLine();
				int size1 = line1.length();
				String line2 = myReader.nextLine();
				int size2 = line2.length();
				String line3 = myReader.nextLine();
				int size3 = line3.length();
				
				for (int c=0; c<size3; c++) {					
					for (int b=0; b<size2; b++) {
						for (int a=0; a<size1; a++) {
							Character a1 = line1.charAt(a);
							Character b1 = line2.charAt(b);
							Character c1 = line3.charAt(c);
							if (a1 == b1 && a1 == c1) {
								if (c <= line3.indexOf(c1) && b <= line2.indexOf(b1) && a <= line1.indexOf(a1)) {
									score += alphaMap.get(a1);
								}
							}
						}
					}
				}
			}
			System.out.println("score: " + score);
			myReader.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.getMessage();
		}
	}

}
