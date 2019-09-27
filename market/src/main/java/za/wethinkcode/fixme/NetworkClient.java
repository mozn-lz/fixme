package za.wethinkcode.fixme;

import java.lang.reflect.Constructor;
import java.net.Socket;

/**
 * NetworkClient
 */
public class NetworkClient {

	private Socket  socket;
	private String  ipAddress;
	private int     serverPort;
	
	public NetworkClient (String ipAddress, int serverPort) {
		this.ipAddress = ipAddress;
		this.serverPort = serverPort;
	}
	public static void connectServer() {
		try {
			socket = new Socket(ipAddress, serverPort);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		new Thread()(new Runnable(){
			@Override
			public void run() {
				while (true) {
					
				}
			}
		}.start();
	}
	
}