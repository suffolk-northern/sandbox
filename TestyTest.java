/*
 * Ryan Matthews
 *
 * Demonstration of basic Updater.
 */

import patrick.Patrick;
import spongebob.Spongebob;
import updater.Updateable;
import updater.Updater;

public class TestyTest
{
	public static void main(String[] args)
	{
		Spongebob spongebob = new Spongebob();
		Patrick patrick = new Patrick(spongebob);

		Updateable[] objects = new Updateable[2];
		objects[0] = spongebob;
		objects[1] = patrick;

		Updater updater = new Updater(objects);

		for (;;) {
			updater.iteration();

			// hand-wave the timing
			try {
				Thread.sleep(250);
			}
			catch (InterruptedException e)
			{
				// let it be
			}
		}
	}
}
