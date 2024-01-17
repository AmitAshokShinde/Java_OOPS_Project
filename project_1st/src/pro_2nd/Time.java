package pro_2nd;

public class Time {
	double hour;
	double mintes;
	double seconds;
	
	
	public double time(double mintes)//we calculated the hour in minutes.
	{
		double time=hour*60;
		return time;
	}
	public double time1(double seconds)//we calculated the hour in seconds.
	{
		double time1=hour*3600;
		return time1;
	}
	public double time2(double hour)//we calculated the minutes in hour.
	{
		double time2=hour/3600;
		return time2;
	}
	public double time3(double hour)//we calculated the seconds in hour.
	{
		double time3=hour/60;
		return time3;
	}
	public static void main(String[] args) {
		Time ghanta=new Time();
		double day=ghanta.time(3);
		double day1=ghanta.time1(1);
		double day2=ghanta.time2(3600);
		double day3=ghanta.time3(180);
		
		System.out.println(day);
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
	}

}
