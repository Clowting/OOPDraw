package Shapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * base class Shapes.Shape
 *
 */
public abstract class Shape {

	protected Point startPoint, endPoint;
	protected int width, height;
	protected Color color;

	public Shape() {
		color = Color.red;
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void Draw(Graphics2D g) {
		g.setColor(color);
	}
}
