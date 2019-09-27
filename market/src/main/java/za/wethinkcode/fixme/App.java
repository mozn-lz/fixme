package za.wethinkcode.fixme;

/**
 * Hello world!
 * ChattimusServer 	https://www.youtube.com/watch?v=wTWo2rUQhwk&list=PLE2vW4kTRjCAZ9QkpDehDLs_x6eFfTeOE&index=9
 */
public class App 
{
	
	public static App instance;
	
	public App () {
		
	}
	public static  App getInstance() {
		return instance;
	}
	public static void main( String[] args )
	{
		instance = new App();
	}
}
