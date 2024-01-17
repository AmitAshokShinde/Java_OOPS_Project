package pro_1st;
//this is main class of the Electricity_bill.

public class Main_class {

	public static void main(String[] args) {
		Domactic_bill Dbill=new Domactic_bill();
		Commercial_bill Cbill=new Commercial_bill();
		
		long val1= Dbill.calculatedcUnit(5000, 4700);
		long val2= Cbill.calculatedcUnit(5000, 4500);
		
		long amount1=Dbill.Calculatedbillamount(val1);
		long amount2=Cbill.Calculatedbillamount(val2);
		
		System.out.println(amount1);
		System.out.println(amount2);
	}

}
