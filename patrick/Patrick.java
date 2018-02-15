/*
 * Ryan Matthews
 *
 * Updater demonstration
 */

package patrick;

import spongebob.Spongebob;
import updater.Updateable;

// Patrick Star module

public class Patrick implements Updateable
{
	private final String ANNOUNCEMENT =
		"Patrick: Spongebob is READY TO RUMBLE";

	// Spongebob to watch for readiness to rumble
	private Spongebob spongebob;

	// Constructs a Patrick who listens to a Spongebob.
	public Patrick(Spongebob spongebob)
	{
		this.spongebob = spongebob;
	}

	// Updates this object.
	public void update()
	{
		if (spongebob.readyToRumble())
			System.out.println(ANNOUNCEMENT);
	}
}
