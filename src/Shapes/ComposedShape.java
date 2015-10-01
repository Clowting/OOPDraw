package shapes;

import java.awt.*;
import java.util.HashSet;

/**
 * Created by thijsclowting on 30-09-15.
 */
public class ComposedShape extends Shape {

	private HashSet<Shape> shapes;

	public ComposedShape() {
		shapes = new HashSet<>();
	}

	/**
	 * Add a shape to the composed shape
	 * @param shape The shape to add
	 */
	public void addShape(Shape shape) {
		shapes.add(shape);
	}

	/**
	 * Remove a shape from the composed shape
	 * @param shape The shape to be removed
	 */
	public void removeShape(Shape shape) {
		shapes.remove(shape);
	}

	@Override
	public void setStartPoint(int x, int y) {
		for(Shape shape : shapes) {
			shape.setStartPoint(x, y);
		}
	}

	@Override
	public void setEndPoint(int x, int y) {
		for(Shape shape : shapes) {
			shape.setEndPoint(x, y);
		}
	}

	@Override
	public void Draw(Graphics2D g) {
		for(Shape shape : shapes) {
			shape.Draw(g);
		}
	}
}
