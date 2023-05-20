package main;
import listaDoble.ListaDoble;
import listaDoble.Persona;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese n: ");
		int n = Integer.parseInt(sc.nextLine());
		ListaDoble lista = new ListaDoble();
		for(int i = 0; i < n; i++) {
			System.out.println("Ingrese la edad: ");
			Integer edad = Integer.parseInt(sc.nextLine());
			System.out.println("Ingrese el nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Ingrese el ci: ");
			String ci = sc.nextLine();
			lista.insertarAlInicio(new Persona(edad, nombre, ci));
		}
		System.out.println("=====================================");
		lista.mostrarInicio();
		
		
		
		lista.insertarAlInicio(null);
		
		
		
		
		
	}

}
