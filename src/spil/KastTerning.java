package spil;

public class KastTerning {

	private int v�rdi;
	
	public void kast(){
		double x = Math.random()*6+1;
		int y = (int)x;
		v�rdi = y;
	}
	
	public int getV�rdi(){
		return v�rdi;
	}
}
