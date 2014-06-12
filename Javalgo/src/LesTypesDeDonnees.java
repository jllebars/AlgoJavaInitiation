/***
 * L'instruction import indique les classes externes dont le programme a besoins.
 * Ces classes sont dans des archives (paquetage - package). 
 */
// import java.lang.*; Cette classe est import�e par d�faut. Elle sert pour la classe System.
import java.io.*; // La classe io sert notamment pour out et println

public class LesTypesDeDonnees {

	/***
	 * Tout programme Java doit commencer par la fonction main.
	 */
	public static void main(String[] args)  throws IOException {
		/*** 
		 *  Le type String est une r�f�rence d'objet. Ainsi, chaineDeCaractere ne contient pas
		 *	la cha�ne de caract�re Bonjour, mais une r�f�rence (l'emplacement m�moire) vers 
		 *	l'adresse de l'objet.
		 	Une donn�e est caract�ris�e par une adresse et une taille li�e au type.			*/
		
				
// Les conversions
		String chaineDeCaractere = new String("12");
		System.out.println(chaineDeCaractere);
		
		/***
		 * 	Il est possible de convertir une cha�ne de caract�res en nombre. Pour cela, il faut
		 *  conna�tre les m�thodes appropri�es.	
		 */
		int nb = Integer.parseInt(chaineDeCaractere);
		System.out.println(nb);
		
		/***
		 * Pour convertir un nombre en cha�ne de caract�res : 
		 */
		int nb2 = 10;
		System.out.println(nb2);
		String conversion;
		conversion = ""+nb2;
		System.out.println(conversion);
	
		/***
		 * Un type de donn�es plus complexe est le tableau.
		 * Attention, l'indice d'un tableau commence � 0 ! 
		 */
		String [][] tableau = new String[2][2];
		tableau[0][0] = "Jean";
		tableau[0][1] = "Lou";
		tableau[1][0] = "Marc";
		tableau[1][1] = "Antoine";
		
		/***
		 *  Exercice : convertissez la boucle for en boucle while.
		 *  - si on ne connait pas le nombre de r�p�tition : while
		 *  Dans ce cas, la boucle peut ne pas s'�xecuter.
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
				
		/* Le pendant de System.out est System.in, pour lire ce qui est tap� au clavier */
		/***
		 * Nous allons voir dans ce cadre la gestion des exceptions avec les clauses try/catch.
		 * Cette gestion est obligatoire pour rendre un programme Java r�sistant aux erreurs.
		 */
		// La classe BufferedReader lit un texte et le range en m�moire. Il faut importer
		// le paquetage io.
		BufferedReader texteTape = null ;
		try {
			texteTape = new BufferedReader(new InputStreamReader(System.in));
		}
		// e est un objet g�n�rique pour g�rer tous les types d'exceptions.
		catch (Exception e)
		{
			// Pour �crire le message d'erreur
			System.err.println("Erreur " + e);
			// Pour arr�ter le programme : 
			System.exit(1);
		}
		// On peut ajouter un finally pour v�rifier que tout s'est bien pass�.
		finally
			{ System.out.println("Exception bien g�r�e !"); }
		String ligne ;
		ligne = texteTape.readLine();
		System.out.println(ligne);
	}

}

/***
 *  Ecrivez un programme qui vous demande votre nom, votre pr�nom, votre date de naissance puis
*   qui calcule votre �ge.
*   G�rez bien les exceptions, notamment si la date de naissance n'est pas correcte.
*/
