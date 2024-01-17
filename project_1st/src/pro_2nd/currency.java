package pro_2nd;

public class currency {
	static double Inr=3409;
	static double Dollar;
	static double Yen;
	static double Euro;
	/*
	 * in this method we make Currency Converter for convert the Dollar,Yen and Euro in indian rupee.
	 * and same after three method we make Currency Convert for convert Indian rupee in Dollar,Yen,Euro. 
	 */
	
	public double calculatedConvert(double Dollar)//we multiply the dollar by inr(indian rupee) for calculate the amount the Dollar in inr.  . 
	{
		double Convert= Dollar*83.91;
		return Convert;
	}
	public double CalculatedConvert1(double Yen)//we multiply the Yen by inr(indian rupee) for calculate the amount of the Yen in inr.
	{
		double Covert1=Yen*0.58;
		return Covert1;
	}
	public double CalculatedConvert2(double Euro)//we multiply the Euro by inr(indian rupee) for calculate the amount of Euro  in inr.
	{
		double Convert2=Euro*91.06;
		return Convert2;
	}
	public double CalculatedConve(double Inr)//we divied the inr(indian rupee) by Dollar for calculate the amount in inr in Dollar.
	{
		double Conve=Inr/83.91;
		return Conve;
	}
	public double CalculatedConve1(double Inr)//we divied the inr(indian rupee) by Yen for calculate the amount in inr in Yen.
	{
		double Conve1=Inr/0.58;
		return Conve1;
	}
	public double CalculatedConve2(double Inr)//we divied the inr(indian rupee) by Euro for calculate the amount in inr in Euro.
	{
		double Conve2=Inr/91.06;
		return Conve2;
	}
	

	public static void main(String[] args) {
		currency India=new currency();
		
		double cal=India.calculatedConvert(Inr);
		double cal1=India.CalculatedConvert1(Inr);
		double cal2=India.CalculatedConvert2(Inr);
		double cal3=India.CalculatedConve(Inr);
		double cal4=India.CalculatedConve1(Inr);
		double cal5=India.CalculatedConve2(Inr);
		
		System.out.println("the price of " +Inr+" to Dollar convert is " +cal);
		System.out.println("the price of " +Inr+" to Yen convert is " +cal1);
		System.out.println("the price of " +Inr+" to Euro convert is " +cal2);
		System.out.println("the price of " +Inr+" to Inr convert is " +cal3);
		System.out.println("the price of " +Inr+" to Inr convert is " +cal4);
		System.out.println("the price of " +Inr+" to Inr convert is " +cal5);
	}

}
