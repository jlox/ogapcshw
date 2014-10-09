public class Mage extends Basechar{
    private int manna = 20;

    public setName(String name){
	this.name = name;
    }

    public defaultName(){
	this.name = "Potter";
    }

    public setStats(String name, int mana){
	this.name = name;
	this.mana = mana;
    }

    public in getManna(){
	return manna;
    }
}
