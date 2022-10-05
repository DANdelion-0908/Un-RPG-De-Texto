/**
 * 
 */
package UI;

import java.util.Scanner;
import java.util.ArrayList;
import Model.Explorer;
import Model.Warrior;
import Model.Character;
import Model.Lizard;
import Model.Bush;

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
			
			Character player = null;
			Lizard lizard = null;
			Bush bush = null;
			
			System.out.println("****************");
			System.out.println("UN RPG DE TEXTO");
			System.out.println("****************");
			System.out.println();

			System.out.println("En este juego puedes elegir entre dos clases de héroes:");
			System.out.println();
			System.out.println("Un guerrero: un luchador muy poderoso que posee estadísticas altas de ataque y defensa");
			System.out.println("pero, debido a su armadura y equipo, posee baja velocidad y poco espacio para ítems");
			System.out.println();
			System.out.println("Un explorador: un luchador hábil que posee un gran inventario y una alta velocidad, ");
			System.out.println("pero no posee estadísticas altas de ataque y defensa.");
			System.out.println();
			int key = 0;
			while (key == 0) {
				System.out.println("Ahora, haz tu desición: ");
				System.out.println("1. Guerrero");
				System.out.println("2. Explorador");
			
				int opt = entrada.nextInt();
			
				if(opt == 1) {
					player = new Warrior();
					player.setHp(500);
					player.setAttack(50);
					player.setStart("No hay nada como una batalla emocionante.");
					player.setVictory("¡Tu vida acaba aquí!");
					player.setDefeat("... Tal parece que... no he sido lo suficientemente fuerte...");
					player.setName("Máximo");
					String election = "Guerrero";
					System.out.println("Haz elegido " + election);
					System.out.println("¿Es esto correcto?");
					System.out.println("1. Sí");
					System.out.println("2. No");
					int elec = entrada.nextInt();
				
				if(elec == 1) {
					key++;	
				
				}else if(elec == 2) {
					key = 0;
					
				}else {
					System.out.println("Elige una opción válida");
					key = 0;
				}
				}
				else if(opt == 2) {
					player = new Explorer();
					player.setHp(300);
					player.setAttack(30);
					player.setStart("Se viene una gran aventura.");
					player.setVictory("¡Expedición completada!");
					player.setDefeat("Mi aventura... acaba aquí...");
					player.setName("Jorge");
					String election = "Explorador";
					System.out.println("Haz elegido " + election);
					System.out.println("¿Es esto correcto?");
					System.out.println("1. Sí");
					System.out.println("2. No");
					int elec = entrada.nextInt();
				
				if(elec == 1) {
					key++;	
				
				}else if(elec == 2) {
					key = 0;
					
				}else {
					System.out.println("Elige una opción válida");
					key = 0;
				}
			}
			System.out.println("Ahora, tus épicas batallas — de texto — tendrán lugar en la sagrada Terminal");
			
			lizard = new Lizard();
			lizard.setHp(500);
			lizard.setAttack(40);
			bush = new Bush();
			bush.setHp(300);
			bush.setAttack(30);
			
			System.out.println();
			System.out.println(player.getStart());
			System.out.println("- " + player.getName());
			System.out.println();
			
			int battle = 0;
			while(battle == 0) {
				for(int i = 0; i < 1; i++) {
					if(player.getHp() == 0 && (lizard.getHp() == 0 && (lizard.getHp() == 0))) {
						battle = 1;
						System.out.println("La batalla ha concluido.");
						
					}else {
						System.out.println("Elige la opción que desees ejecutar");
						System.out.println("1. Atacar | 2. Usar objeto | 3. Pasar turno | 4. Huir ");
						
						int action = entrada.nextInt();
						
						System.out.println();
						
						if(action == 1) {
							System.out.println("¿A qué enemigo vas a atacar?");
							System.out.println("1. Lagartija | 2. Arbusto");
							int move = entrada.nextInt();
							
							if(move == 1) {
								lizard.setHp(lizard.getHp() - player.getAttack());
								System.out.println("Has atacado a la Lagartija y le has quitado " + player.getAttack() + " de vida.");
								System.out.println("La vida actual de la Lagartija es: " + lizard.getHp());
								if(lizard.getHp() == 0) {
									System.out.println("La Lagartija ha sido derrotada");
								}
							}else if(move == 2) {
								bush.setHp(bush.getHp() - player.getAttack());
								System.out.println("Has atacado al Arbusto y le has quitado " + player.getAttack() + " de vida.");
								System.out.println("La vida actual del Arbusto es: " + bush.getHp());
								
							}if(bush.getHp() == 0) {
									System.out.println("El Arbusto ha sido derrotado");
								}
						}
						
						}
					}
				}
			}
			
			
			}
	}
