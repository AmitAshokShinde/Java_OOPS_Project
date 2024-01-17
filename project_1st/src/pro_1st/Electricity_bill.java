package pro_1st;

public abstract class Electricity_bill {
	long Consumerno;//it is consumer number we take its long .
	String Consumername;//its the consumer name.
	long  previousreading;//previous month reading.
	long  Currentreading;//current month reading.
	
	
	/*
	 * we calculated the unit the help of the previous reading and current reading. we subtract the the current reading 
	 * with previous reading then we get total unit spend in month.
	 */
	public long calculatedcUnit(long Currentreading, long previousreading) {
		long Unit=Currentreading-previousreading;
		return Unit;
	}
	 abstract long Calculatedbillamount(long unit);

}
