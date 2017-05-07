package datastructures;

import java.util.HashSet;
import java.util.Scanner;

public class StringOutput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		HashSet<Character> ch1 = new HashSet<Character>();
		for (int i =0; i<str1.length();i++){
			ch1.add(str1.charAt(i));
		}
		HashSet<Character> ch2 = new HashSet<Character>();
		for (int i =0; i<str1.length();i++){
			ch2.add(str2.charAt(i));
		}
		System.out.print("new elements opt1: ");
		for (char c:ch1){
			if (ch2.add(c)) {
				System.out.print(c+",");
			}
		}
		System.out.println("");
		System.out.print("new elements opt2: ");
		for (char c:ch2){
			if (ch1.add(c)) {
				System.out.print(c+",");
			}
		}
		
		sc.close();
	}

}
