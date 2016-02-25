package expresionesMenu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utiles.Menu;
import utiles.Teclado;

/**
 * Implementa un program a que permit a comprobar cada un o de estos datos
 * mediante expresiones regulares: a. Direcci�n MAC b. Direcci�n IP c. Correo
 * electr�nico d. C�digo postal e. N�mero de cuenta corriente f. DNI Para ello,
 * solicita al usuario tres entradas distintas, dejando claro el patr�n que vas
 * a utilizar. Por ejemplo : Introduce una direcci�n MAC (XX:XX:XX:XX:XX:XX) La
 * direcci�n NO es correcta.
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
		Menu menuExpresiones = new Menu("Men� de expresiones.", new String[] { "Direcci�n MAC.", "Direcci�n IP.",
				"Correo electr�nico.", "C�digo postal.", "N�mero de cuenta corriente.", "DNI.", "Salir." });
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
		Matcher matcher = patron.matcher(Teclado.leerCadena("Introduce una direcci�n MAC."));
		if (matcher.matches()) {
			System.out.println("La direcci�n MAC es correcta.");
		} else {
			System.out.println("La direcci�n MAC es incorrecta.");
		}
	}

	private static void comprobarIP() {
		Pattern patron = Pattern.compile(PATRON_IP);
		Matcher matcher = patron.matcher(Teclado.leerCadena("Introduce una direcci�n IPv4."));
		if (matcher.matches()) {
			System.out.println("La direcci�n IPv4 es correcta.");
		} else {
			System.out.println("La direcci�n IPv4 es incorrecta.");
		}
	}

	private static void comprobarEmail() {
		Pattern patron = Pattern.compile(PATRON_EMAIL);
		Matcher matcher = patron.matcher(Teclado.leerCadena("Introduce un email."));
		if (matcher.matches()) {
			System.out.println("El email es v�lido.");
		} else {
			System.out.println("El email no es v�lido.");
		}
	}

	private static void comprobarCodigoPostal() {
		Pattern patron = Pattern.compile(PATRON_CPOSTAL);
		Matcher matcher = patron.matcher(Teclado.leerCadena("Introduce un c�digo postal."));
		if (matcher.matches()) {
			System.out.println("El c�digo postal es v�lido.");
		} else {
			System.out.println("El c�digo postal no es v�lido.");
		}
	}

	private static void comprobarCCorriente() {
		Pattern patron = Pattern.compile(PATRON_CCORRIENTE);
		Matcher matcher = patron.matcher(Teclado.leerCadena("Introduce una cuenta corriente."));
		if (matcher.matches()) {
			System.out.println("La cuenta corriente es v�lida.");
		} else {
			System.out.println("La cuenta corriente no es v�lida.");
		}
	}

	private static void comprobarDNI() {
		Pattern patron = Pattern.compile(PATRON_DNI);
		Matcher matcher = patron.matcher(Teclado.leerCadena("Introduce un DNI."));
		if (matcher.matches()) {
			System.out.println("El DNI es v�lido.");
		} else {
			System.out.println("El DNI no es v�lido.");
		}
	}
}
