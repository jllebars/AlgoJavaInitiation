
public class LesFonctions {
		public static void main(String[] arg)
		{
			String a="D�veloppeur logiciel";
			parametreCar(a);
			System.out.println("Param�tre effectif a = "+a);
			int nb=1;
			parametreNb(nb);
			System.out.println("Param�tre effectif nb = "+nb);
		}
	
	private static void parametreCar(String a)
		{
			a="Infographiste Multim�dia";
			System.out.println("Param�tre formel a = "+a);			
		}
	private static void parametreNb(int nb)
		{
			nb=99;
			System.out.println("Param�tre formel nb = "+nb);
		}
	}