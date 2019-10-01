public class IndCards {
	private String description, type, cardName;
	private boolean basicRequired, playAble;
	private int ranking, timing, deathType;
	
	public IndCards (String name, String descript, String type, int death, int effectTime, boolean basicNeeded) {
		this.cardName = name;
		this.type = type;
		this.description = descript;
		this.deathType = death;
		this.timing = effectTime;
		this.basicRequired = basicNeeded;
		this.playAble = true;
		
	}
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
	public IndCards (String name, String descript, String type, int rank, int death) {
		this.cardName = name;
		this.type = type;
		this.description = descript;
		this.ranking = rank;
		this.deathType = death;
	}
	
	/*public int getRank() {
		return ranking;
	}
	
	public boolean getPlayable() {
		return playAble;
	}
	public void changePlayable() {
		playAble = !playAble;
	}
	
	public String getName(){
		return cardName;
	}
	
	public String getDescript() {
		return description;
	}
	
	public String getType() {
		return type;
	}
	public int getDeath() {
		return deathType;
	}
	public int getTiming() {
		return timing;
	}
	public boolean getNeedBasic() {
		return basicRequired;
	}
	*/ 
	//dont think that any of the above code is needed because there's a different way of calling for that information
}






















