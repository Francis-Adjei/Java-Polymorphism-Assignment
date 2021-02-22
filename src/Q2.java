

 class Monster {

	private String name;


	@Override
	public String toString() {
		return "Monster [name=" + name + "]";
	}


	public Monster(String name) {
		super();
		this.name = name;
	}


	public String attack() {
		String newMonster = "Err.. I don't know how to attack!";		
		return newMonster;
	}}

class FireMonster extends Monster {

	public FireMonster(String name) {
		super(name);
	}

	public String attack() {
		String attack = "Attack with fire!";
		return attack;
	}}
	

	
class StoneMonster extends Monster {

	public StoneMonster(String name) {
		super(name);
	}

	public String attack() {
		String attack = "Attack with stones!";
		return attack;
	}}

class WaterMonster extends Monster {

	public WaterMonster(String name) {
		super(name);
	}

	public String attack() {
		String attack = "Attack with water!";
		return attack;
		
	}}


public class Q2 {

	public static void main(String[] args) {
		
		Monster obj = new FireMonster("Francis"); 
		Monster obj1 = new WaterMonster("Kwabena"); 
		Monster obj2 = new StoneMonster("Ama"); 
		Monster obj3 = new Monster("Graham");
		
		System.out.println(obj.attack()); 
		System.out.println(obj1.attack()); 
		System.out.println(obj2.attack()); 
		System.out.println(obj3.attack()); 
		}

	         

}
