package composers;

import shapes.RectShape;
import shapes.Shape;

/**
 * Composes the rectangle shape
 */
public class RectComposer implements ShapeComposer {

    private RectShape rect;

    @Override
    public void create(int x, int y) {
        rect = new RectShape();
        rect.setStartPoint(x, y);
    }

    @Override
    public void expand(int x, int y) {
        rect.setEndPoint(x, y);
    }

    @Override
    public void complete(int x, int y) {
        rect.setEndPoint(x, y);
    }

    @Override
    public Shape getShape() {
        return rect;
    }

}
