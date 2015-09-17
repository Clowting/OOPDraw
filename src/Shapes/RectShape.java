package Shapes;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Creates and draws the rectangle shape
 */
public class RectShape extends Shape {

	private static final Color color = Color.GREEN;
	private Rectangle2D rectangle;

	public RectShape() {
		rectangle = new Rectangle2D.Double();
	}

	@Override
	public void setStartPoint(int x, int y) {
		startPointX = x;
		startPointY = y;
	}

	@Override
	public void setEndPoint(int x, int y) {
		endPointX = x;
		endPointY = y;
	}

	@Override
	public void Draw(Graphics2D g) {
		rectangle.setFrameFromDiagonal(startPointX, startPointY, endPointX, endPointY);

		g.setColor(color);
		g.draw(rectangle);
	}
}
