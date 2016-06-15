
public class Test {
	public static void main(String[] args) {
		Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
		System.out.println(stock.getChangePercent());
	}
}
