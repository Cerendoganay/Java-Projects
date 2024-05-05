package drawing.version3;

import java.util.ArrayList;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class Drawing {

	private ArrayList<Shape> shapes = new ArrayList<Shape>();

	public double calculateTotalArea(){
		double totalArea = 0;

		for (Shape sekil : shapes){
			totalArea += sekil.area();
		}


		return totalArea;
	}

	public void addShape(Shape s) {
		shapes.add(s);
	}
}