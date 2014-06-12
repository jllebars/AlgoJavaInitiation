
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
		
		System.out.print("Votre pr�nom : ");
		try
			{
				prenom=IN.readLine();
			}
		catch(Exception ex){}
		
		while (! ageCorrect)
			{
				System.out.print("Votre �ge : ");
			try
				{
					age=Integer.parseInt(IN.readLine());
					ageCorrect=true;
				}
			catch(Exception ex) 
				{
					System.err.println("Votre �ge n'est pas correct. Retapez-le. Merci.");
					System.out.println("");
				}
			}
		System.out.println("Votre nom : " + nom);
		System.out.println("Votre pr�nom : " + prenom);
		System.out.println("Votre age : " + age);
	}
}

/***
*  Pour compiler un programme sous DOS, il faut configurer le PATH.
*  D�placez le pointeur de la souris vers l'angle inf�rieur droit de l'�cran.
*  Cliquez sur l'ic�ne Rechercher et saisissez "Panneau de configuration".
*  Cliquez sur Panneau de configuration -> Syst�me -> Avanc�
*  Cliquez sur Variables d'environnement, puis, sous Variables syst�me, recherchez la valeur PATH et cliquez dessus.
*  Dans la fen�tre d'�dition, modifiez PATH en ajoutant l'emplacement de la classe � la valeur de PATH. Si l'�l�ment PATH n'est pas disponible, vous pouvez ajouter une nouvelle variable et ajouter PATH en tant que nom et l'emplacement de la classe en tant que valeur.
*  Fermez la fen�tre.
*  Ouvrez � nouveau la fen�tre d'invite de commande et ex�cutez votre code Java. 
*/