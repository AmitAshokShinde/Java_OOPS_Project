package Pro_4th;
//This is child class named as Associate_Professor. It has Abstract method inherited from Employee.

public class Associate_Professor extends Employee  {
	@Override
	double CalculatedDa(double Basic_pay)//this method use for calculated the Da of Employee.which is 97% of bp.
	{
		double Da=Basic_pay*97/100;
		return Da;
	}
	double CalculatedHra(double Basic_pay)//this method use for calculated the Hra of Employee.which is 10% of bp.
	{
		double Hra= Basic_pay*10/100;
		return Hra;
	}
	double CalculatedPf(double Basic_pay)//this method use for calculated the Pf of Employee.which is 12% of bp. 
	{
		double Pf= Basic_pay*12/100;
		return Pf;
	}
	double CalculatedSc(double Basic_pay)//this method use for calculated the Sc of Employee.which is 0.1% of bp.
	{
		double Sc=Basic_pay*0.1/100;
		return Sc;
	}
	double CalculatedGross_Sal(double Basic_pay,double Hra,double Da)//this method use for calculated the Gross Salary of Employee.
	{
		double Gross_sal=Basic_pay+Hra+Da;
		return Gross_sal;
	}
	double CalculatedNet_Sal(double Gross_sal,double Pf,double Sc)//this method use for calculated the Net Salary of Employee. 
	{
		double Net_Sal=Gross_sal-Pf-Sc;
		return Net_Sal;
	}
	
	

}
