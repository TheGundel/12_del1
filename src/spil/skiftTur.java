package spil;

public class skiftTur {

	private int check;
	
	public void skiftTur(){
		if(checkdobbelt){
			if(check == 1)
				check = 1;
			else if(check == 2)
				check = 2;
		}
		else{
			if(check == 1)
				check = 2;
			else if(check == 2)
				check = 1;
		}
	}
	private int getCheck(){
		return check;
	}
}
