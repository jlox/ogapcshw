public class Archer extends BaseChar{
    private double dexBoost = 10;
    private double luckBoost = 5;
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
    public void blazingarrow(BaseChar other){
        System.out.print(this + " draws back her bow, aiming at Ogre and releases, burning him.");
        //opphealth =  - 1;
    }
    public void icyshot(BaseChar other){
        System.out.println(this + " aims a frozen arrow at Ogre and shoots, freezing the limb it pierces.");
       // opphealth = opphealth - 2;
    }
    public void meteoricarrowshower(BaseChar other){
        System.out.println(this + " shoots up dozens of fiery arrows, letting them all rain down on Ogre like meteors");
       // opphealth = opphealth - 1;
    }
    public void frozendeath(BaseChar other){
        System.out.println(this + "'s arrow hits Ogre in the heart, who is completely overcome by fear as he is slowly engulfed in ice.");
        //opphealth = opphealth - 2;
    }

}