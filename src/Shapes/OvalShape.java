package Shapes;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Creates and draws the oval shape
 */
public class OvalShape extends Shape {

	private static final Color color = Color.BLUE;
	private Ellipse2D oval;

	public OvalShape() {
		oval = new Ellipse2D.Double();
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
		oval.setFrameFromDiagonal(startPointX, startPointY, endPointX, endPointY);

		g.setColor(color);
		g.draw(oval);
	}

}