package Composers;

import Shapes.Shape;

import java.awt.*;

/**
 * Created by thijs on 13-9-2015.
 */
public abstract class ShapeComposer {

    protected Shape shape;
    private Point originalStartPoint;

    /**
     * Creates the shape
     * @param x The x-coordinate of the shape
     * @param y The y-coordinate of the shape
     */
    public void create(int x, int y) {
        originalStartPoint = new Point(x, y);
    }

    /**
     * Expands the shape
     * @param x The x-coordinate of the shape
     * @param y The y-coordinate of the shape
     */
    public void expand(int x, int y) {
        Point newStartPoint = new Point(Math.min(x, originalStartPoint.x), Math.min(y, originalStartPoint.y));
        Point drawToPoint = new Point(Math.max(x, originalStartPoint.x), Math.max(y, originalStartPoint.y));

        int width = Math.abs((drawToPoint.x - newStartPoint.x));
        int height = Math.abs((drawToPoint.y - newStartPoint.y));

        shape.setStartPoint(newStartPoint);
        shape.setWidth(width);
        shape.setHeight(height);
    }

    /**
     * Completes the shape
     * @param x The x-coordinate of the shape
     * @param y The y-coordinate of the shape
     */
    public void complete(int x, int y) {
        shape.setEndPoint(new Point(x, y));
    }

    /**
     * Returns the shape
     * @return The shape
     */
    public Shape getShape() {
        return shape;
    };

}
