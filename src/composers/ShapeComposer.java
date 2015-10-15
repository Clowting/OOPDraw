package composers;

import shapes.Shape;

/**
 * Composes the shapes
 */
public interface ShapeComposer {

    /**
     * Creates the shape
     * @param x The x-coordinate of the shape
     * @param y The y-coordinate of the shape
     */
    void create(int x, int y);

    /**
     * Expands the shape
     * @param x The x-coordinate of the shape
     * @param y The y-coordinate of the shape
     */
    void expand(int x, int y);

    /**
     * Completes the shape
     * @param x The x-coordinate of the shape
     * @param y The y-coordinate of the shape
     */
    void complete(int x, int y);

    /**
     * Returns the shape
     * @return The shape
     */
    Shape getShape();

}
