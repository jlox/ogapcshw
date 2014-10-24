public class BaseChar{
    private double health,maxhealth = 20;
    private double mana,maxmana = 15;
    private double DEX = 10;
    private double STR = 10;
    private double DEF = 10;
    private double LUK = 10;
    private double INT = 10;
    private double CHA = 8;
    private double LVL = 1;
    private double EXP = 0;
    private double maxEXP = (5*LVL+10+(2*LVL));
    private double giveEXP = (LVL*2);
    private String name = "";
    public void inputName(String name){
	this.name = name;
    }
    public String getName(){
	return this.name;
    }
    public void levelUp(){
	this.LVL = LVL + 1;
	this.CHA = CHA + 2;
	this.EXP = 0;
    }
    public double getmaxhealth(){
	    return this.maxhealth;
    }
    public double getmaxmana(){
        return this.maxmana;
    }
    public double gethealth(){
        return this.health;
    }
    public double getmana(){
        return this.mana;
    }
    public double getSTR(){
        return this.STR;
    }
    public double getDEF(){
        return this.DEF;
    }
    public double getINT(){
        return this.INT;
    }
    public double getDEX(){
        return this.DEX;
    }
    public double getLUK(){
        return this.LUK;
    }
    public double getCHA(){
        return this.CHA;
    }
    public double getLVL(){
        return this.LVL;
    }
    public double getEXP(){
        return this.EXP;
    }
    public void addmaxhealth(double boost){
        this.maxhealth = getmaxhealth() + boost;
    }
    public void addmaxmana(double boost){
        this.maxmana = getmaxmana() + boost;
    }
    public void addSTR(double boost){
        this.STR = getSTR() + boost;
    }
    public void addDEF(double boost){
        this.DEF = getDEF() + boost;
    }
    public void addINT(double boost){
        this.INT = getINT() + boost;
    }
    public void addDEX(double boost){
        this.DEX = getDEX() + boost;
    }
    public void addLUK(double boost){
        this.LUK = getLUK() + boost;
    }
}