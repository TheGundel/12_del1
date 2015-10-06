package spil;

public class VindSpil {

	public static String win(int y){
		String x = "";
		if(y==1){
			x = ("Spiller1 har vundet");
		}
		else if(y==2)
			x = ("Spiller 2 har vundet");
		return x;
	}
}
