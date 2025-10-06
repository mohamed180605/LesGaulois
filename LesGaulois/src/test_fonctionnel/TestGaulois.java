package test_fonctionnel;

import personages.Gaulois;
import personages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		
		Gaulois obelix = new Gaulois("Obélix", 16);
		Romain minus  = new Romain("minus", 6) ;
		
		

		System.out.println("Le Gaulois " + asterix.getNom() + " : \"Bonjour Obélix.\"");
        System.out.println("Le Gaulois " + obelix.getNom() + " : \"Bonjour Astérix. Ça te dirait d'aller chasser des sangliers ?\"");
        System.out.println("Le Gaulois " + asterix.getNom() + " : \"Oui, très bonne idée.\"");
        
        
        System.out.println("Dans la foret " + asterix + "et " + obelix +" tombez nez a nez sur le romain " + minus.getNom());
        
        
        for (int  i=0 ; i< 3 ; i++) {
        	asterix.frapper(minus);
        }
        
	}
}
