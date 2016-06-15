package Main;

public class Main {
	public static void main(String[] args) {
		// ��ʼ����������
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] b = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		// nΪ a��������� mΪb������ xΪa������ yΪb������
		int n = a.length;
		int m = b[0].length;
		int x = a[0].length;
		int y = b.length;

		// �ж��� a�������Ƿ��b��������ͬ
		if (x != y) {
			System.out.println("The ata error ");
		}

		// �����µ�����c
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

		// �����������
		print(a);
		print(b);
		print(c);

	}

	// �����������
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