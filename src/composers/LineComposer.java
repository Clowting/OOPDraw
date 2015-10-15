package composers;

import shapes.LineShape;
import shapes.Shape;

/**
 * Composes the line shape
 */
public class LineComposer implements ShapeComposer {

    private LineShape line;

    @Override
    public void create(int x, int y) {
        line = new LineShape();
        line.setStartPoint(x, y);
    }

    @Override
    public void expand(int x, int y) {
        line.setEndPoint(x, y);
    }

    @Override
    public void complete(int x, int y) {
        line.setEndPoint(x, y);
    }

    @Override
    public Shape getShape() {
        return line;
    }

}
