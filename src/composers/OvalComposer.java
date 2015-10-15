package composers;

import shapes.OvalShape;
import shapes.Shape;

/**
 * Composes the oval shape
 */
public class OvalComposer implements ShapeComposer {

    private OvalShape oval;

    @Override
    public void create(int x, int y) {
        oval = new OvalShape();
        oval.setStartPoint(x, y);
    }

    @Override
    public void expand(int x, int y) {
        oval.setEndPoint(x, y);
    }

    @Override
    public void complete(int x, int y) {
        oval.setEndPoint(x, y);
    }

    @Override
    public Shape getShape() {
        return oval;
    }

}
