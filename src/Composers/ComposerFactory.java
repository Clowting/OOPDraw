package Composers;

import java.util.HashMap;
import java.util.Set;

/**
 * Responsible for the creation of the composers.
 */
public class ComposerFactory {

	private HashMap<String, ShapeComposer> composers;

	public ComposerFactory() {
		composers = new HashMap<>();

		composers.put("Line", new LineComposer());
		composers.put("Oval", new OvalComposer());
		composers.put("Rect", new RectComposer());

	}

	public ShapeComposer getShapeComposer(String composerType) {

		return composers.get(composerType);

	}

	public Set<String> listComposerNames() {
		return composers.keySet();
	}

}
