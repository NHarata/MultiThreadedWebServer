import java.io.* ;
import java.net.* ;
import java.util.* ;

public final class WebServer
{
	public static void main(String argv[]) throws Exception
	{
		// Set the port number.
		int port = 6789;
		// Establish the listen socket.
	    ServerSocket ILikeSocks = new ServerSocket(port);

	// Process HTTP service requests in an infinite loop.
	while (true) {
		// Listen for a TCP connection request.
		Socket DrawerOfSocks = ILikeSocks.accept();
		// Construct an object to process the HTTP request message.
		HttpRequest request = new HttpRequest(DrawerOfSocks);

		// Create a new thread to process the request.
		Thread thread = new Thread(request);

		// Start the thread.
		thread.start();
	}
	}
}

