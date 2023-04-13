import java.util.*;
public class H7E6 {
	public static void main(String[] args) {
               // prueba con estas frases  " A luna ese anula.       " , "  A Mercedes, ese de crema.        " 


		String frase = "     A mamá, Roma le aviva él amor a papá, y a papá, Roma le aviva el amor a mamá  ";
		esPolindromo(frase);

	}

	public static void esPolindromo(String p) {
		String fraseReversa = "";
		String frase = p.toLowerCase().trim().replace(" ", "")
				.replace(".", "").replace(",","").replace("á","a")
				.replace("é","e").replace("í","i").replace("ó","o")
				.replace("ú","u");

		
		
		for (int i = frase.length() - 1; i >= 0; i--) {
			fraseReversa += frase.charAt(i);
		}

		if (frase.equals(fraseReversa)) {
			System.out.println("la frase es palindroma");
		} else {
			System.out.println("la frase no es palindroma");
		}
	}


	
}