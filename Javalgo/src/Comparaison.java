
public class Comparaison {

	public static void main(String[] args) {
		
		String chaine1 = "Développeur";
		String chaine2 = "Logiciel";
		
		int plusPetit = chaine1.compareTo(chaine2);
		
		if (plusPetit == 0) 
			{ System.out.println("Les 2 mots sont identiques."); }
			else if (plusPetit >= 1) 
				{ System.out.println(chaine1 + " est après " + chaine2); }
				else  
				{ System.out.println(chaine1 + " est avant " + chaine2); }
		
		
		/* Si nous n'avions que 2 valeurs possibles : */
		String reponse = (plusPetit<=-1? "Avant":"Egal ou après");
		System.out.println(reponse);

	}

}
