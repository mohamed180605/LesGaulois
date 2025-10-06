package personages;

public class Romain {
	private String nom ;
	private int force ;
	public Romain(String nom , int force ) {
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
		return "Le romain " + nom + " : ";
		
	}
	
	//// TP1 POO
	public void recevoirCoup(int forceCoup) {
		 force -=forceCoup ;
		 if ( force > 0) {
			 System.out.println( nom + " : Aie !");
		}
		 else {
			 System.out.println(nom + "J'abondonne...");
		 }
	}
}


