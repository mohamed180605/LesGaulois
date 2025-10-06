package personages;

public class Gaulois {
	private String nom ;
	private int force ;
	public Gaulois(String nom , int force ) {
		this.nom = nom;
		this.force = force ;
		
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole () + "\"" +texte + "\"");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
	}
	@Override
	public String toString() {
		return nom;
	} 
	
	/*public String toString() {
		// TODO Auto-generated method stub
		return "Gaulois [nom=" + nom + " , force=" + force + "]";
	}*/
	
	///// TP1 POO
	
	
	public void frapper(Romain romain) {
		
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force /3);
		
	}
	
	
		
	
}
