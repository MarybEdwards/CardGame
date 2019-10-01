
import java.util.List;
import java.util.ArrayList;
public class cards {
	public final static String MAGIC_CARD = "magic", UPGRADE_CARD = "upgrade", DOWNGRADE_CARD = "downgrade", 
			MAGIC_UNICORN = "special", BASIC_UNICORN = "basic", BABY_UNICORN = "baby", INSTANT_CARD = "instant";
	public final static int DISCARD_ON_DEATH = 0, BRING_TO_HAND_ON_DEATH = 1, BRING_TO_NURSERY_ON_DEATH = 2, 
			CANT_BE_DESTROYED = 3, SPECIAL_DEATH = 4, CONTINUOUS_EFFECT = 0, EFFECT_AT_BEG_OF_TURN = 1, 
			EFFECT_ON_PLAY = 2, NO_EFFECTS = 3, EFFECT_AT_END_OF_TURN = 4;
	public final static boolean BASIC_IS_NEEDED = true, BASIC_IS_NOT_NEEDED = false; 
	/*death type 0 = discard
	 * death type 1 = hand 
	 * death type 2 = nursery
	 * death type 3 = NEVER DESTROYED
	 * death type 4 = special
	 * timing 0 = always effect
	 * timing 1 = beginning of turn effect
	 * timing 2 = on play
	 * timing 3 = no effects
	 * timing 4 = end of turn
	 * basicRequired = to play the card 
	 */
			
