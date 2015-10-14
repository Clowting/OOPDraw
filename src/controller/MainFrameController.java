package controller;

import model.Model;
import view.View;

import java.util.Observable;
import java.util.Observer;

/**
 * The main frame controller
 */
public class MainFrameController implements Controller, Observer {

    private Model model;
    private View view;

    @Override
    public void initialize(Model model, View view) {
        this.model = model;
        this.view = view;

        model.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Dit is een controller.");
    }
}
