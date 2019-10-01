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
		

		

