package za.wethinkcode.fixme;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		ArrayList<String> clients = new ArrayList<String>();
		/*
		* broker 5000
		* market 5001
		*/
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Binding ports\n");
		Server broker_server = new Server(5000);
		Server market_server = new Server(5001);

		broker_server.startServer();
		market_server.startServer();

		
		String cmd  = in.nextLine();
	if (cmd == "qbs") {
		broker_server.stopServer();
	}
	if (cmd == "qms") {
		market_server.stopServer();
	}
	}

	public void registerEntity(String type) {
		if (type == "market") {
			createMarket();
		} else if (type == "broker") {
			createBroker();
		}
	}

	private int	createMarket()
	{
		int market_id = 100000;
		if (market_id >= 1000000) {
			market_id = 100000;
		}
		return (market_id);
	}

	private int createBroker()
	{
		int broker_id = 100000;
		if (broker_id >= 1000000) {
			broker_id = 100000;
		}
		return (broker_id++);
	}
}
