package composers;

import java.util.HashMap;
import java.util.Set;

/**
 * Responsible for the creation and retrieval of the composers
 */
public class ComposerFactory {

	private HashMap<String, ShapeComposer> composers;

	public ComposerFactory() {
		composers = new HashMap<>();

		composers.put("Line", new LineComposer());
		composers.put("Oval", new OvalComposer());
		composers.put("Rect", new RectComposer());

	}

	/**
	 * Retrieve a specific shape composer
	 * @param composerType The type composer you want to retrieve
	 * @return The shape composer you specified
	 */
	public ShapeComposer getShapeComposer(String composerType) {

		return composers.get(composerType);

	}

	/**
	 * Returns the keys/names of the list composers
	 * @return A set with the keys/names of the composers
	 */
	public Set<String> listComposerNames() {
		return composers.keySet();
	}

}
