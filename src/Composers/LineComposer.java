package Composers;

import Shapes.LineShape;

import java.awt.*;

/**
 * Created by thijs on 13-9-2015.
 */
public class LineComposer extends ShapeComposer {

    @Override
    public void create(int x, int y) {
        shape = new LineShape(Color.BLUE);
        shape.setStartPoint(new Point(x, y));
    }

    @Override
    public void expand(int x, int y) {
        shape.setEndPoint(new Point(x, y));
    }

}
