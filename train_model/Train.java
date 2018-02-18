/*
 * Ryan Matthews
 *
 * Simulation
 */

package train_model;

import track_model.GlobalCoordinates;
import updater.Updateable;

// Physical simulation of a train vehicle

public class Train implements Updateable
{
	GlobalCoordinates location = new GlobalCoordinates(40.0, 80.0);

	// Updates this object.
	public void update()
	{
		location = location.addYards(0.0, 1.0);
	}

	// Returns the current location.
	//
	// Delayed by 500 ms.
	public GlobalCoordinates location()
	{
		return new GlobalCoordinates(location);
	}
}
