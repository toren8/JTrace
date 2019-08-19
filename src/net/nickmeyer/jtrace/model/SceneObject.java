package net.nickmeyer.jtrace.model;

/**
 * An object in the scene
 *
 */
public interface SceneObject {
	
	/**
	 * Determine if a vector intersects the object.
	 * @param ray Vector being traced for intersection.
	 * @return True if intersection; otherwise, false.
	 */
	boolean intersects(Ray ray);
}
