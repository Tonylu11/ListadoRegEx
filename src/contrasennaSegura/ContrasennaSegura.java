package contrasennaSegura;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utiles.Teclado;

/**
 * 20. Diseña una aplicaci ón en Java que reconozca una contraseña robusta (
 * tantas veces como el usuario quiera ) . S eg ún las directivas de nivel de
 * dominio de Microsoft , p ara que una contraseña sea considerada segura, ha de
 * cumplir una serie de instrucciones: a. La contraseña tendrá una longitud de
 * al menos seis caracteres. b. La contraseña contendrá caracteres de tres de
 * las cuatro categorías siguientes: i. Caracteres en mayúsculas (A – Z) ii.
 * Caracteres en minúsculas (a – z) iii. Base de 10 dígitos (0 – 9) iv.
 * Caracteres no alfanuméricos (por ejemplo: !, $, #, o %)
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class ContrasennaSegura {

	public static void main(String[] args) {
		Pattern patron = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})");
		Matcher matcher = patron.matcher(Teclado.leerCadena("Introduce tu contraseña.."));
		if (matcher.matches()) {
			System.out.println("La contraseña es segura.");
		} else {
			System.out.println("La contraseña no es segura.");
		}
	}
}
