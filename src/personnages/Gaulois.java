package personnages;

import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village = null;
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	private String getSituationVillage() {
		String situation_pro;
		if (village == null) {
			situation_pro = "je voyage de village en villages...";
			
			
			}
		else {
			if (village.getChef() == this) {
				situation_pro = " je suis chef du village " + village.getNom();
				
			}
			else {
				situation_pro = "je suis habitant du village " + village.getNom();
			}
		}
		return situation_pro;
	}
	
	public void sePresenter() {
		String situation_pro = getSituationVillage();
		parler("bonjour, je m'appelle "+ nom +" et "+ situation_pro);
		
	}
	public void setVillage(Village village) {
		this.village = village;
		
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
		return "Le gaulois "+ nom + " : ";
	}
	
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}
	
	@Override
	public String toString() {
		return nom;
	}
	
	public void frapper(Romain romain) {
		
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force*effetPotion)/3);
		if( effetPotion > 1) {
			effetPotion--;
		}
		}
	
	
	void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
	}
	
}
