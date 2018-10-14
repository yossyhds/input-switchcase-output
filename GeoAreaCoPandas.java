import java.util.Scanner;
public class GeoAreaCoPandas{
	public static void main (String [] args){

		double side;
		double width;
		double height;
		double rectangleArea;
		double squareArea;
		int option;
		Scanner sisy = new Scanner (System.in);

		System.out.println("Geometry Area Counter");
		System.out.println("=====================");
		System.out.println("1. Square\n2. Rectangle");
		System.out.print("Option :");
		option = sisy.nextInt();

		switch (option){

			case 1:
				System.out.print("input side: ");
				side = sisy.nextDouble();
				squareArea = side*side;
				System.out.println("Square Area: "+squareArea);
				break;
			case 2:
				System.out.print("input width: ");
				width = sisy.nextDouble();
				System.out.print("input height: ");
				height = sisy.nextDouble();
				rectangleArea = width*height;
				System.out.println("Rectangle Area: "+rectangleArea);
				break;



		}
	}
}