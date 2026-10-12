package test_fonctionnel;

import personnages.Gaulois;
import village_gaulois.Village;

public class TestVillage {
	public void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village_des_irreductible = new Village("village des Irréductible", abraracourcix, 30);
		village_des_irreductible.trouverVillageois(30);
		Gaulois asterix = new Gaulois("astérix", 8);
		village_des_irreductible.ajouterVillageois(asterix);
		Gaulois gaulois = village_des_irreductible.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois= village_des_irreductible.trouverVillageois(2);
		System.out.println(gaulois);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village_des_irreductible.ajouterVillageois(obelix);
		village_des_irreductible.afficherVillage();
		Gaulois doublepolemix = new Gaulois("DoublePolémix", 4);
		System.out.println("chef : " + village_des_irreductible.getChef().getNom());
		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublepolemix.sePresenter();
	}
}
