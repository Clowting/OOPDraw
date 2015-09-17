package Shapes;

import java.awt.*;

/**
 *  Class Shapes.OvalShape for drawing ovals is derived
 *  from our 'base class' AbstratShape
 */
public class OvalShape extends Shape {

	public OvalShape(Color color) {
		super(color);
	}

	@Override
	public void Draw(Graphics2D g) {
		super.Draw(g);
		g.drawOval(startPoint.x, startPoint.y, width, height);
	}

}