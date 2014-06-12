/***
 * Nous souhaitons compter le nombre de personnes (d'objets) cr��s.
 * Nous allons ajouter � notre classe un attribut et une m�thode.
 * L'attribut n'est pas propre � un objet personne. Il est propre � la classe. Dans ce cas, nous
 * utilisons le mot cl� static. Nous ferons de m�me pour la m�thode.
 */


public class personne_AttributClasse 
	{
			// Attribut de classe
			private static long nbPersonne = 0;
			// Nous avons ici des attributs d'objet.
			private String nom;
			private String prenom;
			private int age;
			
			/***
			 * Un constructeur sert � initialiser un objet : 
			 * 	 - il porte le m�me nom que la classe
			 * 	 - il n'est pas typ�
			 * 	 - il doit �tre obligatoirement utilis�
			 * 	 - il peut y en avoir plusieurs (avec un nb d'arguments diff�rents)
			 */
			public personne_AttributClasse(String P, String N, int age)	
			{
				// this d�signe l'objet courant.
				this.nom=N;
				this.prenom=P;
				// this permet aussi de lever les ambigu�t�s lorsque qu'un attribut de l'objet et un argument
				// de la m�thode porte le m�me nom.
				this.age=age;
				nbPersonne++;
			}

			public void ecrire()
				{
					System.out.println(prenom+","+nom+","+age);
				}
			// getter ou accesseurs
			public String getPrenom()
				{
					return prenom;
				}
			public String getNom()
				{
					return nom;
				}
			public int getAge()	
				{
					return age;
				}
			//Setter ou modificateurs
			public void setPrenom(String P)
				{
					this.prenom=P;
				}
			public void setNom(String N)
				{
					this.nom=N;
				}
			public void setAge(int age)	
				{
					this.age=age;
				}		
			// M�thode pour la classe => static
			public static long getNbPersonne()
				{
					return nbPersonne;
				}
	public static void main (String[] arg)
		{
		// Pour initialiser un objet, et ainsi cr�er une r�f�rence : 
		personne_AttributClasse client1= new personne_AttributClasse ("Jean", "Le Bars", 20);
		client1.ecrire();
		// Les r�f�rences d'objet : l'adresse de l'objet vs sa valeur
		// Explication du stockage des objets en m�moire
		personne_AttributClasse client2 = client1;
		client2.ecrire();
		int ageClient = client2.getAge();
		System.out.println(ageClient);
		client1.setAge(55);
		ageClient = client1.getAge();
		System.out.println(ageClient);
		client1.ecrire();
		client2.ecrire();
		System.out.println("Nombre de clients cr��s : " + personne_AttributClasse.getNbPersonne());
		
		// Il est aussi possible de cr�er un tableau de personne en indiquant que la classe est de type []
		personne_AttributClasse[] amis=new personne_AttributClasse[3];
		System.out.println("----------------");
		amis[0]=new personne_AttributClasse("Jean","Dupont",30);
		amis[1]=new personne_AttributClasse("Sylvie","Vartan",52);
		amis[2]=new personne_AttributClasse("Neil","Armstrong",66);
		int i;
		for(i=0;i<amis.length;i++)
			amis[i].ecrire();
		}

}