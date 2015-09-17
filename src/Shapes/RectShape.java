package Shapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

// Class cRect for drawing Rects is derived
// from our 'base class' cShape

public class RectShape extends Shape {

	public RectShape(Color color) {
		super(color);
	}

	@Override
	public void Draw(Graphics2D g) {
		super.Draw(g);
		g.drawRect(startPoint.x, startPoint.y, width, height);
	}

}
