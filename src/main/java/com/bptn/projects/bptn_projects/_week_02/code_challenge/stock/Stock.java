package com.bptn.projects.bptn_projects._week_02.code_challenge.stock;

public class Stock {

    // Create instance variables 
    private String tickerSymbol;
    private String companyName;
    private int price;
    private double percentChange;
    private int totalShares;
    private long marketCap;

    // Constructor 
    public Stock( String tickerSymbol, String companyName, int price, int totalShares){
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName =  companyName;
        this.price = price;
        this.totalShares = totalShares;
        this.percentChange = 0;
        this.marketCap = (long)(totalShares * price); 
    }
    
    // Create the methods 
    public void adjustPrice(int change){
        price += change;
        percentChange = ((double)change/price)*100;
        marketCap = (long)(totalShares * price); 
        
    }

      @Override
    public String toString() {
        return "Ticker Symbol: " + tickerSymbol + "\n" +
               "Company: " + companyName + "\n" +
               "Current Price: $" + price + 
               " (" + (percentChange >= 0 ? "" : "") + percentChange + "%)\n" + 
               "Market Cap: $" + marketCap;
    }
    
    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}


