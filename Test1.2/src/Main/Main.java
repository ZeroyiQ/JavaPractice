package Main;

import java.util.Scanner;

public class Main {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Please input a amount between 1 to 99999:");
		int a = input.nextInt();
		// 取出 万 、千、百、十、个
		int i = a;

		int tenThousand = i / 10000;
		i = i % 10000;

		int thousand = i / 1000;
		i = i % 1000;

		int hundred = i / 100;
		i = i % 100;

		int ten = i / (10);
		i = i % (10);

		int unit = i;

		// 分下面5种情况判断：
		if (a > 99999 || a <= 0) {
			System.out.println("Amout is error!!");
		} else if (a >= 10000 && a <= 99999) {
			if (unit == tenThousand && ten == thousand) {
				System.out.println("Amout is Palindrome number");
			} else {
				System.out.println("Amout is not Palindrome number");
			}
		} else if (a >= 1000) {
			if (unit == thousand && ten == hundred) {
				System.out.println("Amout is Palindrome number");
			} else {
				System.out.println("Amout is not Palindrome number");
			}
		} else if (a >= 100) {
			if (unit == hundred) {
				System.out.println("Amout is Palindrome number");
			} else {
				System.out.println("Amout is not Palindrome number");
			}
		} else if (a > 0) {
			System.out.println("Amout is Palindrome number");
		} else {
			System.out.println("Amout is not Palindrome number");
		}
	}

}
