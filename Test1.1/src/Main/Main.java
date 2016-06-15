package Main;
public class Main {

	public static void main(String[] args) {
		// char a='a';
		// System.out.println((int)a);
		// ≤‚ ‘Unicode ÷– a=97
		for (int i=97 ; i < 97+26; i++) {
			
			System.out.print((char)i+" ");
			if ((i-96)%10==0) {
				System.out.println();
			}
		}
	}

}
