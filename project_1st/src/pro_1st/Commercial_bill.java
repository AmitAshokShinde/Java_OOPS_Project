package pro_1st;
/*
 * This is child class named as Commercial_bill. It has Abstract method inherited from Electricity_bill.
 * we use if and method for calculated the sum(amount)of unit in Rupee(Rs).
 * its is the calculation of commerical  unit.
 */

public  class Commercial_bill extends Electricity_bill {
	@Override
	public long Calculatedbillamount(long unit) {
		long totalunit=0;
		if(unit<=100)//if unit is 100 or in between 100 then the per unit is multiply by 2 Rs.
		{
			totalunit=unit*2;
		}
		else if(unit>100 && unit<=200)//if unit is 100 to 200 then the per unit is multiply by 9/2(4.5 rs) Rs. 
		{
			totalunit=(unit-100)*9/2+(100*2);
		}
		else if(unit>200 && unit<=500)//if unit is 200 to 500 then the per unit is multiply by 6 Rs.
		{
			totalunit=(unit-200)*6+(100*9/2)+(100*2);
		}
		else if (unit>500)//if unit is above 500 then the per unit is multiply by 7 Rs.
		{
			totalunit=(unit-500)*7+(300*6)+(100*9/2)+(100*2);
		}
		return totalunit;
	}

	public static void main(String[] args) {
		
	}

	
}


