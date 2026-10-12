package village_gaulois;

import java.util.Arrays;

import personnages.Gaulois;

public class Village {
	private String nom;
	public Gaulois getChef() {
		return chef;
	}

	private int NbVillageois = 0;
	private Gaulois chef = new Gaulois("personne", 0);
	private Gaulois[] villageois;
	public Village(String nom, Gaulois chef, final int NB_VILLAGEOIS_MAX) {
		super();
		this.nom = nom;
		this.chef = chef;
		chef.setVillage(this);
		villageois = new Gaulois[NB_VILLAGEOIS_MAX];
		
	}

	public String getNom() {
		return nom;
	}
	//private boolean 
	public void ajouterVillageois(Gaulois gaulois) {
		if (NbVillageois < villageois.length) {
			villageois[NbVillageois] = gaulois;
			NbVillageois++;
			gaulois.setVillage(this);
		}
		else {
			System.out.println("il n'y a plus de place dans ce village");
		}
	}
	public Gaulois trouverVillageois(int numVillageois) {
		if ((1 <= numVillageois) && (numVillageois <= NbVillageois)) {
			return villageois[numVillageois-1];
		}
		else {
			System.out.println("il n'y a pas autant d'habitant dans ce village");
			return null;
		}
	}
	
	public void afficherVillageois() {
		System.out.println("le chef s'appelle "+ chef);
		System.out.println("les autres villageois sont :");
		for (int i = 0; i < NbVillageois; i++) {
			System.out.println("- " + villageois[i]);
			//cela appele le tostring et renvoie donc leurs noms
			
		}
	}
	public void afficherVillage() {
		System.out.println("Village nom=" + nom + ", NbVillageois=" + NbVillageois);
		this.afficherVillageois();
	}

}
