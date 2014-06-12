/***
 * Une classe est constituée : 
 *	 - d'attributs : variables
 *	 - de méthodes : fonctions
 *	Nous allons créer une classe personne.
 */
class personne
	{
		// Les attributs
		/* Un attributs est private lorsqu'il n'est pas nécessaire qu'il soit connu à l'extérieur
		 * de la classe. Il n'est de plus accessible qu'à l'intérieur de cette classe.
		 * Il n'est pas possible de le modifier (sauf pour le programmeur).
		 * Les autres mots-clés sont : 
		 * 	 - public : accessible à l'extérieur de la classe (cf. les méthodes)
		 * 	 - protected : accessible en interne où dans des objets hérités
		 * Dans la majorité des cas, les attributs sont privés.
		 * Nous avons dans le cas présent des attributs d'objet.
		 */
		private String nom;
		private String prenom;
		private int age;
		
		// Les méthodes : méthode d'objet
		public void affecter(String P, String N, int age)	
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
	personne client1= new personne();
	/***
	 * Ceci a pour effet : 
	 * 	 - de créer un objet de type personne
	 * 	 - d'initialiser par défaut les attributs : prenom et nom à null, age à 0
	 *  Ces valeurs sont issues du constructeur par défaut qui est sans paramètre.
	 */
	client1.affecter("Jean", "Le Bars", 20);
	client1.ecrire();
}

}