package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		asterix.parler("bonjour " + obelix.getNom()+ "." );
				
		obelix.parler("Bonjour " + asterix.getNom() + ". ça te dirai d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
	}
}
