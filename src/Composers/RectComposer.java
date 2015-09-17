package Composers;

import Shapes.RectShape;

import java.awt.*;

/**
 * Created by thijs on 13-9-2015.
 */
public class RectComposer extends ShapeComposer {

    @Override
    public void create(int x, int y) {
        super.create(x, y);
        shape = new RectShape(Color.BLUE);
        shape.setStartPoint(new Point(x, y));
    }

}
