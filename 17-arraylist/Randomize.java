import java.util.*;
import java.io.*;

public class Driver {

    public static void main(String[] args) {
	Random r = new Random();

	// Using ArrayLists // 
	// Completed in class with Derrick during pair-programming //
	ArrayList<Integer> al = new ArrayList();
	ArrayList<Integer> result = new ArrayList();
	for (int i=0;i<10;i++) {
	    al.add(i);
	}
	System.out.println("Default Array thing:");
	System.out.println(al);

	System.out.println(); 

	while (al.size() > 0){
	    for (int x=0;x<al.size();x++) {
		int j = r.nextInt(al.size());
		if (!result.contains(al.get(j))){
		    result.add(al.get(j));
		    al.remove(al.get(j));
		}	    
		    
	    
	    }
	}
	System.out.println("Using ArrayLists:"); 
        System.out.println(result);   

    }
}
