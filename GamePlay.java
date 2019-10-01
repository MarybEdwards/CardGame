import java.util.List;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.*;


public class GamePlay {	
	public List<IndCards> mainDeck, discardPile, nursery;
	public List <Player> peoplePlaying;
	public Player currentPlayer;
	public int playingOrder, drawNum, playNum;
	public static JFrame gameBoard;
	
	public void setUp() {
		//the beginning of game, in which the deck and nursery is initialized and shuffled 
		mainDeck = cards.entireDeck();
		nursery = cards.babyCards();
		Collections.shuffle(mainDeck);
		Collections.shuffle(nursery);
	}
	
	public void drawCard(Player currentPlayer) {
		//the player clicks on the deck to draw a card and add to their hand 
		if (!(drawNum == 0)) {
			//players can only draw once, unless they have a special effect in their stable, this 
			//ensures that the player doesn't draw more than allowed
			currentPlayer.addTo(mainDeck.get(0), currentPlayer.getHand());
			mainDeck.remove(0);
			drawNum -= 1;
		}else if (!(playNum == 0)) {
			//Instead of playing their card, they may draw another card, this ensures that they have
			//that option if they wanted to, but doesn't accidentally take away the amount of times they 
			//can play if they haven't drawn yet
			currentPlayer.addTo(mainDeck.get(0), currentPlayer.getHand());
			mainDeck.remove(0);
			playNum -= 1;
		}
	}
	
	public void endTurn(Player currentPlayer) {
		//called in case the something happens at the end of the player's turn
		currentPlayer.endAffects();
	}
	
	public void findNextPlayer() {
		//returns the next player in the playing order
		playingOrder ++;
		//increases playing order number so the program goes to the next person
		if (playingOrder >= peoplePlaying.size()){
			//for when the playing order resets 
			playingOrder = 0;
		}
		for (Player findPlayer: peoplePlaying) {
			//finds who has the current playing order by going through each player
			if (findPlayer.getOrder() == playingOrder) {
				currentPlayer = findPlayer;
			}
		}
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
		

		

