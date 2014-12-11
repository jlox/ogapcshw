import java.io.*;
import java.util.*;

public class Interval {
    private int low;
    private int high;
    private Random r = new Random();
    private static int numIntervals = 0;

    public Interval(int l, int h) {
	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }

    public Interval() {
	int l = r.nextInt(100);
	int h = l + r.nextInt(100);
	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }

    public String toString() {
	String s =  "[" + low +", " + high + "]";
	return s;
    }

    public static void printstuff(){
	System.out.println("Stuff");
    }

<<<<<<< HEAD
    public int compareTo(Object other){
	/* cast other to the appropriate type and store in a local variable
	   for convenience
	*/
	Interval o = (Interval)other;

	if(this.low == o.low){
	    return this.high-o.high;
	} else {
	    return this.low - other.low;
	}
    }
=======
    public int compareTo(Interval other){
	int result = 0;
	if ((this.low < other.low) && (this.high < other.high)){
	    result = -1;
	} else {
	    if ((this.low > other.low) && (this.high > other.high)){
		result = 1;
	    } else {
		if ((this.low == other.low) && (this.high == other.high)){
		    result = 0;
		}
	    }
	}
	return result;
    }
   
>>>>>>> 61e66d134d25b327d40f8b66116e4dc5ae47ef88
    public static void main(String[] args) {
        /* for (int i=0;i<10;i++) {
	    System.out.println(new Interval());
	}
	*/
	Interval ival = new Interval();
	ival.printstuff(); //normal calling off of an instance
	printstuff(); //printStuff is static; we can call without an instance
	Interval.printstuff(); //we can also call it right off a class

<<<<<<< HEAD
=======
	System.out.println(compareTo(2, 19));

>>>>>>> 61e66d134d25b327d40f8b66116e4dc5ae47ef88
	Interval[] a = new Interval[10];
	for (int i=0;i<a.length;i++){
	    a[i] = new Interval();
	}
    }
}
