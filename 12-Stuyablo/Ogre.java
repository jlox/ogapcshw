public class Ogre extends BaseChar{
    private double healthBoost = 15;
    public void boost(){
        super.addmaxhealth(this.healthBoost);
    }
}