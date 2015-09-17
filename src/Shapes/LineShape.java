package Shapes;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Creates and draws the line shape
 */
public class LineShape extends Shape {

	private static final Color color = Color.RED;
	private Line2D line;

	public LineShape() {
		line = new Line2D.Double();
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
		line.setLine(startPointX, startPointY, endPointX, endPointY);

		g.setColor(color);
		g.draw(line);
	}
}
