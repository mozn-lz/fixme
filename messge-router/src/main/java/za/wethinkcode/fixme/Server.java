package za.wethinkcode.fixme;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private	ServerSocket socket;
	private	int			port;
	private	boolean 	running = false;

	public void Server(int port) {
		this.port = port;
	}
	public void startServer() {
		try {
			socket = new ServerSocket(port);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		// listen
		new Thread(new Runnable() {
			public void run() {
				while (running) {
					try {
						Socket client = socket.accept();
						System.out.println("Client has been found: " + client + ":" + port);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		running = true;
	}
	public void stopServer() {
		running = false;
	}
}