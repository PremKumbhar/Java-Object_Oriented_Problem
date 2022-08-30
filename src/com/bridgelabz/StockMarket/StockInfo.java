package com.bridgelabz.StockMarket;

public class StockInfo {
	private String stockName;
	private String numberOfShare;
	private String sharePrice;
	/**
	 * @return the stockName
	 */
	public String getStockName() {
		return stockName;
	}
	/**
	 * @param stockName the stockName to set
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	/**
	 * @return the numberOfShare
	 */
	public String getNumberOfShare() {
		return numberOfShare;
	}
	/**
	 * @param numberOfShare the numberOfShare to set
	 */
	public void setNumberOfShare(String numberOfShare) {
		this.numberOfShare = numberOfShare;
	}
	/**
	 * @return the sharePrice
	 */
	public String getSharePrice() {
		return sharePrice;
	}
	/**
	 * @param sharePrice the sharePrice to set
	 */
	public void setSharePrice(String sharePrice) {
		this.sharePrice = sharePrice;
	}
	@Override
	public String toString() {
		return "StockInfo [stockName=" + stockName + ", numberOfShare=" + numberOfShare + ", sharePrice=" + sharePrice
				+ "]";
	}
	
	

}
