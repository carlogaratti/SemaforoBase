
public class RedState extends State{
	RedSignal redSignal;
	RedState(RedSignal rs){
		this.redSignal = rs;
	}
	public void dispose() {
		redSignal.signal();
	}
}
