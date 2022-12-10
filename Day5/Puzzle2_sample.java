package aoc2022.Day5;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Puzzle2_sample {
	
	public static void main(String[] args) {
		try {			
			int numberOfCrates = 0, sourceStack = 0, targetStack = 0;
//			int counter = 1;
			
			Deque<Character> stack1 = new ArrayDeque<>();
			Deque<Character> stack2 = new ArrayDeque<>();
			Deque<Character> stack3 = new ArrayDeque<>();
			Deque<Character> stack = new ArrayDeque<>();
			
			stack1.offerFirst('N');
			stack1.offerFirst('Z');
			
			stack2.offerFirst('D');
			stack2.offerFirst('C');
			stack2.offerFirst('M');
			
			stack3.offerFirst('P');
			
			System.out.println(stack1);
			System.out.println(stack2);
			System.out.println(stack3);
			System.out.println();
			
			File myObj = new File("sample.txt");
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
//						System.out.println(stack1);
//						System.out.println(stack2);
//						System.out.println(stack3);
//						System.out.println();
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
//						System.out.println(stack1);
//						System.out.println(stack2);
//						System.out.println(stack3);
//						System.out.println();
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
//						System.out.println(stack1);
//						System.out.println(stack2);
//						System.out.println(stack3);
//						System.out.println();
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
//						System.out.println(stack1);
//						System.out.println(stack2);
//						System.out.println(stack3);
//						System.out.println();
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
//						System.out.println(stack1);
//						System.out.println(stack2);
//						System.out.println(stack3);
//						System.out.println();
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
//						System.out.println(stack1);
//						System.out.println(stack2);
//						System.out.println(stack3);
//						System.out.println();
					}
				} else {
					continue;
				}
			}
			System.out.println(stack1);
			System.out.println(stack2);
			System.out.println(stack3);
			System.out.println();
			
			System.out.print(stack1.pollLast());
			System.out.print(stack2.pollLast());
			System.out.print(stack3.pollLast());
			
			myReader.close();
		} catch (Exception e) {
			System.out.println("An error occurred.");
//			System.out.println(e);
//			e.getStackTrace();
			e.getMessage();
		}
	}

}
