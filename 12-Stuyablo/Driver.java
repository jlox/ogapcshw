import java.util.*;

public class Driver{
    public static void main(String[]args){
    	Random rand = new Random();
    	BaseChar character = new BaseChar();
    	Berserker berserker = new Berserker();
    	Necromancer necromancer = new Necromancer();
    	Assassin assassin = new Assassin();
    	Archer archer = new Archer();
    	Ogre ogre = new Ogre();
    	ogre.boost();
		Scanner sc = new Scanner(System.in);
		String input = "";
		String charType = "";
		while (character.getName().equals("")){
		    while (input.equals("")){
			System.out.println("Hello valiant peasant! What is your name?");
			input = sc.nextLine();
			character.inputName(input);
			input = "";
			System.out.println("Are you sure your name is " + character.getName() + "?");
			input = sc.nextLine();
			if (input.equals("Yes")){
				System.out.println("Alright then");
			}
			else if (input.equals("No")){
				input = "";
			}
			else{
				System.out.println("Sorry, I only take Yes and No so let's start over!");
				input = "";
			}
		    }
		}
		input = "";
		while (input.equals("")){
			System.out.println("Well, " + character.getName() + ", are you a Berserker, a Necromancer, an Assassin, or an Archer?");
			input = sc.nextLine();
			if (input.equals("Berserker")){
				berserker.inputName(character.getName());
				charType = "Berserker";
				berserker.boost();
			}
			else if (input.equals("Necromancer")){
				necromancer.inputName(character.getName());
				charType = "Necromancer";
				necromancer.boost();
			}
			else if (input.equals("Assassin")){
				assassin.inputName(character.getName());
				charType = "Assassin";
				assassin.boost();
			}
			else if (input.equals("Archer")){
				archer.inputName(character.getName());
				charType = "Archer";
				archer.boost();
			}
			else{
				System.out.println("Um, sorry but that's not available to you...");
				input = "";
			}
		}
		input = "";
		String enc = "false";
		/*while (input.equals("")){
			System.out.println("Would you like to check your stats?");
			input = sc.nextLine();
			if (input.equals("Yes")){
				if (charType.equals("Berserker")){
					System.out.println(berserker.getStats());
				}
				else if (charType.equals("Necromancer")){
					System.out.println(necromancer.getStats());
				}
				else if (charType.equals("Assassin")){
					System.out.println(assassin.getStats());
				}
				else if (charType.equals("Archer")){
					System.out.println(archer.getStats());
				}
			}
		}*/
		System.out.println("You find yourself in a cave. You have just woken up and you are incredibly confused.");
		System.out.println("You try to think really hard about what you last remember but that hurts your head so you stop.");
		System.out.println("The pain in your head reminds you that the last thing you remember is an ogre kidnapping your family.");
		System.out.println("Like, your entire family.");
		System.out.println("Stupid brute probably knocked you out too and dragged you to his lair.");
		System.out.println("He can't be far from here.");
		while (input.equals("")){
			System.out.println("What would you like to do?");
			input = sc.nextLine();
			String word1 = "";
			String word2 = "";
			int indexSpace = input.indexOf(" ");
			if (indexSpace==-1 || input.length()-1 == indexSpace){
				System.out.println("Uh, yeah, that's not gonna work.");
			}
			else{
				word1 = input.substring(0,indexSpace);
				word2 = input.substring(indexSpace+1);
			}
			if (word1.equals("Attack")){
				System.out.println("You decide to attack the enemy.");
				double opphealth = ogre.gethealth();
				double oppSTR = ogre.getSTR();
				double oppDEF = ogre.getDEF() - 10;
				double playerATK,playerhealth,playerDEF,playerINT,playerDEX,playerLUK,playermana,playermaxhealth,playermaxmana;
				if (charType.equals("Berserker")){
			    	playerhealth = berserker.gethealth();
			    	playermaxhealth = berserker.getmaxhealth();
				   	playerATK = berserker.getSTR();
					playerDEF = berserker.getDEF() - 10;
				}
				else if (charType.equals("Necromancer")){
			    	playerhealth = necromancer.gethealth();
			    	playermaxhealth = necromancer.getmaxhealth();
			    	playermana = necromancer.getmana();
			    	playermaxmana = necromancer.getmaxmana();
			    	playerATK = necromancer.getINT();
				   	playerDEF = necromancer.getDEF() - 10;
				}
				else if (charType.equals("Assassin")){
			    	playerhealth = assassin.gethealth();
			    	playermaxhealth = assassin.getmaxhealth();
			    	playerATK = assassin.getLUK();					    	
			    	playerDEF = assassin.getDEF() - 10;
				}
				else{
			    	playerhealth = archer.gethealth();
			    	playermaxhealth = archer.getmaxhealth();
			    	playerATK = archer.getDEX();
			    	playerDEF = archer.getDEF() - 10;
				}
				double affect = (oppDEF * -0.4)/1;
				double oppaffect = (playerDEF * -0.4)/1;
				System.out.println(opphealth + "," + playerhealth);
				while (opphealth > 0 && playerhealth > 0 && enc.equals("true")){
					double dmg = 1.1 * playerATK + (rand.nextInt(6) - 3) - affect;
					double oppdmg = 1.1* oppSTR + (rand.nextInt(6) - 3) - oppaffect;
					System.out.println("Do you want to attack, use an ability, use an item, or charm the enemy?");
					input = sc.nextLine();
					indexSpace = input.indexOf(" ");
					word1 = input.substring(0,indexSpace);
					word2 = input.substring(indexSpace + 1);
					if (word1.equals("Attack")){
						opphealth = opphealth - (dmg - affect);
						playerhealth = playerhealth - (oppdmg - oppaffect);
						if (charType.equals("Berserker")){
							System.out.println("You swing your axe wildly at the opponent. Somehow you hit him.");
						}
						else if (charType.equals("Necromancer")){
						System.out.println("You gather a ball of dark matter and fling it at your opponent. You actually hit him.");
						}
						else if (charType.equals("Assassin")){
							System.out.println("You try to swiftly stab your enemy but you clumsily stumble into a wall. You manage to jab him anyways. Good enough.");
						}
						else{
								System.out.println("You aim for your enemy's heart but you get really nervous and hit his arm. Darnit.");
						}
						System.out.println("Your opponent lost " + dmg + " HP and now has " + opphealth + " HP left.");
						System.out.println("The ogre charges at you and you dodge, but he manages to smash his club into your stomach. Ouch, you k bro?");
						System.out.println("You lost " + oppdmg + " HP and you now have " + playerhealth + " HP left.");
					}
					enc = "false";
				}
			}
				else if (word1.equals("Flee")){
					System.out.println("You decide to flee from the enemy.");
					enc = "false";
				}
				else if (word1.equals("Sneak")){
					System.out.println("You decide to try to backstab the enemy.");
					enc = "false";
				}
				else {
					System.out.println("You can't do that.");
				}
				input = "";
			if (word1.equals("Move")){
				System.out.println("You go " + word2 + " a few steps.");
				float ogreEnc = rand.nextFloat();
				if (ogreEnc*100>75){
					System.out.println("You see an ogre in the distance.");
					enc = "true";
				}
			}
			else{
				System.out.println("You can't do that.");
			}
			input = "";
		}
	}
}