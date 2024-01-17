package pro_3rd;
//This is child class named as Rectangle. It has Abstract method inherited from Shapes.


public class Rectangle extends Shapes//This method calculates the area for Rectangle. It takes length and breath as a parameter.
{
	public double calculatedarea(double length,double breath) {
		double area=length*breath;
		return area;
	}

		
	

	@Override
	double calculatedarea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
