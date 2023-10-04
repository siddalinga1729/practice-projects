package practice;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
//	String jarFilePath = "/home/siddu/Documents/Test.jar";
//
//    try {
//        ProcessBuilder processBuilder = new ProcessBuilder("java", "-jar", jarFilePath);
//        Process process = processBuilder.start();
//        int exitCode = process.waitFor();
//        
//        if (exitCode == 0) {
//            System.out.println("JAR executed successfully.");
//        } else {
//            System.err.println("JAR execution failed with exit code: " + exitCode);
//        }
//    } catch (IOException | InterruptedException e) {
//        e.printStackTrace();
//    }
		System.out.println(isValid("([)]"));
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (char x : s.toCharArray()) {
			char y;
			System.out.println(stack+"+++");
			if (x == '(') {
				System.out.println("11");
				stack.push(')');
				System.out.println(stack);
			} else if (x == '{') {
				stack.push('}');
				System.out.println("22");
				System.out.println(stack);
			} else if (x == '[') {
				System.out.println("33");
				stack.push(']');
				System.out.println(stack);
			} else if (stack.isEmpty() ||stack.pop()!= x) {
				System.out.println(x);
				System.out.println("44");
				return false;
			}

		}
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		return stack.isEmpty();

	}

}
