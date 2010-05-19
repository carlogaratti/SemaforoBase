
public class Comunicator {
	
	
	private FX300 fx300;

	public Comunicator(FX300 fx300) {
		this.fx300 = fx300;
	}
	
	public void on(State signal) {
			fx300.display(signal);
	}
}
