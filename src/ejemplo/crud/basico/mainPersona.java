package ejemplo.crud.basico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class mainPersona {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		
		System.out.println("Bienvenido");
		Scanner sc = new Scanner(System.in);
		int opcion =0;
		int contador = 0;
		String nombreModificar = "";
		
		
		do {
			System.out.println("SELECCIONE UNA OPCIÓN");	
			System.out.println("1. AÑADIR PERSONA");
			System.out.println("2. MODIFICAR PERSONA");
			System.out.println("3. ELIMINAR PERSONA");
			System.out.println("4. VER LISTADO DE PERSONAS");
			System.out.println("5. SALIR");
			opcion = sc.nextInt();
					
			switch (opcion) {
			case 1: {					
					System.out.println("Ingrese el nombre de la persona");
					String nombrePersona = sc.next();
					lista.add(nombrePersona);
					System.out.println("El nombre de la Persona es : "+ nombrePersona);
					break;
					}
			case 2: {			
					System.out.println("Modificar Persona");
					
					Iterator<String> it = lista.iterator();
					while(it.hasNext())
					  System.out.println(it.next());
									
					System.out.println("Ingrese la posición de la persona a modificar");
					int posicion = sc.nextInt();
					System.out.println("Ingrese el nuevo nombre ");
					String nuevoNombre = sc.next();	
					
					lista.set(posicion,nuevoNombre);

					System.out.println("listado de Personas "+ lista.toString());
					break;
			}
			case 3: {			
					System.out.println("Eliminar Persona");
					System.out.println("Ingrese la posición de la persona a Eliminar");
					int posicion = sc.nextInt();					
					lista.remove(posicion);
					System.out.println("Se a eliminado la persona correctamente");					
					break;
			}
			case 4: {			
					System.out.println("LISTADO DE PERSONAS");
					System.out.println( "NOMBRE: " +  lista.toString().toUpperCase() + " ");					
					break;
			}
			case 5:
					System.out.println("Hasta pronto!!");
					break;
			}
			
		}while(opcion != 5);
		

	}

}
