
// imports
import java.io.*;

public class Exercice1_Console_NomPrenom {

	public static void main(String[] args) {
		BufferedReader IN= new BufferedReader(new InputStreamReader(System.in));
		String nom=null,prenom=null;
		int age=0;
		boolean ageCorrect=false;
		
		System.out.print("Votre nom : ");
		try
			{
				nom=IN.readLine();
			}
		catch(Exception ex){}
		
		System.out.print("Votre prénom : ");
		try
			{
				prenom=IN.readLine();
			}
		catch(Exception ex){}
		
		while (! ageCorrect)
			{
				System.out.print("Votre âge : ");
			try
				{
					age=Integer.parseInt(IN.readLine());
					ageCorrect=true;
				}
			catch(Exception ex) 
				{
					System.err.println("Votre âge n'est pas correct. Retapez-le. Merci.");
					System.out.println("");
				}
			}
		System.out.println("Votre nom : " + nom);
		System.out.println("Votre prénom : " + prenom);
		System.out.println("Votre age : " + age);
	}
}

/***
*  Pour compiler un programme sous DOS, il faut configurer le PATH.
*  Déplacez le pointeur de la souris vers l'angle inférieur droit de l'écran.
*  Cliquez sur l'icône Rechercher et saisissez "Panneau de configuration".
*  Cliquez sur Panneau de configuration -> Système -> Avancé
*  Cliquez sur Variables d'environnement, puis, sous Variables système, recherchez la valeur PATH et cliquez dessus.
*  Dans la fenêtre d'édition, modifiez PATH en ajoutant l'emplacement de la classe à la valeur de PATH. Si l'élément PATH n'est pas disponible, vous pouvez ajouter une nouvelle variable et ajouter PATH en tant que nom et l'emplacement de la classe en tant que valeur.
*  Fermez la fenêtre.
*  Ouvrez à nouveau la fenêtre d'invite de commande et exécutez votre code Java. 
*/