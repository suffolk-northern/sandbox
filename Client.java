import java.net.Socket;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			Socket socket = new Socket("localhost", 1234);

			BufferedWriter writer = new BufferedWriter(
				new OutputStreamWriter(
					socket.getOutputStream()
				)
			);

			writer.write("hi\n");
			writer.close();
		}
		catch (Exception e)
		{
			System.out.println("crashy crash");
		}
	}
}
