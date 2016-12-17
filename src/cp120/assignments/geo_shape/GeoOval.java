/**
 * 
 */
package cp120.assignments.geo_shape;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * The GeoOval class defines an oval.
 * 
 * @author Jack Lisenko
 * @version 1.00, 20 November 2016
 */
public class GeoOval extends GeoRectangle {
	
	

	/**
	 * Constructor for GeoOval.
	 * 
	 * @param width
	 * @param height
	 */
	public GeoOval(double width, double height) {
		this(DEFAULT_ORIGIN, DEFAULT_COLOR, width, height);
	}

	/**
	 * Constructor for GeoOval.
	 * 
	 * @param origin
	 * @param color
	 * @param width
	 * @param height
	 */
	public GeoOval(GeoPoint origin, Color color, double width, double height) {
		super(origin, color, width, height);
	}

	/**
	 * Constructor for GeoOval.
	 * 
	 * @param origin
	 * @param width
	 * @param height
	 */
	public GeoOval(GeoPoint origin, double width, double height) {
		this(origin, DEFAULT_COLOR, width, height);
	}
	
	/**
	 * Returns the area of the oval.
	 * @return the area of the oval
	 */
	public double area() {
		double a = this.getHeight() / 2;
		double b = this.getWidth() / 2; 
		return a * b * Math.PI;
	}
	
	/**
	 * Returns the perimeter of the oval.
	 * @return the perimeter of the oval
	 */
	public double perimeter() {
		double a = this.getHeight() /2;
		double b = this.getWidth() / 2;
		double p = 2*Math.PI*Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2); 
		return p;
	}

	/* (non-Javadoc)
	 * Method to draw the Oval.
	 * @param gtx
	 * @see cp120.assignments.assignment006.GeoRectangle#draw(java.awt.Graphics2D)
	 */
	@Override
	public void draw(Graphics2D gtx) {
		String arg1 = super.toString();
		String output = String.format("Drawing oval: %s", arg1);
		System.out.println(output);
	}
}
