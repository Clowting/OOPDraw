import composers.*;
import shapes.Shape;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashSet;

import javax.swing.*;

/**
 * Program for drawing shapes
 * If this program does not work, don't blame me!
 *
 * @author Thijs Clowting
 */
public class OOPDraw2 extends JFrame implements MouseListener, MouseMotionListener {

	private static final long serialVersionUID = 4695753453561082104L;
	private HashSet<Shape> shapes;
	private ComposerFactory composerFactory;
	private ShapeComposer currentComposer;

	public OOPDraw2() {
		shapes = new HashSet<Shape>();
		composerFactory = new ComposerFactory();
		currentComposer = composerFactory.getShapeComposer("Line");
		initGUI();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// Nothing TO DO in this method
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// Nothing TO DO in this method
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// Nothing TO DO in this method
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// Where the mouse went down is the start
		// position of the shape to be drawn
		int x = arg0.getX();
		int y = arg0.getY();
		currentComposer.create(x, y);
		shapes.add(currentComposer.getShape());
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// Fianlly the mouse is up indicating shape drawing is over.
		// So set these mouseUp coordinates to set the end position.
		// Then update the Vector count.
		int x = arg0.getX();
		int y = arg0.getY();
		currentComposer.complete(x, y);

		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// Now the mouse is being dragged without releasing,
		// which means that the user may stop his mouse over a
		// point but not release it. So that point is the
		// current endpoint
		int x = arg0.getX();
		int y = arg0.getY();
		currentComposer.expand(x, y);

		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// Nothing TO DO in this method
	}

	@Override
	public void paint(Graphics g) {
		// To get a shadow effect
		g.setColor(Color.black);
		g.fillRect(0, 0, getSize().width, getSize().height);
		g.setColor(new Color(255, 255, 154));
		g.fillRect(1, 1, getSize().width - 3, getSize().height - 3);
		for (Shape shape : shapes) {
			shape.Draw((Graphics2D) g);
		}
	}

	/**
	 * Method initializes GUI components
	 */
	private void initGUI() {
		setSize(800, 600);
		setTitle("OOPDraw");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		this.addMouseListener(this);
		this.addMouseMotionListener(this);

		// Create and Add the buttons
		for (String composerName : composerFactory.listComposerNames()) {
			Button btn = new Button(composerName);
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					currentComposer = composerFactory.getShapeComposer(composerName);
				}
			});
			add(btn);
		}

		Button btnClear = new Button("Clear");
		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Clear the entire drawing screen
				// First remove all elements
				shapes.clear();
				// finally, call repaint()
				repaint();
			}
		});
		add(btnClear);
	}

	public static void main(String[] args) {
		OOPDraw2 frame = new OOPDraw2();
		frame.setVisible(true);
	}

}
