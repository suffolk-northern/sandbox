/*
 * Ryan Matthews
 *
 * Geometry
 */

package track_model;

import track_model.GlobalCoordinates;

// Connection of two points

public class Line
{
	private GlobalCoordinates begin;
	private GlobalCoordinates end;

	// Constructs a Line between begin and end points.
	//
	// Begin and end can be swapped with no change in meaning.
	public Line(GlobalCoordinates begin, GlobalCoordinates end)
	{
		this.begin = new GlobalCoordinates(begin);
		this.end   = new GlobalCoordinates(end);
	}

	// Returns the perpendicular distance to a point, in yards.
	//
	// Do not use for long distances (e.g. 100 miles).
	public double distanceTo(GlobalCoordinates point)
	{
		// Wikipedia article "Distance from a point to a line"
		//
		//   Heading "Line defined by two points"
		//
		//     for line between points p1 and p2
		//     and finding distance to point p0
		//
		//     simplified for p1 = (0.0, 0.0)

		double x0 = begin.xDistanceTo(point);
		double y0 = begin.yDistanceTo(point);

		double x1 = 0.0;
		double y1 = 0.0;

		double x2 = begin.xDistanceTo(end);
		double y2 = begin.yDistanceTo(end);

		double rise = y2 - y1;
		double run  = x2 - x1;

		double numerator = Math.abs(rise * x0 - run * y0);

		double denominator = Math.sqrt(rise * rise + run * run);

		return numerator / denominator;
	}
}
