package model;

public class CurrencyExchange {
	
	public  static double COPtoUSD(double cop) {
		return cop/3558;
	}
	
	public static double USDtoCOP(double usd) {
		return usd * 3558;
	}
	

}
