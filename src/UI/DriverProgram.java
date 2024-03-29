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
import Model.RaidBoss;
import Model.Hunter;
import Model.RaidMinion;
import Model.Pet;

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
                RaidBoss raidboss = null;
                RaidMinion raidminion = null;
                Pet pet = null;
                
                System.out.println("****************");
                System.out.println("UN RPG DE TEXTO Y TAL");
                System.out.println("****************");
                System.out.println();
                
                System.out.println("1. Modo Normal");
                System.out.println("2. Modo Asalto");
                int mode = entrada.nextInt();
                
                if(mode == 1) {

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
                		player.setPotion(10);
                		player.setBomb(5);
                		player.setCoffee(1);
                		String election = "Guerrero";
                		System.out.println("Haz elegido " + election);
                		System.out.println("¿Es esto correcto?");
                		System.out.println("1. Sí");
                		System.out.println("2. No");
                		int elec = entrada.nextInt();
                	
                	
                	// Checking if the user has chosen the warrior class. If the user has chosen the warrior class, the
                	// program will continue.
                	if(elec == 1) {
                		key++;	
                	
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
                		player.setBomb(10);
                		player.setPotion(15);
                		player.setCoffee(1);
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
                			
                		// This code is asking the user to choose an enemy to attack.
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
                				System.out.println("1. Poción (" + player.getPotion() + ")" + "| 2. Café (" + player.getCoffee() + ") | 3. Explosivos (" + player.getBomb() + ")");

                				int object = entrada.nextInt();
                				
                				// This code is checking if the user has chosen to use the potion. If the user has chosen to use
                				// the potion, the code will add 100 to the player's hp. Then, the code will print a message
                				// saying that the player has used a potion and has recovered 100 hp. Finally, the code will
                				// print the player's current hp.
                				if(object == 1) {
                					if(player.getPotion() > 0) {
                					player.setHp(player.getHp() + 100);
                					System.out.println("Has usado una poción y has recuperado 100 puntos de vida. Tu vida actual es: " + player.getHp());
                					player.setPotion(player.getPotion() - 1);
                					
                					}else if(player.getPotion() <= 0) {
                						System.out.println("No posees pociones.");
                					}

                				// This code is checking if the user has chosen to use the coffee. If the user has chosen to use
                				// the coffee, the code will add 20 to the player's attack. Then, the code will print a message
                				// saying that the player has used a coffee and has increased his attack by 20.
                				} else if(object == 2) {
                					player.setHp(player.getAttack() + 20);
                					System.out.println("Has bebido una deliciosa taza de café. Tu ataque aumenta en 10");

                				// This code is checking if the user has chosen to use the explosives. If the user has chosen to
                				// use the explosives, the code will subtract 100 from the lizard's hp and the bush's hp. Then,
                				// the code will print a message saying that the player has used explosives and has subtracted
                				// 100 hp from the lizard and the bush. Then, the code will print the lizard's current hp and
                				// the bush's current hp. Finally, the code will check if the lizard's hp is 0 and if the bush's
                				// hp is 0. If the lizard's hp is 0, the code will print a message saying that the lizard has
                				// been defeated. If the bush's hp is 0, the code will print a message saying that the bush has
                				// been defeated.
                				} else if(object == 3) {
                					if(player.getBomb() > 0) {
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
                					
                					player.setBomb(player.getBomb() - 1);
                					
                				} else if(player.getBomb() == 0) {
                					System.out.println("No posees explosivos.");
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
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////              	
                }else if(mode == 2) {
                
                System.out.println("Has seleccionado el modo Asalto. En este modo puedes elegir entre tres clases de héroes:");
                System.out.println();
                System.out.println("Un guerrero: un luchador muy poderoso que posee estadísticas altas de ataque y defensa");
                System.out.println("pero, debido a su armadura y equipo, posee baja velocidad y poco espacio para ítems");
                System.out.println("Un cazador: un luchador bastante débil, pero que lo compensa con una mascota que lucha con él.");
                System.out.println();
                System.out.println("Un explorador: un luchador hábil que posee un gran inventario y una alta velocidad, ");
                System.out.println("pero no posee estadísticas altas de ataque y defensa.");
                System.out.println();
               
                int key = 0;
                
                while (key == 0) {
                	System.out.println("Ahora, haz tu desición: ");
                	System.out.println("1. Guerrero");
                	System.out.println("2. Explorador");
                	System.out.println("3. Cazador");
                
                	int opt = entrada.nextInt();
                
                	// This is the code that is executed when the user chooses the warrior class.
                	if(opt == 1) {
                		player = new Warrior();
                		player.setHp(1200);
                		player.setAttack(50);
                		player.setStart("No hay nada como una batalla emocionante.");
                		player.setVictory("¡Tu vida acaba aquí!");
                		player.setDefeat("... Tal parece que... no he sido lo suficientemente fuerte...");
                		player.setName("Máximo");
                		player.setPotion(15);
                		player.setBomb(10);
                		player.setCoffee(5);
                		String election = "Guerrero";
                		System.out.println("Haz elegido " + election);
                		System.out.println("¿Es esto correcto?");
                		System.out.println("1. Sí");
                		System.out.println("2. No");
                		int elec = entrada.nextInt();
                		boolean haspet = false;
                	
                	
                	// Checking if the user has chosen the warrior class. If the user has chosen the warrior class, the
                	// program will continue.
                	if(elec == 1) {
                		key++;	
                	
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
                		player.setHp(900);
                		player.setAttack(30);
                		player.setStart("Se viene una gran aventura.");
                		player.setVictory("¡Expedición completada!");
                		player.setDefeat("Mi aventura... acaba aquí...");
                		player.setName("Jorge");
                		player.setBomb(20);
                		player.setPotion(25);
                		player.setCoffee(5);
                		String election = "Explorador";
                		System.out.println("Haz elegido " + election);
                		System.out.println("¿Es esto correcto?");
                		System.out.println("1. Sí");
                		System.out.println("2. No");
                		int elec = entrada.nextInt();
                		boolean haspet = false;
                	
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
                	else if(opt == 3) {
                		player = new Hunter();
                		player.setHp(800);
                		player.setAttack(25);
                		player.setStart("Es la hora de cazar.");
                		player.setVictory("Caza completada con éxito");
                		player.setDefeat("Creo que esta fue mi última cacería...");
                		player.setName("Mario");
                		player.setPotion(15);
                		player.setBomb(10);
                		player.setCoffee(5);
                		String election = "Cazador";
                		System.out.println("Haz elegido " + election);
                		System.out.println("¿Es esto correcto?");
                		System.out.println("1. Sí");
                		System.out.println("2. No");
                		int elec = entrada.nextInt();
                		boolean haspet = true;
                	
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
                lizard.setAttack(20);

                // Creating a new object of the class Bush and setting its hp and attack.
                bush = new Bush();
                bush.setHp(300);
                bush.setAttack(15);
                
                raidboss = new RaidBoss();
                raidboss.setHp(3000);
                raidboss.setAttack(40);
                raidboss.setName("Voss: el destructor artesano");
                boolean finalMove = false;
                
                raidminion = new RaidMinion();
				raidminion.setHp(0);
				raidminion.setAttack(0);
				raidminion.setName("Vossie");
				
				pet = new Pet();
				pet.setHp(0);
				pet.setAttack(0);
				
				/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////7
				
                System.out.println();
                System.out.println(player.getStart());
                System.out.println("- " + player.getName());
                System.out.println();
                
                int battle = 0;
                int turn = 1;

                while(battle == 0) {
                	for(int i = 0; i < 1; i++) {
                		
                		System.out.println("");
                		
                		
     
                		if(raidminion.getHp() > 0) {
                			boolean minionlive = true;
                		
                		}else if(raidminion.getHp() <= 0) {
                			boolean minionlive = false;
                		}
                			
                		// This code is asking the user to choose an enemy to attack.
                			System.out.println("Tu vida actual es " + player.getHp());
                			System.out.println("Tu ataque actual es " + player.getAttack());
                			System.out.println("");
                			System.out.println("Elige la opción que desees ejecutar");
                			System.out.println("1. Atacar | 2. Usar objeto | 3. Pasar turno | 4. Huir | 5. Lanzar mascota | Turno actual: " + turn);
                			
                			int action = entrada.nextInt();
                			
                			System.out.println();
                			
                			// This code is asking the user to choose an enemy to attack.
                			if(action == 1) {
                				System.out.println("¿A qué enemigo vas a atacar?");
                				System.out.println("1. Lagartija | 2. Arbusto | 3. " + raidboss.getName() + " | 4. " + raidminion.getName());
                				
                				int move = entrada.nextInt();
                				
                				double critRate = Math.random();
                				
                				// This code is checking if the user has chosen to attack the lizard. If the user has chosen to
                				// attack the lizard, the code will subtract the player's attack from the lizard's hp. Then, the
                				// code will print a message saying that the player has attacked the lizard and has subtracted a
                				// certain amount of hp from the lizard. Then, the code will print the lizard's current hp.
                				// Finally, the code will check if the lizard's hp is 0. If the lizard's hp is 0, the code will
                				// print a message saying that the lizard has been defeated.
                				if(move == 1) {
                					if(critRate <= 0.5) {
                						lizard.setHp(lizard.getHp() - player.getAttack());
                						System.out.println("Has atacado a la Lagartija y le has quitado " + player.getAttack() + " de vida.");
                					
                					// Checking if the critRate is greater than 0.5, if it is, it will print out a
									// message and subtract the player's attack from the lizard's hp.
									}else if(critRate > 0.5) {
                						lizard.setHp(lizard.getHp() - player.getAttack() * 2);
                						System.out.println("");
                						System.out.println("¡UN GOLPE CRÍTICO!");
                						System.out.println("Has atacado a la Lagartija y le has quitado " + player.getAttack() * 2 + " de vida.");
                					}
                					
                					System.out.println("Tu lobo ataca contigo");
                					System.out.println("Ha atacado a la Lagartija y le ha quitado 20 de vida.");
                					lizard.setHp(lizard.getHp() - 20);
                					System.out.println("La vida actual de la Lagartija es: " + lizard.getHp());
                					if(lizard.getHp() <= 0) {
                						System.out.println("La Lagartija ha sido derrotada");
                					}

                				// This code is checking if the user has chosen to attack the bush. If the user has chosen to
                				// attack the bush, the code will subtract the player's attack from the bush's hp. Then, the
                				// code will print a message saying that the player has attacked the bush and has subtracted a
                				// certain amount of hp from the bush. Then, the code will print the bush's current hp. Finally,
                				// the code will check if the bush's hp is 0. If the bush's hp is 0, the code will print a
                				// message saying that the bush has been defeated.
                				}else if(move == 2) {
                					if(critRate <= 0.5) {
                						bush.setHp(bush.getHp() - player.getAttack());
                						System.out.println("Has atacado al arbusto y le has quitado " + player.getAttack() + " de vida.");
                					
                					// Checking if the critRate is greater than 0.5, if it is, it will print out a
									// message and do something.
									}else if(critRate > 0.5) {
                						bush.setHp(bush.getHp() - player.getAttack() * 2);
                						System.out.println("");
                						System.out.println("¡UN GOLPE CRÍTICO!");
                						System.out.println("Has atacado al arbusto y le has quitado " + player.getAttack() * 2 + " de vida.");
                					}
                					
                					// A Java code that is printing out a message to the console.
									System.out.println("Tu lobo ataca contigo");
                					System.out.println("Ha atacado al Arbusto y le ha quitado 20 de vida.");
                					lizard.setHp(bush.getHp() - 20);
                					System.out.println("La vida actual del Arbusto es: " + bush.getHp());
                					if(bush.getHp() <= 0) {
                						System.out.println("El Arbusto ha sido derrotado");
                					}
                					
                				}else if(move == 3) {

                					// Checking if the critRate is less than or equal to 0.5. If it is, then it will
									// set the raidboss's hp to the raidboss's hp minus the player's attack. It will
									// then print out a message saying that the player has attacked the raidboss and
									// how much damage was done.
									if(critRate <= 0.5) {
                						raidboss.setHp(raidboss.getHp() - player.getAttack());
                						System.out.println("Has atacado a " + raidboss.getName() + " y le has quitado " + player.getAttack() + " de vida.");
                					
                					// Checking if the critRate is greater than 0.5, if it is, it will print out a
									// message and subtract the player's attack from the raidboss's hp.
									}else if(critRate > 0.5) {
                						raidboss.setHp(raidboss.getHp() - player.getAttack() * 2);
                						System.out.println("");
                						System.out.println("¡UN GOLPE CRÍTICO!");
                						System.out.println("Has atacado a " + raidboss.getName() + " y le has quitado " + player.getAttack() * 2 + " de vida.");
                					}
                					
                					// Printing out a message to the console.
									System.out.println("Tu lobo ataca contigo");
                					System.out.println("Ha atacado a " + raidboss.getName() + " y le ha quitado 20 de vida.");
                					lizard.setHp(raidboss.getHp() - 20);
                					System.out.println("La vida actual de " + raidboss.getName() + " es: " + raidboss.getHp());
                					if(raidboss.getHp() <= 0) {
                						System.out.println(raidboss.getName() + " ha sido derrotado");
                					}
                					
                				}else if(move == 4) {
                					if(raidminion.getHp() > 0) {

                						// Checking if the critRate is less than or equal to 0.5. If it is, then it will
										// set the raidminion's hp to the raidminion's hp minus the player's attack. It
										// will then print out a message saying that the player has attacked the
										// raidminion and how much damage was done.
										if(critRate <= 0.5) {
                    						raidminion.setHp(raidminion.getHp() - player.getAttack());
                    						System.out.println("Has atacado a " + raidminion.getName() + " y le has quitado " + player.getAttack() + " de vida.");
                    					
                    					// Checking if the critRate is greater than 0.5, if it is, it will print out a
										// message and deal double damage to the enemy.
										}else if(critRate > 0.5) {
                    						raidminion.setHp(raidminion.getHp() - player.getAttack() * 2);
                    						System.out.println("");
                    						System.out.println("¡UN GOLPE CRÍTICO!");
                    						System.out.println("Has atacado a " + raidminion.getName() + " y le has quitado " + player.getAttack() * 2 + " de vida.");
                    					}
                    					
                    					// A code snippet from a game I am making. It is a raid boss fight. The code
										// is for the boss to attack the player.
										System.out.println("Tu lobo ataca contigo");
                    					System.out.println("Ha atacado a " + raidminion.getName() + " y le ha quitado 20 de vida.");
                    					lizard.setHp(lizard.getHp() - 20);
                    					System.out.println("La vida actual de " + raidminion.getName() + " es: " + raidminion.getHp());
                    					if(raidminion.getHp() <= 0) {
                    						System.out.println(raidminion.getName() + " ha sido derrotado");
                    					}
                    					
                					// Checking if the user input is equal to the name of the enemy.
									}else {
                						System.out.println("Ese enemigo no existe");
                					}
                				}
                			}
                			// This code is asking the user to choose an object to use.
                			if(action == 2) {
                				System.out.println("Selecciona el objeto que usarás");
                				System.out.println("1. Poción (" + player.getPotion() + ")" + "| 2. Café (" + player.getCoffee() + ") | 3. Explosivos (" + player.getBomb() + ")");

                				int object = entrada.nextInt();
                				
                				// This code is checking if the user has chosen to use the potion. If the user has chosen to use
                				// the potion, the code will add 100 to the player's hp. Then, the code will print a message
                				// saying that the player has used a potion and has recovered 100 hp. Finally, the code will
                				// print the player's current hp.
                				if(object == 1) {
                					if(player.getPotion() > 0) {
                					player.setHp(player.getHp() + 300);
                					System.out.println("Has usado una poción y has recuperado 300 puntos de vida. Tu vida actual es: " + player.getHp());
                					player.setPotion(player.getPotion() - 1);
                					
                					// Checking if the player has a potion. If the player has a potion, it will
									// subtract one from the player's potion count. If the player does not have a
									// potion, it will print out a message.
									}else if(player.getPotion() <= 0) {
                						System.out.println("No posees pociones.");
                					}

                				// This code is checking if the user has chosen to use the coffee. If the user has chosen to use
                				// the coffee, the code will add 20 to the player's attack. Then, the code will print a message
                				// saying that the player has used a coffee and has increased his attack by 20.
                				} else if(object == 2) {
                					if(player.getCoffee() > 0) {
                					player.setAttack(player.getAttack() + 40);
                					System.out.println("Has bebido una deliciosa taza de café. Tu ataque aumenta en 40 puntos");
                					player.setCoffee(player.getCoffee() - 1);
                					
                					// Checking if the player has coffee.
									}else if(player.getCoffee() <= 0) {
                						System.out.println("No posees tazas de café.");
                					}

                				// This code is checking if the user has chosen to use the explosives. If the user has chosen to
                				// use the explosives, the code will subtract 100 from the lizard's hp and the bush's hp. Then,
                				// the code will print a message saying that the player has used explosives and has subtracted
                				// 100 hp from the lizard and the bush. Then, the code will print the lizard's current hp and
                				// the bush's current hp. Finally, the code will check if the lizard's hp is 0 and if the bush's
                				// hp is 0. If the lizard's hp is 0, the code will print a message saying that the lizard has
                				// been defeated. If the bush's hp is 0, the code will print a message saying that the bush has
                				// been defeated.
                					
                				// Checking if the player has a bomb.
								} else if(object == 3) {
                					if(player.getBomb() > 0) {
                						
                						// The above code is checking if the hp of the monsters is greater than 0, if it
										// is then it will subtract 100 from the hp. If the hp is less than 100, then it
										// will set the hp to 0.
										if(lizard.getHp()> 0) {
                							lizard.setHp(lizard.getHp() - 100);
                						}else if(lizard.getHp() < 100) {
                							lizard.setHp(0);
                						}
                						
                						if(bush.getHp() > 0) {
                							bush.setHp(bush.getHp() - 100);
                						}else if(bush.getHp() < 100) {
                							bush.setHp(0);
                						}
                						
                						if(raidboss.getHp() > 0) {
                							raidboss.setHp(raidboss.getHp() - 100);
                						}else if(raidboss.getHp() < 100) {
                							raidboss.setHp(0);
                						}
                						
                						if(raidminion.getHp() > 0) {
                							raidminion.setHp(raidminion.getHp() - 100);
                						}else if(raidminion.getHp() < 100) {
                							raidminion.setHp(0);
                						}
                														
									System.out.println("Has lanzado un explosivo a tus enemigos.");
                					System.out.println("La vida actual del Arbusto es: " + bush.getHp());
                					
                					if(bush.getHp() == 0) {
                						System.out.println("El Arbusto ha sido derrotado");
                					}
                						
                					// The above code is printing out the current health of the lizard. If the
									// lizard's health is 0, it will print out that the lizard has been defeated.
									System.out.println("La vida actual de la Lagartija es: " + lizard.getHp());
                					if(lizard.getHp() == 0) {
                						System.out.println("La Lagartija ha sido derrotada");
                						
                						}
                					
                					// The above code is printing the current HP of the raidboss. If the raidboss HP
									// is 0, it will print that the raidboss has been defeated.
									System.out.println("La vida actual de " + raidboss.getName() + " es: " + raidboss.getHp());
                					if(raidboss.getHp() == 0) {
                						System.out.println(raidboss.getName() + " ha sido derrotado");
                						}
                					
                					// Printing the current HP of the raidminion and if it is 0, it is printing that
									// the raidminion has been defeated.
									System.out.println("La vida actual de " + raidminion.getName() + " es: " + raidminion.getHp());
                					if(raidminion.getHp() == 0) {
                						System.out.println(raidminion.getName() + " ha sido derrotado");
                						}
                					
                					// The above code is subtracting 1 from the player's bomb count.
									player.setBomb(player.getBomb() - 1);
                					
                				// Checking if the player has bombs.
								} else if(player.getBomb() == 0) {
                					System.out.println("No posees explosivos.");
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
                				break;
                			}               			
                			// Checking if the player's name is Mario, and if the pet's hp is less than or equal
							// to 0, then it will set the pet's hp to 300 and attack to 40. If the pet's hp is
							// not less than or equal to 0, then it will print out that the pet is already in
							// the field.
							if(action == 5) {
                				if (player.getName() == "Mario") {
                					if(pet.getHp() <= 0) {
                					System.out.println(player.getName() + " ha lanzado a su mascota al campo.");
                    				pet.setHp(300);
                    				pet.setAttack(40);
                					} else {
                						System.out.println("Tu mascota ya está en el campo");
                					}
                				
                				// Checking if the user has a pet and if the user has a pet it is checking if the
								// user has a hero. If the user has a hero it is checking if the hero is a Java
								// hero. If the hero is a Java hero it is printing out a message. If the user does
								// not have a hero or the hero is not a Java hero it is printing out a message.
								}else {
                					System.out.println("No puedes lanzar a tu mascota con este héroe");
                				}
                			} 
                				// Incrementing the variable turn by 1.
								turn ++;
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
                		if(raidboss.getHp() > 0 ) {
                			double bossAction = Math.floor(Math.random()*10+1);
							
                			// Creating a new enemy for the player to fight.
							if(bossAction < 3) {
                				System.out.println(raidboss.getName() + " ha creado un aliado con las estadísticas de la Lagartija.");
                				raidminion.setHp(lizard.getHp());
                				raidminion.setAttack(lizard.getAttack());
                				}else if(bossAction >= 5) {
                					if(raidminion.getHp() > 0) {
                						System.out.println(raidboss.getName() + " ha acabado con su aliado");
                						raidminion.setHp(0);
                					}               				
                				// Checking if the raidminion's hp is less than or equal to 0, if it is, it sets
								// the hp to 0.
								}else if(bossAction == 4){
                					if(raidminion.getHp() <= 0) {
                					raidminion.setHp(0);
                					}
                				}              			
                				// Checking if the raidminion's hp is greater than 0, if it is, it will print out
								// the raidminion's name and attack the player.
								if(raidminion.getHp() > 0) {
                					System.out.println( raidminion.getName() +  " te ha atacado.");
                					player.setHp(player.getHp() - raidminion.getAttack());
                				}
                			}
                		          
                			if(raidboss.getHp() > 0) {
                				
                				if(finalMove) {
                					
                					double finalMoveAccuracy = Math.random();
                					
                					// Checking if the finalMoveAccuracy is greater than 0.7. If it is, it will print
									// out the following:
									if(finalMoveAccuracy >  0.7) {
                						System.out.println(raidboss.getName() + " ha usado sus poderes arcanos para ejecutar su golpe final.");
                						System.out.println(raidboss.getName() + " acaba contigo de un poderoso ataque.");
                						System.out.println("Has sido aniquilado");
                						System.out.println("...");
                						System.out.println("- " + player.getName());
                        			
                						// Exiting the program.
										System.exit(battle);
                					
                					// Checking if the finalMoveAccuracy is less than or equal to 0.6. If it is, it
									// will print out the message "Pero ha fallado."
									}else if(finalMoveAccuracy <= 0.6) {
                						System.out.println(raidboss.getName() + " ha usado su ataque final...");
                						System.out.println("Pero ha fallado.");
                					}
                					
                					finalMove = false;
                				}
                				// Printing a message to the console, and then it is subtracting the player's HP by
								// the raidboss's attack.
								System.out.println(raidboss.getName() + " ataca ferozmente");
                				player.setHp(player.getHp() - raidboss.getAttack());
                    		
                				double bossSpecial = Math.floor(Math.random()*10+1);
                    		
                				// Checking if the bossSpecial is less than or equal to 3. If it is, it will print
								// out the boss name and the player's hp will be reduced by the boss's attack
								// multiplied by 0.2 and then added to the boss's attack.
								if(bossSpecial <= 3) {
                    			System.out.println(raidboss.getName() + " te lanza un poderoso rayo.");
                    			player.setHp(player.getHp() - ((raidboss.getAttack() * 0.2) + raidboss.getAttack()));
                    		}
                    		
                    		// Checking if the bossSpecial is 4 or 5, if it is, it prints out a message and
							// increases the boss's attack by 10.
							if(bossSpecial == 4 || bossSpecial == 5) {
                    			System.out.println(raidboss.getName() + " ha rugido ferozmente.");
                    			System.out.println("El ataque de " + raidboss.getName() + " ha subido");
                    			raidboss.setAttack(raidboss.getAttack() + 10);
                    		}
                    		
                    		// The above code is checking if the bossSpecial is 6 or 7, if it is, it will
							// print out a message and add 500 to the boss's hp.
							if(bossSpecial == 6 || bossSpecial == 7) {
                    			System.out.println(raidboss.getName() + " usa sus poderes para recuperar vitalidad.");
                    			raidboss.setHp(raidboss.getHp() + 500);
                    		}
                    		
                    		// A boss special attack that steals 10% of the player's attack and adds it to
							// the boss's attack.
							if(bossSpecial == 8 || bossSpecial == 9) {
                    			System.out.println(raidboss.getName() + " usa sus poderes para robarte estadísticas.");
                    			
                    			raidboss.setAttack(raidboss.getAttack() + ((player.getAttack() * 0.1) + player.getAttack()));
                    			player.setAttack(player.getAttack() - (player.getAttack() * 0.1));
                    			
                    			System.out.println("Tu ataque ahora es " + player.getAttack());
                    		}
                    		
                    		// Checking if the bossSpecial is 10, if it is, it will print out the boss name
							// and start charging an attack.
							if(bossSpecial == 10) {
                    			System.out.println(raidboss.getName() + " empieza a cargar un ataque...");
                    			finalMove = true;
                    		}
                    		}
                		
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
                		if(lizard.getHp() <= 0&& bush.getHp()<= 0 && raidboss.getHp() <= 0 && raidminion.getHp() <= 0) {
                			System.out.println("¡Has ganado el combate!");
                			System.out.println(player.getVictory());
                			System.out.println("- " + player.getName());
                			battle = 1;
                		}         		
                		}
			} else {
				System.out.println("Elige una opción válida");
			}
			}
	}	
}
