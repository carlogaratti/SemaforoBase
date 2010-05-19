public class Starter {

	public static void main(String[] args) throws InterruptedException {
	 
		
		GreenState green = new GreenState(new GreenSignal());
		YellowState yellow = new YellowState(new YellowSignal());
		RedState red = new RedState(new RedSignal());
		FX300 fx300 = new FX300();
		Comunicator com = new Comunicator(fx300);
		EightCircularCounter eCC = new EightCircularCounter();
		PulseSemaphoreState pss = new PulseSemaphoreState(com, eCC, yellow, red, green);
		Thread t = new Thread(); 
		Pulse pulse = new Pulse(t, pss);
	}
}
