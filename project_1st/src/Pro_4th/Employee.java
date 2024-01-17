package Pro_4th;

abstract public class Employee {
	protected String emp_Name;
	protected int emp_Id;
	protected String emp_Address;
	protected String moblie_No;
	protected String email_Id;
	protected double Basic_pay;
	protected double Da;
	protected double Hra;
	protected double Pf;
	protected double Sc;
	
	
	//we use abstract method of calculated Da of Programmer, Assistant Professor,Associate Professor and Professor
	abstract double CalculatedDa(double Basic_pay);
	
	//we use abstract method of calculated Hra of Programmer, Assistant Professor,Associate Professor and Professor
    abstract double CalculatedHra(double Basic_pay);
    
	//we use abstract method of calculated Pf of Programmer, Assistant Professor,Associate Professor and Professor
    abstract double CalculatedPf(double Basic_pay);
	
	//we use abstract method of calculated Sc of Programmer, Assistant Professor,Associate Professor and Professor
    abstract double CalculatedSc(double Basic_pay);
	
	//we use abstract method of calculated Gross_Sal of Programmer, Assistant Professor,Associate Professor and Professor
    abstract double CalculatedGross_Sal(double Basic_pay,double Hra,double Da);
	
	//we use abstract method of calculated Net_Sal of Programmer, Assistant Professor,Associate Professor and Professor
    abstract double CalculatedNet_Sal(double Gross_sal,double Pf,double Sc);
	
	
	
	
}
