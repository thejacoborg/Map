import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import net.sf.json.*;


public class Data {
	private ArrayList<PlayerData> data;
	private Calendar time;
	JSONObject raw;
	
	public Data() {
		time = Calendar.getInstance();
	}
	public Data(String data) {
		read(data);
	}
	
	public void add(PlayerData p) {
		data.add(p);
	}
	public Calendar getTime() {
		return time;
	}
	public static Data read(String d) {
		JSONObject file = JSONOb
		return data;
	}
}
