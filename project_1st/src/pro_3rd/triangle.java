package pro_3rd;
//This is child class named as triangle. It has Abstract method inherited from Shapes.


public class triangle extends Shapes//This method calculates the area for triangle. It takes height and base as a parameter.
{
	public double calculatedarea(double height,double base) {
		double area=(height*base)/2;
		return area;
	}

	@Override
	double calculatedarea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
