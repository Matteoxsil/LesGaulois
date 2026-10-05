package objets;

public class Chaudron {
	private int quantitePotion=0;
	private int forcePotion=0;
	
	public Chaudron() {
		super();
	}

	public Boolean resterPotion() {
		return quantitePotion == 0;
	}

	public void remplirChaudron(int quantite, int forcePotion) {
		quantitePotion = quantite;
		this.forcePotion = forcePotion;
		
	}

	public int prendreLouche() {
		
		if(quantitePotion == 0) {
			forcePotion = 0;
		}
		quantitePotion -= 1;
		return forcePotion;
	}
	
	
}
