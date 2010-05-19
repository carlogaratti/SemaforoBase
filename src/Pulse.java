
public class Pulse {
	
	private Thread t;
	private PulseSemaphoreState pulseSemaphoreState;
	
	public Pulse(Thread t, PulseSemaphoreState pulseSemaphoreState) throws InterruptedException {
		this.t = t;
		this.pulseSemaphoreState = pulseSemaphoreState;
		startPulse();
	}
	
 public void startPulse() throws InterruptedException{
	 t.start();
	 pulse();
 }
 
 public int pulse() throws InterruptedException{
	 while(true){
		 pulseSemaphoreState.call();
		 t.sleep(1000);
	 }
 }
 
}
