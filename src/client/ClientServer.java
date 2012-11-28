package client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientServer {

    public static void launch() {
	// launch clientside server.
	try {
	    ServerSocket cServer = new ServerSocket(4545);
	    // client server will listen on 4545, this next forever loop will
	    // listen for client connections to request downloads.
	    while (true) {
		Socket clientSocket = cServer.accept();
		ObjectOutputStream output = new ObjectOutputStream(
			clientSocket.getOutputStream());
		ObjectInputStream input = new ObjectInputStream(
			clientSocket.getInputStream());

	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}