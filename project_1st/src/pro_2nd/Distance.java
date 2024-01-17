package pro_2nd;

public class Distance {
	double Meter;
	double Km;
	double Miles;
	/*
	 * we make the simple distance converter which convert the meter and miles to kilometer.
	 * and same we convert  miles and meter into kilometer
	 */
	
	public double CalculatedDistance(double Meter)//we calculated the meter in kilometer.
	{
		double Distance=Meter/1000;
		return Distance;
	}
	public double CalcultedDistance1(double miles)//we calculated the miles in kilometer.
	{
		double Distance1=miles/1.609;
		return Distance1;
	}
	
	
	public double CalculatedDistance2(double Km)//we calculated the kilometer in meter.
	{
		double Distance2=Km*1000;
		return Distance2;
	}
	public double CalculatedDistance3(double KM)//we calculated the kilometer in miles.
	{
		double Distance3=KM*1.609;
		return Distance3;
	}
	public static void main(String[] args) {
		Distance way= new Distance();
		double dis=way.CalculatedDistance(655);
		double dis1=way.CalcultedDistance1(876);
		
		double dis2=way.CalculatedDistance2(5);
		double dis3=way.CalculatedDistance3(456);
		
		System.out.println(dis3);
		System.out.println(dis2);
		
		System.out.println(dis);
		System.out.println(dis1);
	}

}
