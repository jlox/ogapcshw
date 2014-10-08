public class Warrior extends Basechar{
    private int healthboost=5;
    private int health=12345;
    public void attack(Basechar other){
	System.out.println(this.getName()+" is super attacking "+other.getName());
    }
    public int getHealth(){
	return health+super.getHealth();
    }
}
