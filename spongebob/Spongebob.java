/*
 * Ryan Matthews
 *
 * Updater demonstration
 */

package spongebob;

import updater.Updateable;

// Spongebob module

public class Spongebob implements Updateable
{
	// true if ready to rumble, else false
	public static boolean readyToRumble = false;

	// Updates this object.
	public void update()
	{
		readyToRumble = !readyToRumble;
	}
}
