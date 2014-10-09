/* superclass of Warrior and Mage */
public class Basechar {
    private int health=20;
    private String name;

    public defaultName(){
	this.name = "Jakob";
    }

    public void attack(Basechar other){
	System.out.println(this.getName()+" is attacking "+other.getName());
    }

    public setName(String name){
	this.name = name;
    }
    public void getName(){
	return name;
    }

    public int getHealth() {
	return health;
    }
    public void setHealth(int i){
	health = 1;
    }
}
