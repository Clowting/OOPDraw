package view;

import controller.MainFrameController;
import model.Model;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * The main view
 */
public class MainFrame extends JFrame implements View, Observer {

    private Model model;
    private MainFrameController controller;

    public MainFrame() {

        setSize(800, 600);
        setTitle("OOPDrawMVC");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

    }

    @Override
    public void initialize(Model model) {
        this.model = model;
        model.addObserver(this);

        makeController();

        setVisible(true);
    }

    private void makeController() {
        controller = new MainFrameController();
        controller.initialize(model, this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Dit is een view.");
    }
}
