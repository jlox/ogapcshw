public class Assassin extends BaseChar{
    private double dexBoost = 5;
    private double luckBoost = 10;
    public void inputName(String name){
        super.inputName(name);
    }
    public String getName(){
        return super.getName();
    }
    public void boost(){
        super.addDEX(this.dexBoost);
        super.addLUK(this.luckBoost);
    }
    public String getStats(){
        String s = "";
        s = s + "Your health is " + this.getmaxhealth() + "\n";
        s = s + "Your mana is " + this.getmaxmana() + "\n";
        s = s + "Your strength is " + this.getSTR() + "\n";
        s = s + "Your defense is " + this.getDEF() + "\n";
        s = s + "Your intelligence is " + this.getINT() + "\n";
        s = s + "Your dexterity is " + this.getDEX() + "\n";
        s = s + "Your luck is " + this.getLUK();
        return s;
    }
    public void venomousjab(BaseChar other){
         System.out.println(this + " swifty stabs Ogre with a dagger coated with deadly venom.");
         
    } 
    public void shadowassault(BaseChar other){
         System.out.println(this + " disappears into the shadow and pounces on Ogre from behind. Talk about the element of surprise!");
        
    }
    public void viperskiss(BaseChar other){
         System.out.println(this + " plants a quick kiss on Ogre, coating the kissed area with topical poison");
        
    }
    public void executionerswaltz(BaseChar other){
         System.out.println(this + " dances around, throwing knives at Ogre from all angles at the beat of a waltz");
        
    }
}