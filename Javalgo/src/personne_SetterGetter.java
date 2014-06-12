
public class personne_SetterGetter 
		{
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
			public personne_SetterGetter(String P, String N, int age)	
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
		// Pour initialiser un objet, et ainsi cr�er une r�f�rence : 
		personne_SetterGetter client1= new personne_SetterGetter ("Jean", "Le Bars", 20);
		/***
		 * Ceci a pour effet : 
		 * 	 - de cr�er un objet de type personne
		 * 	 - d'initialiser par d�faut les attributs : prenom et nom � null, age � 0
		 *  Ces valeurs sont issues du constructeur par d�faut qui est sans param�tre.
		 */
		client1.ecrire();
		// Les r�f�rences d'objet : l'adresse de l'objet vs sa valeur
		// Explication du stockage des objets en m�moire
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