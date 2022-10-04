/**
 * 
 */
package UI;

import java.util.Scanner;
import Model.Stats;
import java.util.ArrayList;
import Model.Stats;
import Model.Explorer;
import Model.Warrior;

/**
 * @author Dan
 *
 */
public class DriverProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("****************");
			System.out.println("UN RPG DE TEXTO");
			System.out.println("****************");
			System.out.println();
			
			System.out.println("Bienvenido, viajero. ¿Cuál es tu nombre?");
			String nameP = entrada.nextLine();
			
			System.out.println("En este juego puedes elegir entre dos clases de héroes:");
			System.out.println();
			System.out.println("Un guerrero: un luchador muy poderoso que posee estadísticas altas de ataque y defensa");
			System.out.println("pero, debido a su armadura y equipo, posee baja velocidad y poco espacio para ítems");
			System.out.println();
			System.out.println("Un explorador: un luchador hábil que posee un gran inventario y una alta velocidad, ");
			System.out.println("pero no posee estadísticas altas de ataque y defensa.");
			System.out.println();
			System.out.println("Ahora, haz tu desición: ");
			System.out.println("1. Guerrero");
			System.out.println("2. Explorador");
			
			int opt = entrada.nextInt();
			
			if(opt == 1) {
				
				
				
			}
}
	
}