package spil;

public class KastTerning {

	private int værdi;
	
	public void kast(){
		double x = Math.random()*6+1;
		int y = (int)x;
		værdi = y;
	}
	
	public int getVærdi(){
		return værdi;
	}
}
