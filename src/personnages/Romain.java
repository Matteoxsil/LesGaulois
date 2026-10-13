package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
		}
	public String getNom() {
		return nom;
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
