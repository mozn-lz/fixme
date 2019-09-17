package za.wethinkcode.fixme;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		ArrayList<String> clients = new ArrayList<String>();
		
	}

	int	createMarket()
	{
		int market_id = 100000;
		if (market_id >= 1000000) {
			market_id = 100000;
		}
          		return (market_id);
	}

	int createBroker()
	{
		int broker_id = 100000;
		if (broker_id >= 1000000) {
			broker_id = 100000;
		}
		return (broker_id++);
	}
}
