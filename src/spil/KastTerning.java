package spil;

public class KastTerning {

	private int værdi;
	
	public static int kast(){
		double x = Math.random()*6+1;
		int y = (int)x;
		return y;
	}
}
