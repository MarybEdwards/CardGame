import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Player{
	public String name;
	public int order, playNum = 1, drawNum = 1, maxStableCards = 20, handSize;
	public List<IndCards> stable, hand, affectCards;
	public boolean bringBaby = false, differentDeath = false, bringBasic = false, blockable = true, destroyable = true,
			showHand = true, barbedWire = false, playAffect = true;
	
	public Player (String name, int order) {
		this.name  = name;
		this.order = order;
	}
	public List<IndCards> getHand() {
		return hand;
	}
	public List<IndCards> getStable() {
		return stable;
	}
	public List<IndCards> getAffectCards() {
		return affectCards;
	}
	public String getName() {
		return name;
	}
	public int getOrder() {
		return order;
	}
	public int getPlayNum () {
		return playNum;
	}
	public int getDrawNum () {
		return drawNum;
	}
	public int getHandSize () {
		return hand.size();
	}
	
	public void addTo(IndCards addedCard, List<IndCards> placement) {
		placement.add(addedCard);
		if (addedCard.getType().equals("special")) {
			unicornAffects(addedCard.getName());
		}else if (addedCard.getType().equals("upgrade")||addedCard.getType().equals("downgrade")) {
			upgradeDowngradeAffects (addedCard.getName());
		}
	}
	
	
	public void removeFrom(IndCards removedCard, List<IndCards> takenFrom) {
		takenFrom.remove(removedCard);
	}

	public void unicornAffects(String cardName) {
		if (cardName.equals("Swift Flying Unicorn")) {
			//MAKE METHOD FOR DISPLAYING CARD OF A TYPE FROM DISCARD- INSTANT
		}else if (cardName.equals("Majestic Flying Unicorn")) {
			//METHOD FOR DISPLAYING CARD OF A TYPE FROM DISCORD- UNICORN 
		}else if (cardName.equals("Majestic Flying Unicorn")) {
			//METHOD FOR DISPLAYING CARD OF A TYPE FROM DISCORD- UNICORN 
		}else if (cardName.equals("Black Knight Unicorn")) {
			differentDeath = true; 
		}else if (cardName.equals("Extremely Destructive Unicorn")) {
			//METHOD FOR DISPLAYING CARD OF A TYPE FROM DISCORD- UNICORN 
		}else if (cardName.equals("Narwhal Torpedo")) {
			for (IndCards check: affectCards) {
				if (check.getType().equals("downgrade")) {
					affectCards.remove(check);
				}
			}
		}else if (cardName.equals("Extremely Fertile Unicorn")) {
			bringBaby = true;
			//METHOD FOR BEGINNING OF TURN EFFECTS
		}else if (cardName.equals("Magical Flying Unicorn")) {
			//METHOD FOR DISPLAYING A CARD OF A TYPE FROM DISCARD - MAGIC
		}else if (cardName.equals("Zombie Unicorn")) {
			//METHOD FOR BEGINNING OF TURN, DISCARD UNICORN TO BRING UNICORN FROM DISCARD DIRECTLY INTO STABLE AND END TURN
		}else if (cardName.equals("Puppicorn")) {
			//METHOD FOR END OF TURN REQUIRED ACTIONS
		}else if (cardName.equals("Americorn")) {
			//MUST BE A METHOD IN MAIN TO INTERACT WITH OTHER PLAYERS
			//METHOD TO BE WRITTEN
		}else if (cardName.equals("Queen Bee Unicorn")) {
			for (IndCards basicSearch: cards.entireDeck()) {
				if (basicSearch.getType().equals("basic")) {
					basicSearch.changePlayable();
				}
			}
		}else if (cardName.equals("The Great Narwhal")) {
			//METHOD FOR SEARCHING DECK FOR CARDS CONTAINING NAME NARWHAL
		}else if (cardName.equals("Unicorn Pheonix")) {
			//METHOD FOR DISCARDING A CARD
		}else if (cardName.equals("Ginormous Unicorn")) {
			for (IndCards check: hand) {
				if (check.getType().equals("instant")) {
					check.changePlayable();
				}
			}
		}else if (cardName.equals("Rhinocorn")) {
			//METHOD FOR SPECIAL BEGINNING OF TURN ACTIONS AND THEN TURN ENDS
		}else if (cardName.equals("Chainsaw Unicorn")) {
			//chose upgrade or downgrade anywhere to destroy
			//must be in main method because interacts with other players but is called here 
			//because it starts when it enters stable
		}else if (cardName.equals("Shark With A Horn")) {
			//chose if you want to destroy unicorn, 
			//interacts with other players so it must be in main method
			//sacrifice if does so
		}else if (cardName.equals("Classy Narwhal")) {
			
		}
	}
	
	
	
	
	public void upgradeDowngradeAffects (String cardName) {
		if (cardName.equals("Extra Tail")) {
			drawNum = 2;
		}else if (cardName.equals("Rainbow Mane")) {
			bringBasic = true;
		}else if (cardName.equals("Yay")) {
			blockable = false;
		}else if (cardName.equals("Glitterbomb")) {
			//MODIFIES METHOD FOR OPTIONAL BEGINNING OF TURN
		}else if (cardName.equals("Rainbow Aura")) {
			destroyable = true;
		}else if (cardName.equals("Unicorn Lasso")) {
			//MODIFIES METHOD FOR OPTIONAL BEGINNING OF TURN
		}else if (cardName.equals("Summoning Ritual")) {
			//MODIFIES METHOD FOR OPTIONAL BEGINNING OF TURN
		}else if (cardName.equals("Double Dutch")) {
			playNum = 2;
		}else if (cardName.equals("Nanny Cam")) {
			showHand = true;
		}else if (cardName.equals("Slow Down")) {
			for (IndCards check: hand) {
				if (check.getType().equals("instant")) {
					check.changePlayable();
				}
			}
		}else if (cardName.equals("Tiny Stable")) {
			while (stable.size()>5) {
				//SACRIFICE METHOD TO BE MADE
			}
			maxStableCards = 5;
		}else if (cardName.equals("Barbed Wire")) {
			barbedWire = true;
			//MODIFY GET CARD IN STABLE AND LEAVING STABLE TO INCLUDE DISCARDING A CARD
		}else if (cardName.equals("Blinding Light")) {
			playAffect = false;
			//MODIFY UNICORNS AFFECT TO TURN OFF IF FALSE
		}else if (cardName.equals("Broken Stable")) {
			for (IndCards check: hand) {
				if (check.getType().equals("upgrade")) {
					check.changePlayable();
				}
			}
		}
	}
	
	public void endAffects() {
		//add in stuff that changes at end of turn
	}
}


