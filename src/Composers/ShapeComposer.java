package composers;

import shapes.Shape;

/**
 * Composes the shapes
 */
public abstract class ShapeComposer {

    protected Shape shape;

    /**
     * Creates the shape
     * @param x The x-coordinate of the shape
     * @param y The y-coordinate of the shape
     */
    public abstract void create(int x, int y);

    /**
     * Expands the shape
     * @param x The x-coordinate of the shape
     * @param y The y-coordinate of the shape
     */
    public void expand(int x, int y) {
        shape.setEndPoint(x, y);
    }

    /**
     * Completes the shape
     * @param x The x-coordinate of the shape
     * @param y The y-coordinate of the shape
     */
    public void complete(int x, int y) {
        shape.setEndPoint(x, y);
    }

    /**
     * Returns the shape
     * @return The shape
     */
    public Shape getShape() {
        return shape;
    }

}
