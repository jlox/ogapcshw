public class Driver {

    public static void main(String[] args){
	Character c = new Character();

	c.setHealth(150);
	System.out.println(c.getHealth());

	Warrior w = new Warrior();
	w.setHeatlh(200);
	System.out.println(w.getHealth());

	Warrior x = new Warrior();
	System.out.println(x.getHealth());
    }


}
