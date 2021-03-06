/**
* abstract Monster subclass Watermonster
*/

public class WaterMonster extends Monster {
	
	/**
	* constructor
	*/
	public WaterMonster(String name) {
		super(name);
	}
	
	/**
	* subclass provides actual implementation
	*/
	@Override
	public String attack() {
		return "attack with water!";
	}
}
