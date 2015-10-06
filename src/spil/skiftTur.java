package spil;

public class skiftTur {

	private int check;
	
	public static void skiftTur(){
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
	public int getCheck(){
		return check;
	}
}
