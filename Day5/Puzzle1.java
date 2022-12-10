package aoc2022.Day5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Puzzle1 {
	
	public static void main(String[] args) {
		try {			
			int numberOfCrates = 0, sourceStack = 0, targetStack = 0;
			
			Deque<Character> stack1 = new ArrayDeque<>();
			Deque<Character> stack2 = new ArrayDeque<>();
			Deque<Character> stack3 = new ArrayDeque<>();
			Deque<Character> stack4 = new ArrayDeque<>();
			Deque<Character> stack5 = new ArrayDeque<>();
			Deque<Character> stack6 = new ArrayDeque<>();
			Deque<Character> stack7 = new ArrayDeque<>();
			Deque<Character> stack8 = new ArrayDeque<>();
			Deque<Character> stack9 = new ArrayDeque<>();
			
			File myObj = new File("input.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();				
				String strLine[] = data.split(" ");
//				System.out.println("Length: " + data.length());
//				if (data.charAt(0) == '[') {
//				if (!data.isEmpty()) {
					if (strLine[0].length() == 3) {
						if (data.charAt(1) != ' ') {
//							System.out.println(data.charAt(1));
							stack1.offerFirst(data.charAt(1));
						}
						
						if (data.charAt(5) != ' ') {
//							System.out.println(data.charAt(5));
							stack2.offerFirst(data.charAt(5));
						}
						
						if (data.charAt(9) != ' ') {
//							System.out.println(data.charAt(9));
							stack3.offerFirst(data.charAt(9));
						}
						
						if (data.charAt(13) != ' ') {
//							System.out.println(data.charAt(13));
							stack4.offerFirst(data.charAt(13));
						}
						
						if (data.charAt(17) != ' ') {
//							System.out.println(data.charAt(17));
							stack5.offerFirst(data.charAt(17));
						}
						
						if (data.charAt(21) != ' ') {
//							System.out.println(data.charAt(21));
							stack6.offerFirst(data.charAt(21));
						}
						
						if (data.charAt(25) != ' ') {
//							System.out.println(data.charAt(25));
							stack7.offerFirst(data.charAt(25));
						}
						
						if (data.charAt(29) != ' ') {
//							System.out.println(data.charAt(29));
							stack8.offerFirst(data.charAt(29));
						}
						
						if (data.charAt(33) != ' ') {
//							System.out.println(data.charAt(33));
							stack9.offerFirst(data.charAt(33));
						}
						
					} else if (strLine[0].equalsIgnoreCase("move")) {
						numberOfCrates = Integer.parseInt(strLine[1]);
						sourceStack = Integer.parseInt(strLine[3]);
						targetStack = Integer.parseInt(strLine[5]);
						
						for (int i=0; i<numberOfCrates; i++) {
							if (sourceStack == 1 && targetStack == 2) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack2.offerLast(stack1.pollLast());
							} else if (sourceStack == 1 && targetStack == 3) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack3.offerLast(stack1.pollLast());
							} else if (sourceStack == 1 && targetStack == 4) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack4.offerLast(stack1.pollLast());
							}  else if (sourceStack == 1 && targetStack == 5) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack5.offerLast(stack1.pollLast());
							} else if (sourceStack == 1 && targetStack == 6) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack6.offerLast(stack1.pollLast());
							} else if (sourceStack == 1 && targetStack == 7) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack7.offerLast(stack1.pollLast());
							} else if (sourceStack == 1 && targetStack == 8) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack8.offerLast(stack1.pollLast());
							} else if (sourceStack == 1 && targetStack == 9) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack9.offerLast(stack1.pollLast());
							} else if (sourceStack == 2 && targetStack == 1) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack1.offerLast(stack2.pollLast());
							} else if (sourceStack == 2 && targetStack == 3) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack3.offerLast(stack2.pollLast());
							} else if (sourceStack == 2 && targetStack == 4) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack4.offerLast(stack2.pollLast());
							} else if (sourceStack == 2 && targetStack == 5) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack5.offerLast(stack2.pollLast());
							} else if (sourceStack == 2 && targetStack == 6) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack6.offerLast(stack2.pollLast());
							} else if (sourceStack == 2 && targetStack == 7) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack7.offerLast(stack2.pollLast());
							} else if (sourceStack == 2 && targetStack == 8) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack8.offerLast(stack2.pollLast());
							} else if (sourceStack == 2 && targetStack == 9) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack9.offerLast(stack2.pollLast());
							} else if (sourceStack == 3 && targetStack == 1) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack1.offerLast(stack3.pollLast());
							} else if (sourceStack == 3 && targetStack == 2) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack2.offerLast(stack3.pollLast());
							} else if (sourceStack == 3 && targetStack == 4) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack4.offerLast(stack3.pollLast());
							} else if (sourceStack == 3 && targetStack == 5) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack5.offerLast(stack3.pollLast());
							} else if (sourceStack == 3 && targetStack == 6) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack6.offerLast(stack3.pollLast());
							} else if (sourceStack == 3 && targetStack == 7) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack7.offerLast(stack3.pollLast());
							} else if (sourceStack == 3 && targetStack == 8) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack8.offerLast(stack3.pollLast());
							} else if (sourceStack == 3 && targetStack == 9) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack9.offerLast(stack3.pollLast());
							} else if (sourceStack == 4 && targetStack == 1) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack1.offerLast(stack4.pollLast());
							} else if (sourceStack == 4 && targetStack == 2) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack2.offerLast(stack4.pollLast());
							} else if (sourceStack == 4 && targetStack == 3) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack3.offerLast(stack4.pollLast());
							} else if (sourceStack == 4 && targetStack == 5) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack5.offerLast(stack4.pollLast());
							} else if (sourceStack == 4 && targetStack == 6) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack6.offerLast(stack4.pollLast());
							} else if (sourceStack == 4 && targetStack == 7) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack7.offerLast(stack4.pollLast());
							} else if (sourceStack == 4 && targetStack == 8) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack8.offerLast(stack4.pollLast());
							} else if (sourceStack == 4 && targetStack == 9) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack9.offerLast(stack4.pollLast());
							} else if (sourceStack == 5 && targetStack == 1) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack1.offerLast(stack5.pollLast());
							} else if (sourceStack == 5 && targetStack == 2) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack2.offerLast(stack5.pollLast());
							} else if (sourceStack == 5 && targetStack == 3) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack3.offerLast(stack5.pollLast());
							} else if (sourceStack == 5 && targetStack == 4) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack4.offerLast(stack5.pollLast());
							} else if (sourceStack == 5 && targetStack == 6) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack6.offerLast(stack5.pollLast());
							} else if (sourceStack == 5 && targetStack == 7) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack7.offerLast(stack5.pollLast());
							} else if (sourceStack == 5 && targetStack == 8) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack8.offerLast(stack5.pollLast());
							} else if (sourceStack == 5 && targetStack == 9) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack9.offerLast(stack5.pollLast());
							} else if (sourceStack == 6 && targetStack == 1) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack1.offerLast(stack6.pollLast());
							} else if (sourceStack == 6 && targetStack == 2) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack2.offerLast(stack6.pollLast());
							} else if (sourceStack == 6 && targetStack == 3) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack3.offerLast(stack6.pollLast());
							} else if (sourceStack == 6 && targetStack == 4) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack4.offerLast(stack6.pollLast());
							} else if (sourceStack == 6 && targetStack == 5) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack5.offerLast(stack6.pollLast());
							} else if (sourceStack == 6 && targetStack == 7) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack7.offerLast(stack6.pollLast());
							} else if (sourceStack == 6 && targetStack == 8) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack8.offerLast(stack6.pollLast());
							} else if (sourceStack == 6 && targetStack == 9) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack9.offerLast(stack6.pollLast());
							} else if (sourceStack == 7 && targetStack == 1) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack1.offerLast(stack7.pollLast());
							} else if (sourceStack == 7 && targetStack == 2) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack2.offerLast(stack7.pollLast());
							} else if (sourceStack == 7 && targetStack == 3) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack3.offerLast(stack7.pollLast());
							} else if (sourceStack == 7 && targetStack == 4) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack4.offerLast(stack7.pollLast());
							} else if (sourceStack == 7 && targetStack == 5) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack5.offerLast(stack7.pollLast());
							} else if (sourceStack == 7 && targetStack == 6) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack6.offerLast(stack7.pollLast());
							} else if (sourceStack == 7 && targetStack == 8) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack8.offerLast(stack7.pollLast());
							} else if (sourceStack == 7 && targetStack == 9) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack9.offerLast(stack7.pollLast());
							} else if (sourceStack == 8 && targetStack == 1) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack1.offerLast(stack8.pollLast());
							} else if (sourceStack == 8 && targetStack == 2) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack2.offerLast(stack8.pollLast());
							} else if (sourceStack == 8 && targetStack == 3) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack3.offerLast(stack8.pollLast());
							} else if (sourceStack == 8 && targetStack == 4) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack4.offerLast(stack8.pollLast());
							} else if (sourceStack == 8 && targetStack == 5) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack5.offerLast(stack8.pollLast());
							} else if (sourceStack == 8 && targetStack == 6) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack6.offerLast(stack8.pollLast());
							} else if (sourceStack == 8 && targetStack == 7) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack7.offerLast(stack8.pollLast());
							} else if (sourceStack == 8 && targetStack == 9) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack9.offerLast(stack8.pollLast());
							} else if (sourceStack == 9 && targetStack == 1) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack1.offerLast(stack9.pollLast());
							} else if (sourceStack == 9 && targetStack == 2) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack2.offerLast(stack9.pollLast());
							} else if (sourceStack == 9 && targetStack == 3) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack3.offerLast(stack9.pollLast());
							} else if (sourceStack == 9 && targetStack == 4) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack4.offerLast(stack9.pollLast());
							} else if (sourceStack == 9 && targetStack == 5) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack5.offerLast(stack9.pollLast());
							} else if (sourceStack == 9 && targetStack == 6) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack6.offerLast(stack9.pollLast());
							} else if (sourceStack == 9 && targetStack == 7) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack7.offerLast(stack9.pollLast());
							} else if (sourceStack == 9 && targetStack == 8) {
//							System.out.println(strLine[0] + " " + strLine[1] + " " + strLine[2] + " " + strLine[3] + " " + strLine[4] + " " + strLine[5]);
//							System.out.println(stack1.poll());
								stack8.offerLast(stack9.pollLast());
							}
						}
//					} else if (data.contains("1   2   3   4   5   6   7   8   9")) {							
//						System.out.println(stack1);
//						System.out.println(stack2);
//						System.out.println(stack3);
//						System.out.println(stack4);
//						System.out.println(stack5);
//						System.out.println(stack6);
//						System.out.println(stack7);
//						System.out.println(stack8);
//						System.out.println(stack9);
//						System.out.println();
//						System.out.print(stack1.pollLast());
//						System.out.print(stack2.pollLast());
//						System.out.print(stack3.pollLast());
//						System.out.print(stack4.pollLast());
//						System.out.print(stack5.pollLast());
//						System.out.print(stack6.pollLast());
//						System.out.print(stack7.pollLast());
//						System.out.print(stack8.pollLast());
//						System.out.print(stack9.pollLast());
//						System.out.println();
					} else {
						continue;
						// guess1: MNZTBBVHP
						// guess2: QNHWJVJZW
					}
//				}
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
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.getMessage();
		}
	}

}
