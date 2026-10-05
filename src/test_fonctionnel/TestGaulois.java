package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		asterix.parler("bonjour " + obelix.getNom()+ "." );
				
		obelix.parler("Bonjour " + asterix.getNom() + ". ça te dirai d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
		
		Romain minus = new Romain("Minus", 6);
		System.out.println("dans la foret " + asterix + " et " + obelix + " tombe nez à nez sur le romain "+ minus);
		
		for(int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
		
		Romain brutus = new Romain("Brutus", 14);
		Druide panoramix = new Druide("Panoramix", 2);
		panoramix.fabriquerPotion(4, 3);
		panoramix.boosterGaulois(obelix);
		panoramix.boosterGaulois(asterix);
		for(int j = 0; j < 3; j++) {
			asterix.frapper(brutus);
		}
		
	}
}
