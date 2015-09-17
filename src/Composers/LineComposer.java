package Composers;

import Shapes.LineShape;

/**
 * Composes the line shape
 */
public class LineComposer extends ShapeComposer {

    @Override
    public void create(int x, int y) {
        shape = new LineShape();
        shape.setStartPoint(x, y);
    }

}
