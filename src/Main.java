import java.util.Scanner;

public class Main {

	private static Scanner clavier;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		clavier = new Scanner(System.in);
		
		int nombre;
		String nombre2;
		
		System.out.print("Nombre:");
		nombre2 = clavier.nextLine();
		
		try{
			nombre = Integer.parseInt(nombre2);
			System.out.println(nombre*28);
		}
		catch(Exception erreur){
			System.out.println("erreur de saisie");
			System.out.println(erreur.toString());
		}
		
	}

}//COUCOU!!!!!!!!!!!!!!!!!!!
