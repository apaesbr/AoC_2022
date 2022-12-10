package aoc2022.Day5;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Puzzle2 {
	
	public static void main(String[] args) {
		try {			
			int numberOfCrates = 0, sourceStack = 0, targetStack = 0;
			
			Deque<Character> stack1 = new ArrayDeque<>();
			stack1.offerFirst('V');
			stack1.offerFirst('Q');
			stack1.offerFirst('W');
			stack1.offerFirst('M');
			stack1.offerFirst('B');
			stack1.offerFirst('N');
			stack1.offerFirst('Z');
			stack1.offerFirst('C');
			
			Deque<Character> stack2 = new ArrayDeque<>();
			stack2.offerFirst('B');
			stack2.offerFirst('C');
			stack2.offerFirst('W');
			stack2.offerFirst('R');
			stack2.offerFirst('Z');
			stack2.offerFirst('H');
			
			Deque<Character> stack3 = new ArrayDeque<>();
			stack3.offerFirst('J');
			stack3.offerFirst('R');
			stack3.offerFirst('Q');
			stack3.offerFirst('F');
			
			Deque<Character> stack4 = new ArrayDeque<>();
			stack4.offerFirst('T');
			stack4.offerFirst('M');
			stack4.offerFirst('N');
			stack4.offerFirst('F');
			stack4.offerFirst('H');
			stack4.offerFirst('W');
			stack4.offerFirst('S');
			stack4.offerFirst('Z');
			
			Deque<Character> stack5 = new ArrayDeque<>();
			stack5.offerFirst('P');
			stack5.offerFirst('Q');
			stack5.offerFirst('N');
			stack5.offerFirst('L');
			stack5.offerFirst('W');
			stack5.offerFirst('F');
			stack5.offerFirst('G');
			
			Deque<Character> stack6 = new ArrayDeque<>();
			stack6.offerFirst('W');
			stack6.offerFirst('P');
			stack6.offerFirst('L');
			
			Deque<Character> stack7 = new ArrayDeque<>();
			stack7.offerFirst('J');
			stack7.offerFirst('Q');
			stack7.offerFirst('C');
			stack7.offerFirst('G');
			stack7.offerFirst('R');
			stack7.offerFirst('D');
			stack7.offerFirst('B');
			stack7.offerFirst('V');
			
			Deque<Character> stack8 = new ArrayDeque<>();
			stack8.offerFirst('W');
			stack8.offerFirst('B');
			stack8.offerFirst('N');
			stack8.offerFirst('Q');
			stack8.offerFirst('Z');
			
			Deque<Character> stack9 = new ArrayDeque<>();
			stack9.offerFirst('J');
			stack9.offerFirst('T');
			stack9.offerFirst('G');
			stack9.offerFirst('C');
			stack9.offerFirst('F');
			stack9.offerFirst('L');
			stack9.offerFirst('H');
//			
//			System.out.println(stack1);
//			System.out.println(stack2);
//			System.out.println(stack3);
//			System.out.println(stack4);
//			System.out.println(stack5);
//			System.out.println(stack6);
//			System.out.println(stack7);
//			System.out.println(stack8);
//			System.out.println(stack9);
//			System.out.println();
			
			Deque<Character> stack = new ArrayDeque<>();			
			
			File myObj = new File("input.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();				
				String strLine[] = data.split(" ");
				if (strLine[0].equalsIgnoreCase("move")) {
					numberOfCrates = Integer.parseInt(strLine[1]);
					sourceStack = Integer.parseInt(strLine[3]);
					targetStack = Integer.parseInt(strLine[5]);
					
					if (sourceStack == 1 && targetStack == 2) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack1.isEmpty()) {
								stack.offerLast(stack1.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack2.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 1 && targetStack == 3) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack1.isEmpty()) {
								stack.offerLast(stack1.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack3.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 1 && targetStack == 4) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack1.isEmpty()) {
								stack.offerLast(stack1.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack4.offerLast(stack.pollLast());
							}
						}
					}  else if (sourceStack == 1 && targetStack == 5) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack1.isEmpty()) {
								stack.offerLast(stack1.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack5.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 1 && targetStack == 6) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack1.isEmpty()) {
								stack.offerLast(stack1.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack6.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 1 && targetStack == 7) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack1.isEmpty()) {
								stack.offerLast(stack1.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack7.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 1 && targetStack == 8) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack1.isEmpty()) {
								stack.offerLast(stack1.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack8.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 1 && targetStack == 9) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack1.isEmpty()) {
								stack.offerLast(stack1.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack9.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 2 && targetStack == 1) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack2.isEmpty()) {
								stack.offerLast(stack2.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack1.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 2 && targetStack == 3) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack2.isEmpty()) {
								stack.offerLast(stack2.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack3.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 2 && targetStack == 4) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack2.isEmpty()) {
								stack.offerLast(stack2.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack4.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 2 && targetStack == 5) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack2.isEmpty()) {
								stack.offerLast(stack2.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack5.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 2 && targetStack == 6) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack2.isEmpty()) {
								stack.offerLast(stack2.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack6.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 2 && targetStack == 7) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack2.isEmpty()) {
								stack.offerLast(stack2.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack7.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 2 && targetStack == 8) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack2.isEmpty()) {
								stack.offerLast(stack2.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack8.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 2 && targetStack == 9) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack2.isEmpty()) {
								stack.offerLast(stack2.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack9.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 3 && targetStack == 1) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack3.isEmpty()) {
								stack.offerLast(stack3.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack1.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 3 && targetStack == 2) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack3.isEmpty()) {
								stack.offerLast(stack3.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack2.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 3 && targetStack == 4) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack3.isEmpty()) {
								stack.offerLast(stack3.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack4.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 3 && targetStack == 5) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack3.isEmpty()) {
								stack.offerLast(stack3.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack5.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 3 && targetStack == 6) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack3.isEmpty()) {
								stack.offerLast(stack3.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack6.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 3 && targetStack == 7) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack3.isEmpty()) {
								stack.offerLast(stack3.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack7.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 3 && targetStack == 8) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack3.isEmpty()) {
								stack.offerLast(stack3.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack8.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 3 && targetStack == 9) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack3.isEmpty()) {
								stack.offerLast(stack3.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack9.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 4 && targetStack == 1) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack4.isEmpty()) {
								stack.offerLast(stack4.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack1.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 4 && targetStack == 2) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack4.isEmpty()) {
								stack.offerLast(stack4.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack2.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 4 && targetStack == 3) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack4.isEmpty()) {
								stack.offerLast(stack4.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack3.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 4 && targetStack == 5) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack4.isEmpty()) {
								stack.offerLast(stack4.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack5.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 4 && targetStack == 6) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack4.isEmpty()) {
								stack.offerLast(stack4.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack6.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 4 && targetStack == 7) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack4.isEmpty()) {
								stack.offerLast(stack4.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack7.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 4 && targetStack == 8) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack4.isEmpty()) {
								stack.offerLast(stack4.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack8.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 4 && targetStack == 9) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack4.isEmpty()) {
								stack.offerLast(stack4.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack9.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 5 && targetStack == 1) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack5.isEmpty()) {
								stack.offerLast(stack5.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack1.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 5 && targetStack == 2) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack5.isEmpty()) {
								stack.offerLast(stack5.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack2.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 5 && targetStack == 3) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack5.isEmpty()) {
								stack.offerLast(stack5.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack3.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 5 && targetStack == 4) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack5.isEmpty()) {
								stack.offerLast(stack5.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack4.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 5 && targetStack == 6) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack5.isEmpty()) {
								stack.offerLast(stack5.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack6.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 5 && targetStack == 7) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack5.isEmpty()) {
								stack.offerLast(stack5.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack7.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 5 && targetStack == 8) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack5.isEmpty()) {
								stack.offerLast(stack5.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack8.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 5 && targetStack == 9) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack5.isEmpty()) {
								stack.offerLast(stack5.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack9.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 6 && targetStack == 1) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack6.isEmpty()) {
								stack.offerLast(stack6.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack1.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 6 && targetStack == 2) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack6.isEmpty()) {
								stack.offerLast(stack6.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack2.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 6 && targetStack == 3) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack6.isEmpty()) {
								stack.offerLast(stack6.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack3.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 6 && targetStack == 4) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack6.isEmpty()) {
								stack.offerLast(stack6.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack4.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 6 && targetStack == 5) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack6.isEmpty()) {
								stack.offerLast(stack6.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack5.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 6 && targetStack == 7) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack6.isEmpty()) {
								stack.offerLast(stack6.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack7.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 6 && targetStack == 8) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack6.isEmpty()) {
								stack.offerLast(stack6.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack8.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 6 && targetStack == 9) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack6.isEmpty()) {
								stack.offerLast(stack6.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack9.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 7 && targetStack == 1) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack7.isEmpty()) {
								stack.offerLast(stack7.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack1.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 7 && targetStack == 2) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack7.isEmpty()) {
								stack.offerLast(stack7.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack2.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 7 && targetStack == 3) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack7.isEmpty()) {
								stack.offerLast(stack7.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack3.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 7 && targetStack == 4) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack7.isEmpty()) {
								stack.offerLast(stack7.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack4.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 7 && targetStack == 5) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack7.isEmpty()) {
								stack.offerLast(stack7.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack5.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 7 && targetStack == 6) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack7.isEmpty()) {
								stack.offerLast(stack7.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack6.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 7 && targetStack == 8) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack7.isEmpty()) {
								stack.offerLast(stack7.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack8.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 7 && targetStack == 9) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack7.isEmpty()) {
								stack.offerLast(stack7.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack9.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 8 && targetStack == 1) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack8.isEmpty()) {
								stack.offerLast(stack8.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack1.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 8 && targetStack == 2) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack8.isEmpty()) {
								stack.offerLast(stack8.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack2.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 8 && targetStack == 3) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack8.isEmpty()) {
								stack.offerLast(stack8.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack3.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 8 && targetStack == 4) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack8.isEmpty()) {
								stack.offerLast(stack8.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack4.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 8 && targetStack == 5) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack8.isEmpty()) {
								stack.offerLast(stack8.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack5.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 8 && targetStack == 6) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack8.isEmpty()) {
								stack.offerLast(stack8.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack6.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 8 && targetStack == 7) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack8.isEmpty()) {
								stack.offerLast(stack8.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack7.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 8 && targetStack == 9) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack8.isEmpty()) {
								stack.offerLast(stack8.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack9.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 9 && targetStack == 1) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack9.isEmpty()) {
								stack.offerLast(stack9.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack1.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 9 && targetStack == 2) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack9.isEmpty()) {
								stack.offerLast(stack9.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack2.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 9 && targetStack == 3) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack9.isEmpty()) {
								stack.offerLast(stack9.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack3.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 9 && targetStack == 4) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack9.isEmpty()) {
								stack.offerLast(stack9.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack4.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 9 && targetStack == 5) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack9.isEmpty()) {
								stack.offerLast(stack9.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack5.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 9 && targetStack == 6) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack9.isEmpty()) {
								stack.offerLast(stack9.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack6.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 9 && targetStack == 7) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack9.isEmpty()) {
								stack.offerLast(stack9.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack7.offerLast(stack.pollLast());
							}
						}
					} else if (sourceStack == 9 && targetStack == 8) {
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack9.isEmpty()) {
								stack.offerLast(stack9.pollLast());
							}
						}
						for (int i=0; i<numberOfCrates; i++) {
							if (!stack.isEmpty()) {
								stack8.offerLast(stack.pollLast());
							}
						}
					}
				} else {
					continue;
				}
			}
//			System.out.println(stack1);
//			System.out.println(stack2);
//			System.out.println(stack3);
//			System.out.println(stack4);
//			System.out.println(stack5);
//			System.out.println(stack6);
//			System.out.println(stack7);
//			System.out.println(stack8);
//			System.out.println(stack9);
//			System.out.println();
			
			System.out.print(stack1.pollLast());
			System.out.print(stack2.pollLast());
			System.out.print(stack3.pollLast());
			System.out.print(stack4.pollLast());
			System.out.print(stack5.pollLast());
			System.out.print(stack6.pollLast());
			System.out.print(stack7.pollLast());
			System.out.print(stack8.pollLast());
			System.out.print(stack9.pollLast());

			myReader.close();
		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.getMessage();
		}
	}

}
