package practice13.common;

public class SuperHero extends Hero {
	Item equipment;

	public int attack() {
		return super.attack() + equipment.getAdditionalDamage();
	}

	//getter
	public Item getEquipment() {
		return this.equipment;
	}

	//setter
	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}
}
