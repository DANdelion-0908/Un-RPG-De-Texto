/**
 * 
 */
package UI;

import java.util.Scanner;
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

	public static void main(String[] args) {
			try (Scanner entrada = new Scanner(System.in)) {
                // Declaring the variables that will be used in the program.
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
                
                	// This is the code that is executed when the user chooses the warrior class.
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
                	
                	// Checking if the user has chosen the warrior class. If the user has chosen the warrior class, the
                	// program will continue.
                	if(elec == 1) {
                		key=1;	
                	
                	// Checking if the user has chosen the explorer class. If the user has chosen the explorer class,
                	// the program will continue.
                	}else if(elec == 2) {
                		key = 0;
                		
                	// This is the code that is executed when the user chooses an invalid option.
                	}else {
                		System.out.println("Elige una opción válida");
                		key = 0;
                	}
                	}
                	// This is the code that is executed when the user chooses the explorer class.
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
                	
                	// Checking if the user has chosen the warrior class. If the user has chosen the warrior class, the
                	//  program will continue.
                	if(elec == 1) {
                		key++;	
                	
                	// This is the code that is executed when the user chooses the explorer class.
                	}else if(elec == 2) {
                		key = 0;
                		
                	// This code is executed when the user chooses an invalid option.
                	}else {
                		System.out.println("Elige una opción válida");
                		key = 0;
                	}
                }
                }
                System.out.println("Ahora, tus épicas batallas — de texto — tendrán lugar en la sagrada Terminal");
                
                // This code is creating a new object of the class Lizard and setting its hp and attack.
                lizard = new Lizard();
                lizard.setHp(500);
                lizard.setAttack(40);

                // Creating a new object of the class Bush and setting its hp and attack.
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

                		// This code is checking if the player's hp is 0 and if the lizard's hp is 0. If both of these
                		// conditions are true, the battle will end.
                		if(player.getHp() == 0 && (lizard.getHp() == 0 && (lizard.getHp() == 0))) {
                			battle = 1;
                			System.out.println("La batalla ha concluido.");
                			
                		// This code is asking the user to choose an enemy to attack.
                		}else {
                			System.out.println("Elige la opción que desees ejecutar");
                			System.out.println("1. Atacar | 2. Usar objeto | 3. Pasar turno | 4. Huir ");
                			
                			int action = entrada.nextInt();
                			
                			System.out.println();
                			
                			// This code is asking the user to choose an enemy to attack.
                			if(action == 1) {
                				System.out.println("¿A qué enemigo vas a atacar?");
                				System.out.println("1. Lagartija | 2. Arbusto");
                				int move = entrada.nextInt();
                				
                				// This code is checking if the user has chosen to attack the lizard. If the user has chosen to
                				// attack the lizard, the code will subtract the player's attack from the lizard's hp. Then, the
                				// code will print a message saying that the player has attacked the lizard and has subtracted a
                				// certain amount of hp from the lizard. Then, the code will print the lizard's current hp.
                				// Finally, the code will check if the lizard's hp is 0. If the lizard's hp is 0, the code will
                				// print a message saying that the lizard has been defeated.
                				if(move == 1) {
                					lizard.setHp(lizard.getHp() - player.getAttack());
                					System.out.println("Has atacado a la Lagartija y le has quitado " + player.getAttack() + " de vida.");
                					System.out.println("La vida actual de la Lagartija es: " + lizard.getHp());
                					if(lizard.getHp() == 0) {
                						System.out.println("La Lagartija ha sido derrotada");
                					}

                				// This code is checking if the user has chosen to attack the bush. If the user has chosen to
                				// attack the bush, the code will subtract the player's attack from the bush's hp. Then, the
                				// code will print a message saying that the player has attacked the bush and has subtracted a
                				// certain amount of hp from the bush. Then, the code will print the bush's current hp. Finally,
                				// the code will check if the bush's hp is 0. If the bush's hp is 0, the code will print a
                				// message saying that the bush has been defeated.
                				}else if(move == 2) {
                					bush.setHp(bush.getHp() - player.getAttack());
                					System.out.println("Has atacado al Arbusto y le has quitado " + player.getAttack() + " de vida.");
                					System.out.println("La vida actual del Arbusto es: " + bush.getHp());
                					
                				}if(bush.getHp() == 0) {
                						System.out.println("El Arbusto ha sido derrotado");
                					}
                			}
                			
                			// This code is asking the user to choose an object to use.
                			if(action == 2) {
                				System.out.println("Selecciona el objeto que usarás");
                				System.out.println("1. Poción | 2. Café | 3. Explosivos");

                				int object = entrada.nextInt();
                				
                				// This code is checking if the user has chosen to use the potion. If the user has chosen to use
                				// the potion, the code will add 100 to the player's hp. Then, the code will print a message
                				// saying that the player has used a potion and has recovered 100 hp. Finally, the code will
                				// print the player's current hp.
                				if(object == 1) {
                					player.setHp(player.getHp() + 100);
                					System.out.println("Has usado una poción y has recuperado 100 puntos de vida. Tu vida actual es: " + player.getHp());

                				// This code is checking if the user has chosen to use the coffee. If the user has chosen to use
                				// the coffee, the code will add 20 to the player's attack. Then, the code will print a message
                				// saying that the player has used a coffee and has increased his attack by 20.
                				} else if(object == 2) {
                					player.setHp(player.getAttack() + 20);
                					System.out.println("Has bebido una deliciosa taza de café. Tu ataque aumenta en 20");
                					System.out.println("...");
                					String xd = entrada.nextLine();
                					
                					System.out.println("Aumentar tus estadísticas no es correcto. Tu castigo por ello será: ");
                					System.out.println("LA MUERTE INSTANTÁNEA");
                					System.out.println();
                					System.out.println("Tus enemigos unen fuerzas y ejecutan un poderoso ataque");
                					

                				// This code is checking if the user has chosen to use the explosives. If the user has chosen to
                				// use the explosives, the code will subtract 100 from the lizard's hp and the bush's hp. Then,
                				// the code will print a message saying that the player has used explosives and has subtracted
                				// 100 hp from the lizard and the bush. Then, the code will print the lizard's current hp and
                				// the bush's current hp. Finally, the code will check if the lizard's hp is 0 and if the bush's
                				// hp is 0. If the lizard's hp is 0, the code will print a message saying that the lizard has
                				// been defeated. If the bush's hp is 0, the code will print a message saying that the bush has
                				// been defeated.
                				}else if(object == 3) {
                					lizard.setHp(lizard.getHp() - 100);
                					bush.setHp(bush.getHp() - 100);
                					
                					System.out.println("Has lanzado un explosivo a tus enemigos.");
                					System.out.println("La vida actual del Arbusto es: " + bush.getHp());
                					
                					if(bush.getHp() == 0) {
                						System.out.println("El Arbusto ha sido derrotado");
                					}
                						
                					System.out.println("La vida actual de la Lagartija es: " + lizard.getHp());
                					if(lizard.getHp() == 0) {
                						System.out.println("La Lagartija ha sido derrotada");
                						}
                					
                				}
                			}
                			
                			// This code is printing a message saying that the player has passed his turn.
                			if(action == 3) {
                				System.out.println("Has pasado tu turno");
                			}
                			
                			// This code is printing a message saying that the player has fled.
                			if (action == 4) {
                				System.out.println("Has huido.");
                				battle = 1;
                			}
                			
                			}
                		// This code is checking if the bush's hp is greater than 0. If the bush's hp is greater than 0,
                		// the code will print a message saying that the bush has charged against the player. Then, the
                		// code will subtract the bush's attack from the player's hp.
                		if(bush.getHp() > 0) {
                		System.out.println("El Arbusto carga contra ti");
                		player.setHp(player.getHp() - bush.getAttack());
                		}
                		
                		// This code is checking if the lizard's hp is greater than 0. If the lizard's hp is greater than
                		// 0, the code will print a message saying that the lizard has charged against the player. Then,
                		// the code will subtract the lizard's attack from the player's hp.
                		if(lizard.getHp() > 0 ) {
                		System.out.println("La lagartija ataca con sus garras");
                		player.setHp(player.getHp() - lizard.getAttack());
                		}

                		// This line of code is printing a message saying that the player's current hp is the player's hp.
                		System.out.println("Tu vida actual es: " + player.getHp());
                		
                		// Checking if the player's health is less than or equal to 0. If it is, it will print out the
                		// player's defeat message and the player's name. It will also set the battle variable to 1.
                		if(player.getHp() <= 0) {
                			System.out.println("Has sido derrotado");
                			System.out.println(player.getDefeat());
                			System.out.println("- " + player.getName());
                			battle = 1;
                		}
                		
                		// Checking if the lizard and bush have 0 hp. If they do, it will print out the victory message
                		// and the player's name.
                		if(lizard.getHp() <= 0&& bush.getHp()<= 0) {
                			System.out.println("¡Has ganado el combate!");
                			System.out.println(player.getVictory());
                			System.out.println("- " + player.getName());
                			battle = 1;
                		}
                		
                		}
                	}
                
            }
			
			
			}
	}
