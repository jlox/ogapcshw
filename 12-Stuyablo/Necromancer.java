public class Necromancer extends BaseChar{
    private double manaBoost = 10;
    private double intelBoost = 5;
    public void inputName(String name){
        super.inputName(name);
    }
    public String getName(){
        return super.getName();
    }
    public void boost(){
        super.addmaxmana(this.manaBoost);
        super.addINT(this.intelBoost);
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
    public void nightmare(BaseChar other){
        System.out.println(this + " plagues Ogre with nightmares, creating an atmosphere of fear and paranoia.");
        
    }
    public void succubus(BaseChar other){
        System.out.println(this + " summons a succubus who tantalizingly seduces Ogre.");
        
    }
    public void souleater(BaseChar other){
        System.out.println(this + " devours Ogre's soul with the aid of his fiendish minion.");
        
    }
    public void skeletonwar(BaseChar other){
        System.out.println(this + " summons a massive hoard of skeletons that tramples Ogre on their way to the real skeleton war");
        
    }
}