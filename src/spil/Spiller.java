package spil;

public class Spiller {

	private String navn ="";
	private int score;
	
	public int getScore(){
		return score;
	}
	
	public String getNavn(){
		return navn;
	}

	public void setScore(int x){
		score += x;
	}
	
	public void setNavn(String y){
		navn = y;
	}
}
