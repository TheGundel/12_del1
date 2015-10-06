package spil;

public class skiftTur {

	private int check = 1;
	
	public void skiftTur(){
		if(check == 1)
			check = 2;
		else if(check == 2)
			check = 1;
	}
	public int getCheck(){
		return check;
	}
}
