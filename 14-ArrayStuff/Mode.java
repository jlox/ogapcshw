import java.io.*;
import java.util.*;

public class Mode {

    /*------------ Instance Variables -------------*/
    int[] a;
    Random r;

    /*------------ Constructors -------------*/
    public Mode() {
	this(20,100);
    }

    public Mode(int n) {
	this(n,100);
    }


    /* 
       n - size of the array
       m - max value for each entry
    */
    public Mode(int n,int m){
	r = new Random();
	a = new int[n];
	for (int i=0;i<n;i++){
	    a[i] = r.nextInt(m);
	}
    }

    /*------------  methods -------------*/
		
    public String toString() {
	String s = "";
	for (int i=0;i<a.length;i++)
	    s = s  + a[i]+", ";
	return s;
    }




    public int freq(int n) {
	int count = 0;
	for (int i=0;i<a.length;i++){
	    if (a[i]==n)
		count = count + 1;
	}
	return count;
    }

    public int mode(){
	int count = 0;
	int modeIndex = 0;
	for (int i=0;i<a.length;i++){
	    if (freq(a[i]) > count){
		count = freq(a[i]);
		modeIndex = i;
	    }
	}
	System.out.println("modeval = "+a[modeIndex]);
	return count;
    }

    public int maxIndex(int[] a){
	int result = a[0];
	for (int i=1;1<a.length;i++){
	    if (a[i]>result){
		result = a[1];
	    }
	}
	return result;
    }
    
    public int fastmode(){
	int max = maxVal();
	int[] tallies = new int[max + 1];
	int count = 0;
	for (int i=0;i<a.length;i++){
	    tallies[a[i]] += 1;
	}

	for (int i=0;i<tallies.length;i++){
	    System.out.println(i+": "+tallies[i]);
	}
	int m = maxIndex(tallies);
	return tallies[m];
    }
		
    /*------------  main -------------*/
		
    public static void main(String[] args) {
	int n=20,
	    maxval=20;

	if (args.length > 0){
	    n = Integer.parseInt(args[0]);
	}
	if (args.length > 1){
	    maxval = Integer.parseInt(args[1]);
	}

	Mode m = new Mode(n,maxval);
	// System.out.println(m);
	System.out.println("modecount = "+m.mode());
	System.out.println("modecount = "+m.fastmode());
    }

}
