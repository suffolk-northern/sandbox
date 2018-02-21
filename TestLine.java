/*
 * Ryan Matthews
 *
 * Basic demonstration of Line.
 */

import track_model.GlobalCoordinates;
import track_model.Line;

public class TestLine
{
	public static void main(String[] args)
	{
		vertical();
		System.out.println();
		diagonal();
	}

	// for vertical line
	public static void vertical()
	{
		Line line = new Line(
			new GlobalCoordinates(1.0, 1.0),
			new GlobalCoordinates(2.0, 1.0)
		);

		GlobalCoordinates midpoint = new GlobalCoordinates(1.5, 1.0);

		GlobalCoordinates west1  = midpoint.addYards( 0.0, -1.0);
		GlobalCoordinates east2  = midpoint.addYards( 0.0,  2.0);
		GlobalCoordinates south1 = midpoint.addYards(-1.0, 0.0);

		System.out.printf(
			"distance from line vertical line:\n" +
			"  to 1 yard  west  of midpoint: %.1f yards\n" +
			"  to 2 yards east  of midpoint: %.1f yards\n" +
			"  to 1 yard  south of midpoint: %.1f yards\n",
			line.distanceTo(west1),
			line.distanceTo(east2),
			line.distanceTo(south1)
		);
	}

	// for diagonal line
	public static void diagonal()
	{
		Line line = new Line(
			new GlobalCoordinates(1.0, 1.0),
			new GlobalCoordinates(2.0, 2.0)
		);

		GlobalCoordinates midpoint = new GlobalCoordinates(1.5, 1.5);

		GlobalCoordinates west1  = midpoint.addYards( 0.0, -1.0);
		GlobalCoordinates east2  = midpoint.addYards( 0.0,  2.0);
		GlobalCoordinates south1 = midpoint.addYards(-1.0, 0.0);

		System.out.printf(
			"distance from diagonal line:\n" +
			"  to 1 yard  west  of midpoint: %.1f yards\n" +
			"  to 2 yards east  of midpoint: %.1f yards\n" +
			"  to 1 yard  south of midpoint: %.1f yards\n",
			line.distanceTo(west1),
			line.distanceTo(east2),
			line.distanceTo(south1)
		);
	}
}
