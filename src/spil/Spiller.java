package spil;

public class Spiller {

	private int score;
	
	public int getScore(){
		return score;
	}

	public void setScore(int x){
		score += x;
	}
	

	public Spiller(int x){
		score = x;
	}
}
