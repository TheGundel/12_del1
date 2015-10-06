package spil;

public class KastEvaluering {

	private int sumVærdi;
	private boolean checkDobbelt = false, trackDobbelt = false;

	public int add(int x, int y){
		if(x==y){
			checkDobbelt = true;
			if(x==6 && y==6){
				trackDobbelt=true;
			}
			else{
				trackDobbelt=false;
			}		
		}
		else{
			trackDobbelt=false;
		}
		checkWin()
		return x+y;
	}
}
