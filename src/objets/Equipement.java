package objets;

public enum Equipement {
	CASQUE("des Casques"), BOUCLIER("Des boucliers");
	
	private String nom;

	private Equipement(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}
	
}
