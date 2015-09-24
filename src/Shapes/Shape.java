package shapes;

import java.awt.Graphics2D;

/**
 * Creates and draws shapes
 */
public abstract class Shape {

	protected int startPointX, startPointY, endPointX, endPointY;

	/**
	 * Sets the start point
	 * @param x The x-coordinate of the shape
	 * @param y The y-coordinate of the shape
	 */
	public abstract void setStartPoint(int x, int y);

	/**
	 * Sets the end point
	 * @param x The x-coordinate of the shape
	 * @param y The y-coordinate of the shape
	 */
	public abstract void setEndPoint(int x, int y);

	/**
	 * Draws the shape
	 * @param g The graphics to draw the shape on
	 */
	public abstract void Draw(Graphics2D g);
}
