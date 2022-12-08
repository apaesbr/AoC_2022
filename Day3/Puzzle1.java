package aoc2022.day3;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Puzzle1 {
	
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
				String data = myReader.nextLine();
				String s1 = data.substring(0, data.length()/2);
				String s2 = data.substring((data.length()/2), data.length());

				for (int j=0; j<s2.length(); j++) {
					Character c2 = s2.charAt(j);
					for (int i=0; i<s1.length(); i++) {
						Character c1 = s1.charAt(i);
						if (c1 == c2) {
							if (j <= s2.indexOf(c1) && i <= s1.indexOf(c1)) {
								score += alphaMap.get(c1);
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
