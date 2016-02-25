package contrasennaSegura;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utiles.Teclado;

/**
 * 20. Dise�a una aplicaci �n en Java que reconozca una contrase�a robusta (
 * tantas veces como el usuario quiera ) . S eg �n las directivas de nivel de
 * dominio de Microsoft , p ara que una contrase�a sea considerada segura, ha de
 * cumplir una serie de instrucciones: a. La contrase�a tendr� una longitud de
 * al menos seis caracteres. b. La contrase�a contendr� caracteres de tres de
 * las cuatro categor�as siguientes: i. Caracteres en may�sculas (A � Z) ii.
 * Caracteres en min�sculas (a � z) iii. Base de 10 d�gitos (0 � 9) iv.
 * Caracteres no alfanum�ricos (por ejemplo: !, $, #, o %)
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class ContrasennaSegura {

	public static void main(String[] args) {
		Pattern patron = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})");
		Matcher matcher = patron.matcher(Teclado.leerCadena("Introduce tu contrase�a.."));
		if (matcher.matches()) {
			System.out.println("La contrase�a es segura.");
		} else {
			System.out.println("La contrase�a no es segura.");
		}
	}
}
