package Shapes;

import java.awt.*;

/**
 *  Class Shapes.LineShape for drawing lines is
 *  derived from our 'base' class Shapes.Shape
 */
public class LineShape extends Shape {

	public LineShape(Color color) {
		super(color);
	}

	@Override
	public void Draw(Graphics2D g) {
		super.Draw(g);
		g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
	}
}
