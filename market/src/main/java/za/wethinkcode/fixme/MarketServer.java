package za.wethinkcode.fixme;

/**
 * MarketServer
 */
public class MarketServer {
	
	private NetworkClient client;

	public MarketServer(){
        System.out.println( "Hello World!" );
        client = new NetworkClient("127.0.0.1", 5001);
        client.connectToServer();
		
	}
}