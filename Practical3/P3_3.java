public class P3_3
{
    public static void main(String[] args)
    {
        Stock oracle = new Stock("ORCL", "Oracle Corporation");

        oracle.setPreviousClosingPrice(34.5);
        oracle.setCurrentPrice(34.35);

        oracle.print();
    }
}

class Stock
{
    private final String symbol;
    private final String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name)
    {
        this.symbol = symbol;
        this.name = name;
    }

    public double getPreviousClosingPrice()
    {
        return this.previousClosingPrice;
    }

    public void setPreviousClosingPrice(double p)
    {
        this.previousClosingPrice = p;
    }

    public double getCurrentPrice()
    {
        return this.currentPrice;
    }

    public void setCurrentPrice(double p)
    {
        this.currentPrice = p;
    }

    public double getChangePercent()
    {
        return (this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice * 100;
    }

    public void print()
    {
        System.out.println(this.name + " (" + this.symbol + ")");
        System.out.println("Previous closing price : " + this.getPreviousClosingPrice());
        System.out.println("Current price : " + this.getCurrentPrice());
        System.out.println("Change : " + this.getChangePercent() + " %");
        System.out.println();
    }
}