package composers;

import shapes.RectShape;

/**
 * Composes the rectangle shape
 */
public class RectComposer extends ShapeComposer {

    @Override
    public void create(int x, int y) {
        shape = new RectShape();
        shape.setStartPoint(x, y);
    }

}
