package test;

//Nous n'avons pas besoin de methode main dans une classe o� il n' y a pas de code � executer

public class Cuisine {
	//Declaration des variables 
	public static String tasse;
	public static String nom;
	public static String prenom;

	//Methode pour faire du caf�
       public static String machineCafe (String cafe, String eau,String bouton) {

		return cafe + eau + bouton + tasse + nom + prenom;
	}

}
