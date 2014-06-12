/***
 * Une classe est constitu�e : 
 *	 - d'attributs : variables
 *	 - de m�thodes : fonctions
 *	Nous allons cr�er une classe personne.
 */
class personne
	{
		// Les attributs
		/* Un attributs est private lorsqu'il n'est pas n�cessaire qu'il soit connu � l'ext�rieur
		 * de la classe. Il n'est de plus accessible qu'� l'int�rieur de cette classe.
		 * Il n'est pas possible de le modifier (sauf pour le programmeur).
		 * Les autres mots-cl�s sont : 
		 * 	 - public : accessible � l'ext�rieur de la classe (cf. les m�thodes)
		 * 	 - protected : accessible en interne o� dans des objets h�rit�s
		 * Dans la majorit� des cas, les attributs sont priv�s.
		 * Nous avons dans le cas pr�sent des attributs d'objet.
		 */
		private String nom;
		private String prenom;
		private int age;
		
		// Les m�thodes : m�thode d'objet
		public void affecter(String P, String N, int age)	
		{
			// this d�signe l'objet courant.
			this.nom=N;
			this.prenom=P;
			// this permet aussi de lever les ambigu�t�s lorsque qu'un attribut de l'objet et un argument
			// de la m�thode porte le m�me nom.
			this.age=age;
		}

		public void ecrire()
			{
				System.out.println(prenom+","+nom+","+age);
			}


public static void main (String[] arg)
	{
	// Pour initialiser un objet, et ainsi cr�er une r�f�rence : 
	personne client1= new personne();
	/***
	 * Ceci a pour effet : 
	 * 	 - de cr�er un objet de type personne
	 * 	 - d'initialiser par d�faut les attributs : prenom et nom � null, age � 0
	 *  Ces valeurs sont issues du constructeur par d�faut qui est sans param�tre.
	 */
	client1.affecter("Jean", "Le Bars", 20);
	client1.ecrire();
}

}