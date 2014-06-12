
public class LesFonctions {
		public static void main(String[] arg)
		{
			String a="Développeur logiciel";
			parametreCar(a);
			System.out.println("Paramètre effectif a = "+a);
			int nb=1;
			parametreNb(nb);
			System.out.println("Paramètre effectif nb = "+nb);
		}
	
	private static void parametreCar(String a)
		{
			a="Infographiste Multimédia";
			System.out.println("Paramètre formel a = "+a);			
		}
	private static void parametreNb(int nb)
		{
			nb=99;
			System.out.println("Paramètre formel nb = "+nb);
		}
	}