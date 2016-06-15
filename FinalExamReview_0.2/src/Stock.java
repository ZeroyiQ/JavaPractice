
public class Stock {
	private String symbol = new String();
	private String name = new String();
	private double previousClosingPrice;
	private double currentPrice;
	public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
		this.symbol = symbol;
		this.name = name;
		this.previousClosingPrice = previousClosingPrice;
		this.currentPrice = currentPrice;
	}
	public double getChangePercent(){
		return (currentPrice-previousClosingPrice)/previousClosingPrice*100;
	}
}
