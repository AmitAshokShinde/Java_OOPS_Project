package Pro_4th;

public class Main_class {
	static double Bp1=10000;
	static double Bp2=20000;
	static double Bp3=30000;
	static double Bp4=40000;

	public static void main(String[] args) {
		Programmer Shashi=new Programmer();
		Assistant_Professor Ayush=new Assistant_Professor();
		Associate_Professor Shubham=new Associate_Professor();
		Professor Amit =new Professor();
		
		double Emp_1=Shashi.CalculatedDa(Bp1);
		System.out.println("the Da of Programmer Shahsi is "+Emp_1);
		double Emp_2=Shashi.CalculatedHra(Bp1);
		System.out.println("the Hra of Programmer Shahsi is "+Emp_2);
		double Emp_3=Shashi.CalculatedPf(Bp1);
		System.out.println("the Pf of Programmer Shahsi is "+Emp_3);
		double Emp_4=Shashi.CalculatedSc(Bp1);
		System.out.println("the Sc of Programmer Shahsi is "+Emp_4);
		double Emp_5=Shashi.CalculatedGross_Sal(Bp1, Emp_1, Emp_2);
		System.out.println("the Groass Salary of Programmer Shahsi is "+Emp_5);
		double Emp_6=Shashi.CalculatedNet_Sal(Emp_5, Emp_3, Emp_4);
		System.out.println("the Net Salary of Programmer Shahsi is "+Emp_6);
		
		System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");

		
		double Emp_One=Ayush.CalculatedDa(Bp2);
		System.out.println("the Da of Assistant_Professor Ayush is "+Emp_One);
		double Emp_Two=Ayush.CalculatedHra(Bp2);
		System.out.println("the Hra of Assistant_Professor Ayush is "+Emp_Two);
		double Emp_Three=Ayush.CalculatedPf(Bp2);
		System.out.println("the Pf of Assistant_Professor Ayush is "+Emp_Three);
		double Emp_Four=Ayush.CalculatedSc(Bp2);
		System.out.println("the Sc of Assistant_Professor Ayush is "+Emp_Four);
		double Emp_Five=Ayush.CalculatedGross_Sal(Bp2, Emp_One, Emp_Two);
		System.out.println("the Groass Salary of Assistant_Professor Ayush is "+Emp_Five);
		double Emp_Six=Ayush.CalculatedNet_Sal(Emp_Five, Emp_Three, Emp_Four);
		System.out.println("the Net Salary of Assistant_Professor Ayush is "+Emp_Six);
		
		System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");

		

		double Emp_I=Shubham.CalculatedDa(Bp3);
		System.out.println("the Da of Associate_Professor Shubham is "+Emp_I);
		double Emp_II=Shubham.CalculatedHra(Bp3);
		System.out.println("the Hra of Associate_Professor Shubham is "+Emp_II);
		double Emp_III=Shubham.CalculatedPf(Bp3);
		System.out.println("the Pf of Associate_Professor Shubham is "+Emp_III);
		double Emp_IV=Shubham.CalculatedSc(Bp3);
		System.out.println("the Sc of Associate_Professor Shubham is "+Emp_IV);
		double Emp_V=Shubham.CalculatedGross_Sal(Bp3, Emp_I, Emp_II);
		System.out.println("the Groass Salary of Associate_Professor Shubham is "+Emp_V);
		double Emp_VI=Shubham.CalculatedNet_Sal(Emp_V, Emp_III, Emp_IV);
		System.out.println("the Net Salary of Associate_Professor Shubham is "+Emp_VI);
		
		System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
		
		double Emp_i=Amit.CalculatedDa(Bp4);
		System.out.println("the Da of Professor Amit is "+Emp_i);
		double Emp_ii=Amit.CalculatedHra(Bp4);
		System.out.println("the Hra of Professor Amit is "+Emp_ii);
		double Emp_iii=Amit.CalculatedPf(Bp4);
		System.out.println("the Pf of Professor Amit is "+Emp_iii);
		double Emp_iv=Amit.CalculatedSc(Bp4);
		System.out.println("the Sc of Professor Amit is "+Emp_iv);
		double Emp_v=Amit.CalculatedGross_Sal(Bp4, Emp_i, Emp_ii);
		System.out.println("the Groass Salary of Professor Amit is "+Emp_v);
		double Emp_vi=Amit.CalculatedNet_Sal(Emp_v, Emp_iii, Emp_iv);
		System.out.println("the Net Salary of Professor Amit is "+Emp_vi);
		
	}

}