		public static List<IndCards> entireDeck () {
			List<IndCards> mainDeck = new ArrayList<IndCards>();
			
			
			for (int i = 0; i <= 2; i++ ) {
				mainDeck.add(new IndCards("Extra Tail", "You must have a Basic Unicorn in your Stable in order to play "
						+ "this card. If this card is in your Stable at the beginning of your turn, you may DRAW an "
						+ "extra card.", UPGRADE_CARD, DISCARD_ON_DEATH, EFFECT_AT_BEG_OF_TURN, BASIC_IS_NEEDED));
			}
			for (int i = 0; i <= 2; i++ ) {
				mainDeck.add(new IndCards("Rainbow Mane", "You must have a Basic Unicorn in your Stable in order to"
						+ " play this card. If this card is in your Stable at the beginning of your turn, you may bring"
						+ " a basic unicorn from your hand directly into your stable.", UPGRADE_CARD, DISCARD_ON_DEATH,
						EFFECT_AT_BEG_OF_TURN, BASIC_IS_NEEDED ));

			}
			for (int i = 0; i <= 1; i++ ) {
				mainDeck.add(new IndCards("Yay","As long as this card is in your Stable, cards you play cannot "
						+ "be Neigh'd", UPGRADE_CARD, DISCARD_ON_DEATH, CONTINUOUS_EFFECT, BASIC_IS_NEEDED));
			}
			for (int i = 0; i <= 1; i++ ) {
				mainDeck.add(new IndCards("Glitter Bomb", "If this card is in your Stable at the beginning of your "
						+ "turn, you may SACRIFICE a card, then DESTROY a card.", UPGRADE_CARD, DISCARD_ON_DEATH, 
						EFFECT_AT_BEG_OF_TURN, BASIC_IS_NOT_NEEDED));
			}
			mainDeck.add(new IndCards("Rainbow Aura", "As long as this card is in your Stable, your Unicorns cannot be"
					+ " destroyed.", UPGRADE_CARD, DISCARD_ON_DEATH, CONTINUOUS_EFFECT, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Unicorn Lasso", "If this card is in your Stable at the beginning of your turn, "
					+ "you may move a Unicorn from any player's Stable to your Stable. At the end of your turn, move "
					+ "the Unicorn back to its original Stable", UPGRADE_CARD, DISCARD_ON_DEATH, EFFECT_AT_BEG_OF_TURN,
					BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Summoning Ritual", "If this card is in your Stable at the beginning of your "
					+ "turn, you may DISCARD two Unicorns, then bring a Unicorn directly into your Stable from the "
					+ "discard pile.", UPGRADE_CARD, DISCARD_ON_DEATH, EFFECT_AT_BEG_OF_TURN, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Double Dutch", "If this card is in your Stable at the beginning of your "
					+ "turn, you may play two cards during your turn instead of one.", UPGRADE_CARD, DISCARD_ON_DEATH, 
					EFFECT_AT_BEG_OF_TURN, BASIC_IS_NOT_NEEDED));
		
		
			mainDeck.add(new IndCards("Narwhal", "This card has no special powers but it sure is cute", BASIC_UNICORN,
					DISCARD_ON_DEATH, NO_EFFECTS, BASIC_IS_NOT_NEEDED));
			for (int i = 0; i <= 2; i++ ) {
				mainDeck.add(new IndCards("Basic Unicorn", "Popped collars are for date nights only.", BASIC_UNICORN, 
						DISCARD_ON_DEATH, NO_EFFECTS, BASIC_IS_NOT_NEEDED));
			}
			for (int i = 0; i <= 2; i++ ) {
				mainDeck.add(new IndCards("Basic Unicorn", "Dance like nobody's watching.", BASIC_UNICORN, 
						DISCARD_ON_DEATH, NO_EFFECTS, BASIC_IS_NOT_NEEDED));
			}
			for (int i = 0; i <= 2; i++ ) {
				mainDeck.add(new IndCards ("Basic Unicorn", "Pumpkin spice is the spice of life.", BASIC_UNICORN, 
						DISCARD_ON_DEATH, NO_EFFECTS, BASIC_IS_NOT_NEEDED));
			}
			for (int i = 0; i <= 2; i++ ) {
				mainDeck.add(new IndCards ("Basic Unicorn", "Vinyl records and mixtapes only", BASIC_UNICORN, 
						DISCARD_ON_DEATH, NO_EFFECTS, BASIC_IS_NOT_NEEDED));
			}
			for (int i = 0; i <= 2; i++ ) {
				mainDeck.add(new IndCards ("Basic Unicorn", "#nomakeup #nofilter #sunnies #shameless"
						+ "#selfie #TGIF #unicornhairdontcare", BASIC_UNICORN, DISCARD_ON_DEATH, NO_EFFECTS, 
						BASIC_IS_NOT_NEEDED));
			}
			for (int i = 0; i <= 2; i++ ) {
				mainDeck.add(new IndCards ("Basic Unicorn", "Beards are like, so hot.", BASIC_UNICORN, 
						DISCARD_ON_DEATH, NO_EFFECTS, BASIC_IS_NOT_NEEDED));
			}
			for (int i = 0; i <= 2; i++ ) {
				mainDeck.add(new IndCards ("Basic Unicorn", ":) :) :) :)", BASIC_UNICORN, DISCARD_ON_DEATH, NO_EFFECTS,
						BASIC_IS_NOT_NEEDED));
			}
		
		
			mainDeck.add(new IndCards("Sadistic Ritual", "If this card is in your Stable at the beginning "
					+ "of your turn, SACRIFICE a Unicorn, then DRAW an extra card.", DOWNGRADE_CARD, DISCARD_ON_DEATH, 
					EFFECT_AT_BEG_OF_TURN, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Nanny Cam", "As long as this card is in your Stable,"
					+ " you must play with your hand visible to all players.", DOWNGRADE_CARD, DISCARD_ON_DEATH, 
					CONTINUOUS_EFFECT, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Slowdown", "As long as this card is in your Stable, you cannot play instant "
					+ "cards.", DOWNGRADE_CARD, DISCARD_ON_DEATH, CONTINUOUS_EFFECT, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Pandamonium", "As long as this card is in your Stable, all of your Unicorns are"
					+ " considered Pandas and NOT Unicorns. Cards that affect Unicorns do not affect Pandas.", 
					DOWNGRADE_CARD, DISCARD_ON_DEATH, CONTINUOUS_EFFECT, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Tiny Stable", "As long as this card is in your Stable, "
					+ "you can only have five Unicorns in your Stable.", DOWNGRADE_CARD, DISCARD_ON_DEATH,
					CONTINUOUS_EFFECT, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Barbed Wire", "As long as this card is in your Stable, you must "
					+ "DISCARD a card earch time a Unicorn enters or leaves your Stable.", DOWNGRADE_CARD, 
					DISCARD_ON_DEATH, CONTINUOUS_EFFECT, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Blinding Light", "As long as this card is in your Stable, your Unicorn card "
					+ "cannot be activated", DOWNGRADE_CARD, DISCARD_ON_DEATH, CONTINUOUS_EFFECT, 
					BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Broken Stable", "As long as this card is in your Stable, "
					+ "you cannot play Upgrade cards.", DOWNGRADE_CARD, DISCARD_ON_DEATH, CONTINUOUS_EFFECT,
					BASIC_IS_NOT_NEEDED));
		
		
			mainDeck.add(new IndCards("Super Neigh", "Play this card when any player tries to "  
					+ "play a card. Stop that player's card from coming " 
					+ "into play an send it to the discard pile instead."
					+ " This card cannot be Neigh'd", INSTANT_CARD, DISCARD_ON_DEATH, EFFECT_ON_PLAY, 
					BASIC_IS_NOT_NEEDED));
			for (int i = 0; i <= 13; i++) {
				mainDeck.add(new IndCards("Neigh", "Play this card when any player tries to play a card. Stop that "
						+ "player's card from coming into play an send it to the discard pile instead.", INSTANT_CARD, 
						DISCARD_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			}
			
		
			
			for (int i = 0; i <= 2; i++ ) {
				mainDeck.add(new IndCards("Back Kick", "Return card in any player's Stable to "
						+ "that player's hand. That player must then DISCARD a card.", MAGIC_CARD, DISCARD_ON_DEATH, 
						EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			}
			for (int i = 0; i <= 2; i++ ) {
				mainDeck.add(new IndCards("Unicorn Poison", "DESTROY a Unicorn", MAGIC_CARD, DISCARD_ON_DEATH, 
						EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			}
			for (int i = 0; i <= 1; i++ ) {
				mainDeck.add(new IndCards("Unicorn Swap", "Trade a Unicorn in your Stable for a Unicorn in any"
						+ " player's Stable", MAGIC_CARD, DISCARD_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			}
			for (int i = 0; i <= 1; i++ ) {
				mainDeck.add(new IndCards("Two-For-One", "SACRIFICE a card, then DESTROY two cards.", MAGIC_CARD, 
						DISCARD_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			}
			for (int i = 0; i <= 1; i++ ) {
				mainDeck.add(new IndCards("Change of Luck", "DRAW two card, DISCARD three cards, then take another "
						+ "turn", MAGIC_CARD, DISCARD_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			}
			for (int i = 0; i <= 1; i++ ) {
				mainDeck.add(new IndCards("Glitter Tornado", "Return a card in each player's Stable to that player's "
						+ "hand.", MAGIC_CARD, DISCARD_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			}
			for (int i = 0; i <= 1; i++ ) {
				mainDeck.add(new IndCards("Unfair Bargain", "Trade hands with any player.", MAGIC_CARD, 
						DISCARD_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			}
			for (int i = 0; i <= 1; i++ ) {
				mainDeck.add(new IndCards("Re-Target", "Move an Ugrade and Downgrade card from any player's Stable "
						+ "to another player's Stable.", MAGIC_CARD, DISCARD_ON_DEATH, EFFECT_ON_PLAY, 
						BASIC_IS_NOT_NEEDED));
			}
			mainDeck.add(new IndCards("Unicorn Shrinkray", "Replace all Unicorns in any player's Stable with "
					+ "Baby Unicorn with Baby Unicorns from the Nursey. All of the replaced Unicorns go to "
					+ "the Discard Pile", MAGIC_CARD, DISCARD_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Blatant Thievery", "Look at any player's hand. Take a card of your choice and "
					+ "add it to your hand.", MAGIC_CARD, DISCARD_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Reset Button", "Each player must SACRIFICE all of their Upgrade and Downgrade "
					+ "cards. Shuffle the discard pile back into the mainDeck.", MAGIC_CARD, DISCARD_ON_DEATH,
					EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED ));
			mainDeck.add(new IndCards("Targeted Destruction", "SACRIFICE or DESTROY an Upgrade or"
					+ " Downgrade card.", MAGIC_CARD, DISCARD_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Good Deal", "DRAW three card, then DISCARD a card.", MAGIC_CARD, 
					DISCARD_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Shake Up", "Shuffle this card, your hand, and the discard pile "
					+ "back into the mainDeck, then DRAW five.", MAGIC_CARD, DISCARD_ON_DEATH, EFFECT_ON_PLAY, 
					BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Mystical Vortex", "Each player must DISCARD a card. Shuffle the discard pile "
					+ "back into the mainDeck.", MAGIC_CARD, DISCARD_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
		
		
			mainDeck.add(new IndCards("Swift Flying Unicorn", "When this card enters your stable, you may "
					+ "choose an instant card from the discard pile and add it "
					+ "to you hand. If this card sacrificed or destroyed, return"
					+ " it to your hand.", MAGIC_UNICORN, BRING_TO_HAND_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Stabby the Unicorn", "If this card is sacrificed or destroyed, you may DESTROY "
					+ "a Unicorn", MAGIC_UNICORN, DISCARD_ON_DEATH, EFFECT_AT_END_OF_TURN, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Majestic Flying Unicorn", "When this card enters your Stable, you may choose"
					+ " a Unicorn from the discard pile and add it to your hand. If this card is scarificed or "
					+ "destroyed, return it to your hand", MAGIC_UNICORN, BRING_TO_HAND_ON_DEATH, EFFECT_ON_PLAY, 
					BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Black Knight Unicorn", "If one of your Unicorns would be destroyed,"
					+ " you may SACRIFICE this card instead.", MAGIC_UNICORN, DISCARD_ON_DEATH, CONTINUOUS_EFFECT, 
					BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Extremely Destructive Unicorn", "When this card enters your Stable, each player"
					+ " must SACRIFICE a Unicorn", MAGIC_UNICORN, DISCARD_ON_DEATH, EFFECT_ON_PLAY, 
					BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Narwhal Torpedo", "When this card enters Stable, SACRIFICE all Downgrade"
					+ " cards in your Stable", MAGIC_UNICORN, DISCARD_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Extremely Fertile Unicorn", "If this card is in you Stable at the beginning "
					+ "of your turn, you may DISCARD a card. If you do, bring a Baby Unicorn directly into your Stable "
					+ "from the Nursery", MAGIC_UNICORN, DISCARD_ON_DEATH, EFFECT_AT_BEG_OF_TURN, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Magical Flying Unicorn", "When this card your Stable, you may choose a Magic "
					+ "card from the discard pile and add it to your hand. If this card sacrificed or destroyed, "
					+ "return it to your hand.", MAGIC_UNICORN, BRING_TO_HAND_ON_DEATH, EFFECT_ON_PLAY, 
					BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Magical Kittencorn", "As long as this card is in your Stable, it cannot"
					+ " be destroyed or affected by Magic card.", MAGIC_UNICORN, CANT_BE_DESTROYED, CONTINUOUS_EFFECT, 
					BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Zombie Unicorn", "If this card is you Stable at the beginning of your"
					+ " turn, you may DISCARD a Unicorn. If you do, choose a Unicorn from "
					+ "discard pile and bring it directly into your Stable, then immediately"
					+ " end your turn", MAGIC_UNICORN, DISCARD_ON_DEATH, EFFECT_AT_BEG_OF_TURN, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Puppicorn", "At the end of your turn, move the Puppicorn to the Stable "
					+ "of the player on your left. this card cannot sacrificed destroyed", MAGIC_UNICORN, 
					CANT_BE_DESTROYED, EFFECT_AT_END_OF_TURN, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Americorn", "When this card enters your Stable, you may take a card at random "
					+ "from any player's hand and add it to your hand.", MAGIC_UNICORN, DISCARD_ON_DEATH, 
					EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Queen Bee Unicorn", "As long as this card is in your Stable, no other player "
					+ "can play Basic Unicorns.", MAGIC_UNICORN, DISCARD_ON_DEATH, CONTINUOUS_EFFECT, 
					BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("The Great Narwhal", "When this card your Stable, you may search the mainDeck "
					+ "for a card with \"Narwhal\" in its name. Add it to our hand, then shuffle the main deck.", 
					MAGIC_UNICORN, DISCARD_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Unicorn Pheonix", "When this card enters your Stable, DISCARD a card. If this "
					+ "card is sacrificed or destroyed, bring it directly back into your Stable. If you"
					+ " are unable to DISCARD a card, this card is destroyed.", MAGIC_UNICORN, SPECIAL_DEATH, 
					CONTINUOUS_EFFECT, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Ginormous Unicorn", "This card counts for two Unicorns in your Stable. As "
					+ "long as this card is in your Stable, you cannot play and instant cards.", MAGIC_UNICORN, 
					DISCARD_ON_DEATH, CONTINUOUS_EFFECT, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Rhinocorn", "If this card is in your Stable at the beginning of your turn, "
					+ "you may DESTROY a Unicorn, then end your turn immediately.", MAGIC_UNICORN, DISCARD_ON_DEATH, 
					EFFECT_AT_BEG_OF_TURN, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Chainsaw Unicorn", "When this card enter your Stable, you may SACRIFICE or"
					+ " DESTROY an Upgrade or Downgrade card", MAGIC_UNICORN, DISCARD_ON_DEATH, EFFECT_ON_PLAY, 
					BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Shark With A Horn", "When this card enters your Stable, you may DESTROY a "
					+ "Unicorn. If you do, SACRIFICE this card.", MAGIC_UNICORN, DISCARD_ON_DEATH, EFFECT_ON_PLAY, 
					BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Classy Narwhal", "When this card enters your Stable, you may search the main "
					+ "deck for an Upgrade card. Add it to your hand, then shuffle mainDeck.", MAGIC_UNICORN, 
					DISCARD_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Llamacorn", "When this card enters Stable, each player must DISCARD "
					+ "a card. shuffle the discard pile back into the mainDeck.", MAGIC_UNICORN, DISCARD_ON_DEATH, 
					EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Unicorn on the Cob", "When this card enters your Stable, DRAW two cards then "
					+ "DISCARD a card", MAGIC_UNICORN, DISCARD_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Shabby the Narwhal", "When this card enters your Stable, you may search the "
					+ "main deck for a Downgrade card. Add it to your hand, then shuffle the mainDeck.", 
					MAGIC_UNICORN, DISCARD_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Mermaid Unicorn", "When this card enters your Stable, you may return a card in "
					+ "any player's Stable to that player's hand.", MAGIC_UNICORN, DISCARD_ON_DEATH, EFFECT_ON_PLAY, 
					BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Alluring Narwhal", "When this card enters your Stable, you may move an upgrade "
					+ "card from any player's Stable to your Stable", MAGIC_UNICORN, DISCARD_ON_DEATH, EFFECT_ON_PLAY, 
					BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Seductive Unicorn", "When this card enters your Stable, you may move a Unicorn "
					+ "from any player's Stable to your Stable. If this card leaves your Stable, move move the "
					+ "Unicorn back to its original Stable.", MAGIC_UNICORN, DISCARD_ON_DEATH, EFFECT_ON_PLAY, 
					BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Annoying Flying Unicorn", "When this card enters your Stable, you may choose any"
					+ " player. That player must DISCARD a card. If this card is sacrificed or destroyed, return it "
					+ "to your hand.", MAGIC_UNICORN, BRING_TO_HAND_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Rainbow Unicorn", "When this card enters your Stable, you may also bring a Basic"
					+ " Unicorn directly into your Stable from your hand.", MAGIC_UNICORN, DISCARD_ON_DEATH, 
					EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Greedy Flying Unicorn", "When this card enters your stable, DRAW a card. If "
					+ "this card is sacrificed or destroyed, return it to your hand.", MAGIC_UNICORN, 
					BRING_TO_HAND_ON_DEATH, EFFECT_ON_PLAY, BASIC_IS_NOT_NEEDED));
			mainDeck.add(new IndCards("Angel Unicorn", "If this card is in your Stable at the beginning of your turn, "
					+ "you may SACRIFICE it. If you do, choose a Unicorn from the discard pile and bring it directly "
					+ "into your Stable", MAGIC_UNICORN, DISCARD_ON_DEATH, EFFECT_AT_BEG_OF_TURN, BASIC_IS_NOT_NEEDED));
			
		return mainDeck;
			
	}
		
		

		
		
		
		
	
	public static List<IndCards> babyCards(){
		List<IndCards> nurseryDeck = new ArrayList<IndCards>();
		for (int i = 0; i <= 11; i++) {
			nurseryDeck.add(new IndCards("Baby Unicorn","If this card would be sacrificed, destroyed or returned to "
					+ "your hand, return it to the Nursery instead.", BABY_UNICORN, i, BRING_TO_NURSERY_ON_DEATH));
		}
		nurseryDeck.add(new IndCards("Baby Narwhal","If this card would be sacrificed, destroyed or returned to your "
				+ "hand, return it to the Nursery instead.", BABY_UNICORN, 12, BRING_TO_NURSERY_ON_DEATH));
		return nurseryDeck;
	}
	
}
