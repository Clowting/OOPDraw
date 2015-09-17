package Composers;

import Shapes.OvalShape;

/**
 * Composes the oval shape
 */
public class OvalComposer extends ShapeComposer {

    @Override
    public void create(int x, int y) {
        shape = new OvalShape();
        shape.setStartPoint(x, y);
    }

}
