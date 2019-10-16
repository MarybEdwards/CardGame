public class IndCards {
	private String description, type, cardName;
	private boolean basicRequired, playAble;
	private int ranking, timing, deathType, effectTime;
	
	
	public IndCards(String name, String descript, String type, int deathType, int effectTime, boolean basicRequired, int ranking){
		this.name = name;
		this.type = type;
		this.descript = descript;
		this.deathType = deathType;
		this.timing = effectTime;
		this.basicRequired = basicRequired;
		this.ranking = ranking;
		this.playAble = true;
		this.effectTime = effectTime
	}
	
	
	public IndCards (String name, String descript, String type, int deathType, int effectTime, boolean basicRequired) {
		this(name, descript, type, deathType, effectTime, basicRequired, 0);
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
	public IndCards (String name, String descript, String type, int ranking, int deathType) {
		this(name, descript, type, deathType, 3, false, ranking);
	}
	
	
	public int getRank() {
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
	 
	
}






















