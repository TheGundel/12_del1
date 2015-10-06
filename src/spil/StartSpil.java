package spil;

import desktop_resources.GUI;
import desktop_fields.Field;
import desktop_fields.Shipping;
import desktop_fields.Street;
import desktop_fields.*;

public class StartSpil {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean loop = true;
		String tekst = "Tryk kast for at slå med terningerne";
		skiftTur skift = new skiftTur();  //Opret nødvendige klasser
		Spiller Spiller1 = new Spiller(0);
		Spiller Spiller2 = new Spiller(0);
		KastEvaluering Evaluer = new KastEvaluering();
		GUI.addPlayer("Spiller 1", Spiller1.getScore());
		GUI.addPlayer("Spiller 2", Spiller2.getScore());
		KastTerning kast1 = new KastTerning();
		KastTerning kast2 = new KastTerning();
		while(loop){
			if(GUI.getUserButtonPressed(tekst, "Kast").equals("Kast")){
				if(skift.getCheck()==1){
					kast1.kast();
					kast2.kast();
					GUI.setDice(kast1.getVærdi(), kast2.getVærdi());
					Spiller1.setScore(Evaluer.add(kast1.getVærdi(), kast2.getVærdi()));
					GUI.setBalance("Spiller 1", Spiller1.getScore());
					skift.skiftTur();
					tekst = "Spiller 2 skal slå med terningerne";
					if(Spiller1.getScore() >= 40){
						GUI.showMessage(VindSpil.win(1));
						StartSpil.main(args);
					}
				}
				else if(skift.getCheck()==2){
					kast1.kast();
					kast2.kast();
					GUI.setDice(kast1.getVærdi(), kast2.getVærdi());
					Spiller2.setScore(Evaluer.add(kast1.getVærdi(), kast2.getVærdi()));
					GUI.setBalance("Spiller 2", Spiller2.getScore());
					skift.skiftTur();
					tekst = "Spiller 1 skal slå med terningerne";
					if(Spiller2.getScore() >= 40){
						GUI.showMessage(VindSpil.win(2));
						StartSpil.main(args);
					}
				}
			}
			
		}
		
		
		
		
		
	}

}
