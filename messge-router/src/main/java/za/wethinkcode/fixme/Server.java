package za.wethinkcode.fixme;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	Scanner in = new Scanner(System.in);

	private	ServerSocket	socket;
	private	int				port;
	private	boolean			running = false;

	public Server(int port) {
		this.port = port;
	}
	public void startServer() {
		try {
			socket = new ServerSocket(port);
			// .configureBlocking(false)
			System.out.println("Socket " + port + " created");
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		// listen
		new Thread(new Runnable() {
			public void run() {
				while (running) {
					try {
						System.out.println("waiting for connection " + port);
						Socket client = socket.accept();
						System.out.println("Client has been found: " + client + ":" + port);
						System.out.println("Type 'q' to shutdown server");
						String cmd  = in.nextLine();
						if (cmd == "q") {
							stopServer();
						}
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