package Composers;

import Shapes.OvalShape;

import java.awt.*;

/**
 * Created by thijs on 13-9-2015.
 */
public class OvalComposer extends ShapeComposer {

    @Override
    public void create(int x, int y) {
        super.create(x, y);
        shape = new OvalShape(Color.RED);
        shape.setStartPoint(new Point(x, y));
    }

}
