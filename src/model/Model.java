package model;

import composers.ShapeComposer;
import shapes.Shape;

import java.util.HashSet;
import java.util.Observable;

/**
 * The OOPDrawMVC model that contains all the data
 */
public class Model extends Observable {

    private HashSet<Shape> shapes;
    private ShapeComposer currentComposer;

    public Model() {
        shapes = new HashSet<Shape>();

    }

}
