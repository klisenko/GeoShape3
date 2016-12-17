/**
 * 
 */
package cp120.assignments.geo_shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 * The GeoLine class defines a line.
 * 
 * @author Jack R. Lisenko
 * @version 1.00, 20 November 2016
 */
public class GeoLine extends GeoShape {
	
	private GeoPoint end;

	/**
	 * Constructor for GeoShape.
	 * 
	 * @param origin
	 * @param color
	 * @param end
	 */
	public GeoLine(GeoPoint origin, Color color, GeoPoint end) {
		super(origin, color);
		this.end = end;
	}
	
	/**
	 * Constructor for GeoShape.
	 * 
	 * @param origin
	 * @param end
	 */
	public GeoLine(GeoPoint origin, GeoPoint end) {
		this(origin, DEFAULT_COLOR, end);
	}	
		
	/* (non-Javadoc)
	 * Method to draw the line.
	 * @param gtx
	 * @see cp120.assignments.geo_shape.GeoShape#draw(java.awt.Graphics2D)
	 */
	@Override
	public void draw(Graphics2D gtx) {
		String arg1 = this.toString();
		String output = String.format("Drawing line: %s", arg1);
		System.out.println(output);
		
		float xStart = this.getOrigin().getXco();
		float yStart = this.getOrigin().getYco();
		float xEnd = end.getXco();
		float yEnd = end.getYco();
		Line2D.Double line = new Line2D.Double(xStart, yStart, xEnd, yEnd);
		gtx.setColor(this.getColor());
		gtx.fill(line);
		gtx.draw(line);
	}

	/**
	 * Returns a GeoPoint of the end of the line.
	 * @return the end
	 */
	public GeoPoint getEnd() {
		return end;
	}

	/**
	 * Set the end of the line.
	 * @param end the end to set
	 */
	public void setEnd(GeoPoint end) {
		this.end = end;
	}

	/* 
	 * Returns a GeoPoint of the start of the line.
	 * @return origin
	 */
	public GeoPoint getStart() {
		return super.getOrigin();
	}

	/*
	 * Set the start of the line.
	 * @param origin
	 */
	public void setStart(GeoPoint origin) {
		super.setOrigin(origin);
	}
	
	/**
	 * Returns the length of the line.
	 * @return the length of the line
	 */
	public double length() {
		double distance = getStart().distance(end);		
		return distance;
	}
	
	/**
	 * Returns the slope of the line.
	 * @return the slope of the line
	 */
	public double slope() {
		float xEnd = end.getXco();
		float yEnd = end.getYco();
		float xStart = getStart().getXco();
		float yStart = getStart().getYco();
		double slope = (yEnd - yStart) / (xEnd -xStart);
		return slope;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * origin=(5.1,6.2),color=#ff0000,end=(-3.7,-5.4)
	 */
	@Override
	public String toString() {
		String arg1 = super.toString();
		String arg2 = end.toString();
		String output = String.format("%s,end=%s", arg1, arg2);
		return output;
	}
	
	

}
