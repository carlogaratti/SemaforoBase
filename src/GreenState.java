
public class GreenState extends State{

	private GreenSignal greenSignal;
	GreenState(GreenSignal gs) {
		this.greenSignal = gs;
	}
	
	public void dispose() {
		greenSignal.signal();
	}

}
