package pro_1st;
/*This is child class named as Domatic_bill. It has Abstract method inherited from Electricity_bill.
 * we use if and method for calculated the sum(amount)of unit in Rupee(Rs).
 * its is the calculation of domactic unit.
 */

public  class Domactic_bill extends Electricity_bill {
	@Override
	public long Calculatedbillamount(long unit) {
		long totalunit=0;
		if(unit<=100)//if unit is 100 or in between 100 then the per unit is multiply by 1 Rs.
		{
			totalunit=unit*1;
		}
		else if(unit>100 && unit<=200)//if unit is 100 to 200 then the per unit is multiply by 5/2(2.5 rs) Rs.
		{
			totalunit=(unit-100)*5/2+(100*1);
		}
		else if(unit>200 && unit<=500)//if unit is 200 to 500 then the per unit is multiply by 4 Rs.
		{
			totalunit=(unit-200)*4+(100*5/2)+(100*1);
		}
		else if (unit>500)//if unit is above 500 then the per unit is multiply by 6 Rs.
		{
			totalunit=(unit-500)*6+(300*4)+(100*5/2)+(100*1);
		}
		return totalunit;
	}

	public static void main(String[] args) {
		
	}

	
	}


