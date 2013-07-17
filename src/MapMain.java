import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class MapMain {
	public static void main(String args[]) {
		URL mapURL = null;
		Map map;
		Scanner s = new Scanner(System.in);
		boolean valid = false;
		if(args.length>0) {
			try {
				mapURL = new URL(args[0]);
				valid = true;
			} catch(MalformedURLException e) {
				valid = false;
			}
			
		}
		if(args.length==0 || !valid) {
			boolean esc = false;
			while(!esc) {	
				System.out.println("What is the full url of the map.json file?");
				try {
					mapURL = new URL(s.next());
					esc = true;
				} catch (MalformedURLException e) {
					System.out.println("Invalid url");
				}
			}
		}
		map = new Map(mapURL);
		
		System.out.println("Map Data Retrieval System");
		System.out.println("Type 'help' for help");
		boolean esc = false;
		while(!esc) {
			
			String cmd = s.nextLine();
			if(cmd.equalsIgnoreCase("help")) {
				System.out.println("[= = = =]  Help  [= = = =]");
				System.out.println("help - lists commands");
				System.out.println("info [name] - shows all information about player 'name'");
				System.out.println("data <time> - outputs the raw data from specifified time. If time is not specified shows most recent data");
				System.out.println("within [locX] [locZ] <[timeBegin] [timeEnd]> - finds all the players who journeyed within the specified area between specified times");
			}
			else if(cmd.equalsIgnoreCase("data")) {
				
			}
		}
	}
}
