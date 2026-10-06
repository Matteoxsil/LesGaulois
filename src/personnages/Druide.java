package personnages;

import objets.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron();
	
	
	public Druide(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String txt) {
		System.out.println(prendreParole()+ "\""+ txt+ "\"");
	}

	private String prendreParole() {
		
		return "Le Druide "+ nom + ":";
	}
	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté " + quantite + " doses de potion magiqe de force "+ forcePotion + ".");
		
		
	}
	
	public void boosterGaulois(Gaulois gaulois) {
		Boolean contientPotion = chaudron.resterPotion();
		String nomGaulois = gaulois.getNom();
		if(contientPotion) {
			if(nomGaulois == "Obélix") {
				parler("Non " + nomGaulois + " non et tu le sais très bien");
				
			}
			else {
				int forcePotion = chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
				parler("tiens " + nomGaulois + " un peu de potion magique.");
				
			}
		}
		else {
			parler("désolé "+ nomGaulois + " il n'y a plus une seule goutte de potion magique.");
		}
		
	}
}
