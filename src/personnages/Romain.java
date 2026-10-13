package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
		}
	public String getNom() {
		return nom;
	}
	private Equipement equipementPorté() {
		assert nbEquipement ==1;
		for (Equipement equipement : equipements) {
			if(equipement != null)
				return equipement;
		}
		return null;
	}
	private void ajouterEquipement(Equipement equipement_a_ajouter) {
		if (equipement_a_ajouter == Equipement.CASQUE) {
			this.equipements[0] = equipement_a_ajouter;
			nbEquipement++;
		}
		else {
			this.equipements[1] = equipement_a_ajouter;
			nbEquipement++;
		}
		System.out.println("le soldat "+ nom + " s'équipe d'un "+ equipement_a_ajouter+ ".");
	}
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 0:
			ajouterEquipement(equipement);
			
			break;
		case 1:
			if(equipementPorté() == equipement)
				System.out.println("le soldat "+nom+" possède déjà un "+equipement+" !");
			else {
				ajouterEquipement(equipement);
			}
			break;
		default:
			System.out.println("le soldat "+nom+" est déjà bien protégé !");
			
			
		}
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	@Override
	public String toString() {
		return nom;
	}
	public void recevoirCoup(int i) {
		assert i >=0; //précondition 
		int force_avant = force;
		force -= i;
		if(force <= 0) {
			force = 0;
			parler("J'abandonne !");
		}
		else {
			parler("Aïe");
		}
		
		assert isInvariantVerified();//invariant
		assert force_avant <= force; //post condi
		
	}
	private boolean isInvariantVerified() {
		return force >= 0;
		
	}
	
	
	
}
