
public class personne_Constructeur 
		{
			private String nom;
			private String prenom;
			private int age;
			
			/***
			 * Un constructeur sert à initialiser un objet : 
			 * 	 - il porte le même nom que la classe
			 * 	 - il n'est pas typé
			 * 	 - il doit être obligatoirement utilisé
			 * 	 - il peut y en avoir plusieurs (avec un nb d'arguments différents)
			 */
			public personne_Constructeur(String P, String N, int age)	
			{
				// this désigne l'objet courant.
				this.nom=N;
				this.prenom=P;
				// this permet aussi de lever les ambiguïtés lorsque qu'un attribut de l'objet et un argument
				// de la méthode porte le même nom.
				this.age=age;
			}

			public void ecrire()
				{
					System.out.println(prenom+","+nom+","+age);
				}


	public static void main (String[] arg)
		{
		// Pour initialiser un objet, et ainsi créer une référence : 
		personne_Constructeur client1= new personne_Constructeur ("Jean", "Le Bars", 20);
		/***
		 * Ceci a pour effet : 
		 * 	 - de créer un objet de type personne
		 * 	 - d'initialiser par défaut les attributs : prenom et nom à null, age à 0
		 *  Ces valeurs sont issues du constructeur par défaut qui est sans paramètre.
		 */
		client1.ecrire();
		// Les références d'objet : l'adresse de l'objet vs sa valeur
		// Explication du stockage des objets en mémoire
		personne_Constructeur client2 = client1;
		client2.ecrire();
	}

}