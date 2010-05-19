import java.util.HashMap;
import java.util.Map;


public class PulseSemaphoreState {
	
	private EightCircularCounter eCC;
	private Comunicator comn;
	private GreenState green;
	private YellowState yellow;
	private RedState red;
	private Map map;
	
	
	public PulseSemaphoreState(Comunicator comn, EightCircularCounter ecc, YellowState yellow, RedState red, GreenState green) {
		this.comn = comn;
		this.eCC = ecc;
		this.green = green;
		this.yellow = yellow;
		this.red = red;
		map = new HashMap<Integer, State>();
		map.put(0, green);
		map.put(5, yellow);
		map.put(6, red);
	}
	
	
	public void call(){
		Integer i = eCC.getCount();
		if (map.containsKey(i))
			comn.on((State)map.get(i));	
	}
	
}
