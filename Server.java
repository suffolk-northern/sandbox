import java.net.Socket;
import java.net.ServerSocket;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Server
{
	public static void main(String[] args)
	{
		try {
			ServerSocket server = new ServerSocket(1234);

			while (true) {
				Socket clientSocket = server.accept();

				BufferedReader reader = new BufferedReader(
					new InputStreamReader(
						clientSocket.getInputStream()
					)
				);

				System.out.println(reader.readLine());

				reader.close();
			}
		} catch (Exception e) {
			System.out.println("crashy crash");
		}
	}
}
