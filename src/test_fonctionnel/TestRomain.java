package test_fonctionnel;

import objets.Equipement;
import personnages.Romain;

public class TestRomain {
	void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		System.out.println(minus);
		System.out.println("les éqquipements des romains sont : ");
		for (Equipement equipement : Equipement.values()) {
			System.out.println(equipement);
		}
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		
		minus.sEquiper(Equipement.BOUCLIER);
	}
}
