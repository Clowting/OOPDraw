import model.Model;
import view.MainFrame;
import view.View;

/**
 * The OOPDrawMVC version
 * @author Thijs Clowting
 * @version 1.0a
 */
public class OOPDrawMVC {

    public OOPDrawMVC() {
        Model model = new Model();
        View mainFrame = new MainFrame();

        mainFrame.initialize(model);
    }

    public static void main(String[] args) {
        OOPDrawMVC oopDrawMVC = new OOPDrawMVC();
    }
}
