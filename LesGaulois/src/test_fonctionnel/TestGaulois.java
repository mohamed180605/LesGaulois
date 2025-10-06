package test_fonctionnel;

import personages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		
		Gaulois obelix = new Gaulois("Obélix", 16);

		System.out.println("Le Gaulois " + asterix.getNom() + " : \"Bonjour Obélix.\"");
        System.out.println("Le Gaulois " + obelix.getNom() + " : \"Bonjour Astérix. Ça te dirait d'aller chasser des sangliers ?\"");
        System.out.println("Le Gaulois " + asterix.getNom() + " : \"Oui, très bonne idée.\"");
	}
}
