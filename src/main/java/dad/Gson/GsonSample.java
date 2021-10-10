package dad.Gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonSample extends Persona{

	public static void main(String[] args) {
		String Nombre, Apellidos, edad;
		Persona p = new Persona();

		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println("Introduzca su nombre: ");
			Nombre = entrada.nextLine();
			if (Nombre.isEmpty()) {
				throw new Exception();
			} else {
				p.setNombre(Nombre);
			}

			System.out.println("Introduzca sus apellidos: ");
			Apellidos = entrada.nextLine();
			if (Apellidos.isEmpty()) {
				throw new Exception();
			} else {
				p.setApellidos(Apellidos);
			}

			System.out.println("Introduzca su edad: ");
			edad = entrada.nextLine();
			if (edad.isEmpty()) {
				throw new Exception();
			} else {
				int edadInt = Integer.parseInt(edad);
				p.setEdad(edadInt);
			}

		} catch (Exception e) {
			System.err.println(
					"Se ha producido un error, no puede dejar un campo en blanco ni introducir valores NO permitidos.");

		}
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
	}
}
