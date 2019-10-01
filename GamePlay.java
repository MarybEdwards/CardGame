/*import java.util.List;
import javax.swing.*;
import java.awt.event.*;

public class GamePlay { 
	
		
	public static void main(String[] args){
		boolean acceptable = false;
		JFormattedTextField playerAsk = new JFormattedTextField("How many people are playing?");
		int playerNum;
		JFrame windows = new JFrame("Unstable Unicorns");
		JButton confirm = new JButton ("Submit");
		JTextField information = new JTextField(10);
		JPanel interfacing = new JPanel();
		interfacing.add(information);
		interfacing.add(confirm);
		windows.add(interfacing);
		windows.setExtendedState(JFrame.MAXIMIZED_BOTH);
		windows.show();
		windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		

		
		
		List<IndCards> deck = Deck.theDeck();
		
		
	}
}
*/

import java.util.List;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.*;


public class GamePlay {
/*	public static List<IndCards> theDeck;
	public static List<IndCards> nursery;
	public static List<IndCards> discard;

	
//	public static boolean sacrificeMade = false, discardMade = false, tempSteal = false, rainBow = false, glitterBomb = false, 
		//	lasso = false, summoning = false, fertile = false, zombie = false, rhino = false, angel = false;

	public static int drawNum, playNum;
	
	public static void drawCard(Player person) {
		IndCards nextCard = theDeck.get(0);
		person.addToHand(nextCard);
		theDeck.remove(0);	
	}
	

	//PUT ALL UNICORN EFFECTS INTO CARD, LOOK INSIDE PLAYER CLASS FOR ALL POSSIBLE EFFECTS, ADD IT TO THE LIST
	//WHEN PLAYED IN STABLE, IF LEAVES, SPECIAL METHOD TO REMOVE EFFECT 
	
	
	public static void playerTurn(Player currentPlayer) {
		//DO STUFF HERE ONCE YOU HAVE A GUI
		if (currentPlayer.playerWin()) {
			//SOMETHING TO END THE GAME 
		}
	}
	
	
	
	
//SACRIFICE METHOD TO BE MADE
//BRING DIRECTLY INTO STABLE METHOD TO BE MADE
//DESTROY METHODE TO BE MADE
//STEAL METHOD TO BE MADE
//RETURN METHOD TO BE MADE
//DISCARD METHOD TO BE MADE
	

	public static void main(String [] args) {
		theDeck = cards.entireDeck();
		nursery = cards.BabyCards();
		
		String name;
		int numberOfPlayers = 0;
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		

		
		Collections.shuffle(theDeck);
		Collections.shuffle(nursery);
		while (numberOfPlayers < 1 || numberOfPlayers > 7) {
			System.out.println("How many players? ");
			numberOfPlayers = scan.nextInt();
		}
		Player[] people = new Player[numberOfPlayers];
		for (int i = 0; i < numberOfPlayers; i++) {
			System.out.println("What is player " + (i + 1) + "'s name?");
			name = scan1.nextLine();
			people[i] = new Player(name);
			int cardDrawCounter = 0;
			while (cardDrawCounter < 5) {
				drawCard(people[i]);
				cardDrawCounter ++;
			}
			for (IndCards eachCard: people[i].getHand()) {
				System.out.println(eachCard.getName());
			}
		}
		
	}	
		
		
		
		
		
		
*/
	
	
	public List<IndCards> mainDeck, discardPile, nursery;
	public List <Player> peoplePlaying;
	public Player currentPlayer;
	public int playingOrder, drawNum, playNum;
	public static JFrame gameBoard;
	
	public void setUp() {
		mainDeck = cards.entireDeck();
		nursery = cards.babyCards();
		Collections.shuffle(mainDeck);
		Collections.shuffle(nursery);
	}
	
	public void drawCard(Player currentPlayer) {
		if (!(drawNum == 0)) {
			currentPlayer.addTo(mainDeck.get(0), currentPlayer.getHand());
			mainDeck.remove(0);
			drawNum -= 1;
		}else if (!(playNum == 0)) {
			currentPlayer.addTo(mainDeck.get(0), currentPlayer.getHand());
			mainDeck.remove(0);
			playNum -= 1;
		}
	}
	
	public void endTurn(Player currentPlayer) {
		currentPlayer.endAffects();
	}
	
	public Player findNextPlayer() {
		for (Player findPlayer: peoplePlaying) {
			if (findPlayer.getOrder() == playingOrder) {
				return findPlayer;
			}
		}
		return new Player("error", 20);
	}
	
	public void playCard(Player currentPlayer, IndCards clickedCard) {
		if (clickedCard.getPlayable()) {
			currentPlayer.removeFrom(clickedCard, currentPlayer.getHand());
			if( clickedCard.getType().equals("special") || clickedCard.getType().equals("basic")){
				currentPlayer.addTo(clickedCard, currentPlayer.getStable());
			}else if (clickedCard.getType().equals("magic")) {
				discardPile.add(clickedCard);
			}else {
				//click on player 
				//chosenPlayer.addTo(clickedCard,chosenPlayer.getAffectCards());
			}
		}
	}
	
	public static void showScreen() {
		gameBoard = new JFrame ("Game Board");
		gameBoard.setVisible(true);
		gameBoard.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		gameBoard.setExtendedState(JFrame.MAXIMIZED_BOTH);
		JLabel welcoming = new JLabel ("Welcome to Unstable Unicorns");
		gameBoard.setLayout(new BorderLayout());
		gameBoard.add(welcoming, BorderLayout.CENTER);
		JButton submit = new JButton ("Submit");
		submit.setSize(1000,1000);
		submit.setToolTipText("this is a hoover over tip thingy");
		
	} 
	
	
	public static void main (String[] args) {
		showScreen();
	}
}
		

		

