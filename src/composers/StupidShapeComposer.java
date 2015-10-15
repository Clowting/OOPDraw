package composers;

import shapes.*;

/**
 * Created by thijsclowting on 30-09-15.
 */
public class StupidShapeComposer implements ShapeComposer {

	private ComposedShape composedShape;

	@Override
	public void create(int x, int y) {
		composedShape = new ComposedShape();

		composedShape.addShape(new LineShape());
		composedShape.addShape(new OvalShape());
		composedShape.addShape(new RectShape());

		composedShape.setStartPoint(x, y);
	}

	@Override
	public void expand(int x, int y) {
		composedShape.setEndPoint(x, y);
	}

	@Override
	public void complete(int x, int y) {
		composedShape.setEndPoint(x, y);
	}

	@Override
	public Shape getShape() {
		return composedShape;
	}
}
