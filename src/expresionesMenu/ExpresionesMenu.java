package expresionesMenu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utiles.Menu;
import utiles.Teclado;

/**
 * Implementa un program a que permit a comprobar cada un o de estos datos
 * mediante expresiones regulares: a. Dirección MAC b. Dirección IP c. Correo
 * electrónico d. Código postal e. Número de cuenta corriente f. DNI Para ello,
 * solicita al usuario tres entradas distintas, dejando claro el patrón que vas
 * a utilizar. Por ejemplo : Introduce una dirección MAC (XX:XX:XX:XX:XX:XX) La
 * dirección NO es correcta.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class ExpresionesMenu {
	static final String PATRON_MAC = "^(([0-9]{2}|[A-Z]{2}|[A-Z][0-9]|[0-9][A-Z])[:-]){5}([0-9]{2}|[A-Z]{2}|[A-Z][0-9]|[0-9][A-Z])$";
	static final String PATRON_IP = "^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
	static final String PATRON_EMAIL = "^([a-z]|[0-9])+@[a-z]+\\.com|es$";
	static final String PATRON_CPOSTAL = "^([1-4]\\d|0[1-9]|5[0-2])(\\d\\d[1-9]|\\d[1-9]\\d|[1-9]\\d\\d)$";
	static final String PATRON_CCORRIENTE = "^(([0-9]{4})[-\\s]){2}(([0-9]{2})[-\\s])([0-9]{10})$";
	static final String PATRON_DNI = "^[0-9]{8}[A-Z&&[^IOU]]$";

	public static void main(String[] args) {
		Menu menuExpresiones = new Menu("Menú de expresiones.", new String[] { "Dirección MAC.", "Dirección IP.",
				"Correo electrónico.", "Código postal.", "Número de cuenta corriente.", "DNI.", "Salir." });
		int opcion;
		do {
			opcion = menuExpresiones.gestionar();
			switch (opcion) {
			case 1:
				comprobarMAC();
				break;
			case 2:
				comprobarIP();
				break;
			case 3:
				comprobarEmail();
				break;
			case 4:
				comprobarCodigoPostal();
				break;
			case 5:
				comprobarCCorriente();
				break;
			case 6:
				comprobarDNI();
				break;
			case 7:
				System.out.println("Aaaadiooos..");
				break;
			}
		} while (opcion != 7);
	}

	private static void comprobarMAC() {
		Pattern patron = Pattern.compile(PATRON_MAC);
		Matcher matcher = patron.matcher(Teclado.leerCadena("Introduce una dirección MAC."));
		if (matcher.matches()) {
			System.out.println("La dirección MAC es correcta.");
		} else {
			System.out.println("La dirección MAC es incorrecta.");
		}
	}

	private static void comprobarIP() {
		Pattern patron = Pattern.compile(PATRON_IP);
		Matcher matcher = patron.matcher(Teclado.leerCadena("Introduce una dirección IPv4."));
		if (matcher.matches()) {
			System.out.println("La dirección IPv4 es correcta.");
		} else {
			System.out.println("La dirección IPv4 es incorrecta.");
		}
	}

	private static void comprobarEmail() {
		Pattern patron = Pattern.compile(PATRON_EMAIL);
		Matcher matcher = patron.matcher(Teclado.leerCadena("Introduce un email."));
		if (matcher.matches()) {
			System.out.println("El email es válido.");
		} else {
			System.out.println("El email no es válido.");
		}
	}

	private static void comprobarCodigoPostal() {
		Pattern patron = Pattern.compile(PATRON_CPOSTAL);
		Matcher matcher = patron.matcher(Teclado.leerCadena("Introduce un código postal."));
		if (matcher.matches()) {
			System.out.println("El código postal es válido.");
		} else {
			System.out.println("El código postal no es válido.");
		}
	}

	private static void comprobarCCorriente() {
		Pattern patron = Pattern.compile(PATRON_CCORRIENTE);
		Matcher matcher = patron.matcher(Teclado.leerCadena("Introduce una cuenta corriente."));
		if (matcher.matches()) {
			System.out.println("La cuenta corriente es válida.");
		} else {
			System.out.println("La cuenta corriente no es válida.");
		}
	}

	private static void comprobarDNI() {
		Pattern patron = Pattern.compile(PATRON_DNI);
		Matcher matcher = patron.matcher(Teclado.leerCadena("Introduce un DNI."));
		if (matcher.matches()) {
			System.out.println("El DNI es válido.");
		} else {
			System.out.println("El DNI no es válido.");
		}
	}
}
