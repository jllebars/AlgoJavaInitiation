
public class personne_SetterGetter 
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
			public personne_SetterGetter(String P, String N, int age)	
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
			
	public static void main (String[] arg)
		{
		// Pour initialiser un objet, et ainsi créer une référence : 
		personne_SetterGetter client1= new personne_SetterGetter ("Jean", "Le Bars", 20);
		/***
		 * Ceci a pour effet : 
		 * 	 - de créer un objet de type personne
		 * 	 - d'initialiser par défaut les attributs : prenom et nom à null, age à 0
		 *  Ces valeurs sont issues du constructeur par défaut qui est sans paramètre.
		 */
		client1.ecrire();
		// Les références d'objet : l'adresse de l'objet vs sa valeur
		// Explication du stockage des objets en mémoire
		personne_SetterGetter client2 = client1;
		client2.ecrire();
		int ageClient = client2.getAge();
		System.out.println(ageClient);
		client1.setAge(55);
		ageClient = client1.getAge();
		System.out.println(ageClient);
		client1.ecrire();
		client2.ecrire();
		}

}