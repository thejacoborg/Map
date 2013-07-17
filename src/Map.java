import java.net.URL;


public class Map extends Thread {
	public final int PAUSE;
	
	private URL url;
	private boolean stop;
	
	public Map(URL url) {
		this.setUrl(url);
		stop = false;
		PAUSE = 5000;
	}
	public Map(URL url, int pause) {
		this.PAUSE = pause;
	}
	
	public URL getUrl() {
		return url;
	}
	public void setUrl(URL url) {
		this.url = url;
	}
	public void run() {
		while(!stop) {
			fetch();
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void fetch() {
		
	}
}
