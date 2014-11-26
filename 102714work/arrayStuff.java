import java.util.*

public class arrayStuff{
    private int[] a ;
    private Random rnd;
    public arrayStuff(int n){
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = 75 + rnd.nextInt(76);
    }
    
    public arrayStuff(){
	this(100);
    }

    public String toString(){
        String s = "";
        for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }
    public static void main(String[] args){
        arrayStuff as = new arrayStuff();
	System.out.println(as);
    }
}
