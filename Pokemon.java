
public interface Pokemon {
	public String getName();
	public String getType();
	public int getHP();
	public int getTotal();
	public int getAttack();
	public int getDefense();
	public int getSpeed();
	public int getGen();
	public boolean isLegendary();
	public int compareTo(Pokemon otherPokemon);
	
}
