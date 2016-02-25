package ValidatorOnline;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utiles.Teclado;

/**
 * 18. Copia el siguiente c�digo y comprueba su funcionamiento Entrega
 * TestValidatorOnline y compru�balo con las expresiones regulares: a. hola b. \
 * sHola c. hola{3} d. (hola){3} e. [hola]{3} f. .bat g. \ .bat h. \ \ .bat i. \
 * \ hola j. \ whola k. \ Whola l. ([A - Z][a - zA - Z]*) \ s \ 1 m. \ d \ d n.
 * \ b o. \ \ b Env�a el resultado de la ejecuci�n con dos entradas para cada
 * expresi�n: una que coincida y otra que no.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class TestValidatorOnline {

	public static void main(String[] args) {
		while (true) {
			Pattern pattern = Pattern.compile(Teclado.leerCadena("Introduce la expresi�n regular: "));
			Matcher matcher = pattern.matcher(Teclado.leerCadena("Introduce la cadena donde buscar: "));
			System.out.println("0123456789012345678901234567890123456789012345678901234567890123456789");
			boolean found = false;
			while (matcher.find()) {
				System.out.println("Se encontr� el texto " + matcher.group() + " que comienza en el �ndice "
						+ matcher.start() + " y finaliza en " + matcher.end());
				found = true;
			}
			if (!found) {
				System.out.println("No se encuentra coincidencia.");
			}
		}
	}
}
