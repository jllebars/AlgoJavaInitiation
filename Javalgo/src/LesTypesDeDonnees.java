/***
 * L'instruction import indique les classes externes dont le programme a besoins.
 * Ces classes sont dans des archives (paquetage - package). 
 */
// import java.lang.*; Cette classe est importée par défaut. Elle sert pour la classe System.
import java.io.*; // La classe io sert notamment pour out et println

public class LesTypesDeDonnees {

	/***
	 * Tout programme Java doit commencer par la fonction main.
	 */
	public static void main(String[] args)  throws IOException {
		/*** 
		 *  Le type String est une référence d'objet. Ainsi, chaineDeCaractere ne contient pas
		 *	la chaîne de caractère Bonjour, mais une référence (l'emplacement mémoire) vers 
		 *	l'adresse de l'objet.
		 	Une donnée est caractérisée par une adresse et une taille liée au type.			*/
		
				
// Les conversions
		String chaineDeCaractere = new String("12");
		System.out.println(chaineDeCaractere);
		
		/***
		 * 	Il est possible de convertir une chaîne de caractères en nombre. Pour cela, il faut
		 *  connaître les méthodes appropriées.	
		 */
		int nb = Integer.parseInt(chaineDeCaractere);
		System.out.println(nb);
		
		/***
		 * Pour convertir un nombre en chaîne de caractères : 
		 */
		int nb2 = 10;
		System.out.println(nb2);
		String conversion;
		conversion = ""+nb2;
		System.out.println(conversion);
	
		/***
		 * Un type de données plus complexe est le tableau.
		 * Attention, l'indice d'un tableau commence à 0 ! 
		 */
		String [][] tableau = new String[2][2];
		tableau[0][0] = "Jean";
		tableau[0][1] = "Lou";
		tableau[1][0] = "Marc";
		tableau[1][1] = "Antoine";
		
		/***
		 *  Exercice : convertissez la boucle for en boucle while.
		 *  - si on ne connait pas le nombre de répétition : while
		 *  Dans ce cas, la boucle peut ne pas s'éxecuter.
		 */
			int col1 = 0;
			int lg1 = 0;
			while (col1 < tableau[0].length)
				{
					while (lg1 < tableau[0].length)
					{
						System.out.println(tableau[col1][lg1]);
						lg1++;
					}
					col1++;
					lg1=0;
					
				}
				
		/* Le pendant de System.out est System.in, pour lire ce qui est tapé au clavier */
		/***
		 * Nous allons voir dans ce cadre la gestion des exceptions avec les clauses try/catch.
		 * Cette gestion est obligatoire pour rendre un programme Java résistant aux erreurs.
		 */
		// La classe BufferedReader lit un texte et le range en mémoire. Il faut importer
		// le paquetage io.
		BufferedReader texteTape = null ;
		try {
			texteTape = new BufferedReader(new InputStreamReader(System.in));
		}
		// e est un objet générique pour gérer tous les types d'exceptions.
		catch (Exception e)
		{
			// Pour écrire le message d'erreur
			System.err.println("Erreur " + e);
			// Pour arrêter le programme : 
			System.exit(1);
		}
		// On peut ajouter un finally pour vérifier que tout s'est bien passé.
		finally
			{ System.out.println("Exception bien gérée !"); }
		String ligne ;
		ligne = texteTape.readLine();
		System.out.println(ligne);
	}

}

/***
 *  Ecrivez un programme qui vous demande votre nom, votre prénom, votre date de naissance puis
*   qui calcule votre âge.
*   Gérez bien les exceptions, notamment si la date de naissance n'est pas correcte.
*/
