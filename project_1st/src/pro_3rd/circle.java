package pro_3rd;
//This is child class named as Circle. It has Abstract method inherited from Shapes.


public class circle extends Shapes//This method calculates the area for Circle. It takes radius as a parameter.

{
	public double calculatedarea(double radius) {
		double area=(radius*radius)*3.14;
		return area;
	}

	@Override
	double calculatedarea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
