package Main;

public class Main {
	public static void main(String[] args) {
		// 初始化两个数组
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] b = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		// n为 a数组的行数 m为b的列数 x为a的列数 y为b的行数
		int n = a.length;
		int m = b[0].length;
		int x = a[0].length;
		int y = b.length;

		// 判断下 a的列数是否和b的行数相同
		if (x != y) {
			System.out.println("The ata error ");
		}

		// 构建新的数组c
		int[][] c = new int[n][m];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				int temp = 0;
				for (int k = 0; k < x; k++) {
					temp += a[i][k] * b[k][j];
				}
				c[i][j] = temp;
			}
		}

		// 输出三个数组
		print(a);
		print(b);
		print(c);

	}

	// 构建输出方法
	public static void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
				if (j == a[0].length - 1) {
					System.out.println();
				}
			}
		}
		System.out.println("-------------------------------------");
	}
}