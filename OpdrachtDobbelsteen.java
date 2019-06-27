import java.util.Random;

public class OpdrachtDobbelsteen {
	private int win;
	private int currentRoll;
	
	public OpdrachtDobbelsteen(){
		this.win = 0;
		this.currentRoll = 0;
	}
	
	public void roll() {
		Random rand = new Random();
		this.currentRoll = rand.nextInt(6) + 1;
	}
	
	public void setWin(){
		this.win++;
	}
	
	public int getRoll(){
		return this.currentRoll;
	}
	
	public int getWin(){
		return this.win;
	}
}
