package pro_3rd;
//this is main class of the Shapes.


public class Main_class {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		triangle tri=new triangle();
		circle cir=new circle();
		
		
		double val=rect.calculatedarea(10, 12);
		double val2=tri.calculatedarea(3, 4);
		double val3=cir.calculatedarea(4);
		
		System.out.println(val);
		System.out.println(val2);
		System.out.println(val3);

	}

}
