package Main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	private static Scanner input;

	public static void main(String[] args) {

		// 确定彩票 的数字和用户输入数字
		Random rand = new Random();
		input = new Scanner(System.in);
		int a = 0;
		int b = 0;
		while (a == b) {
			a = 0;
			b = 0;
			int lottery = rand.nextInt(99) + 1;
			a = lottery / 10;
			b = lottery % 10;
		}
		System.out.println("Please enter a two digit number");
		int number = input.nextInt();

		// 拆封出number的个位和十位
		int x = number / 10;
		int y = number % 10;

		System.out.println(a*10+b);
		
		// 比较
		if (a == x && b == y) {
			System.out.println("Surprise!!! You win the lottery ！！The bonus is $10000");
		} else if (a == y && b == x) {
			System.out.println("Congratulations!! Your bonus is $3000");
		} else if (a == x || a == y || b == x || b == y) {
			System.out.println("Good job! Your bonus is $1000");
		}else{
			System.out.println("I am sorry,but't you didn't win.");
		}
	}

}
