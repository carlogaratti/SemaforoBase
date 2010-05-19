
public class YellowState extends State{

	YellowSignal yellowSignal;
	YellowState(YellowSignal ys){
		this.yellowSignal = ys;
	}
	public void dispose() {
		yellowSignal.signal();
	}

}
