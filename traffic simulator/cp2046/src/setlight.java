import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class setlight {
	private light currentlight;

	public setlight() {
	     currentlight = light.S2N;
	       currentlight.light();
	        ScheduledExecutorService timer = Executors.newScheduledThreadPool(1);
	        timer.scheduleAtFixedRate(
	                new Runnable() {
	                    public void run() {
	                        currentLamp = currentLamp.blackOut();
	                    }},
	                10,
	                10,
	                TimeUnit.SECONDS);
	    }
	

}
