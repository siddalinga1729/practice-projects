package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//grouping given chars
public class GroupingChars01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String string = sc.next();
		Map<String, Long> map = new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			if (map.containsKey(string.charAt(i)+"")) {
				map.put(string.charAt(i) + "", map.get(string.charAt(i)+"") + 1l);
			} else {
				map.put(string.charAt(i) + "", 1l);
			}
		}
		map.forEach((x,y)->System.out.print(x+y+""));
	}
}
